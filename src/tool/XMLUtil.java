package tool;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLUtil {

	/**
	 * 通过InputStream解组
	 * @param clzz
	 * @param in
	 * @return
	 * @throws JAXBException
	 */
	public static Object toJavaBean(Class clzz,InputStream in) throws JAXBException{
		JAXBContext context = JAXBContext.newInstance(new Class[]{clzz});
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return unmarshaller.unmarshal(in);
	}
	
	
	
	/***
	 * 
	 * xml校验
	 * @param xmlFile 需要校验的xml
	 * @param schemaFile schema文件
	 * @return
	 */
	public boolean checkXMLBySchema(File xmlFile,File schemaFile) {
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		try{
			Schema schema = factory.newSchema(schemaFile);
			Validator validator = schema.newValidator();
			Source source = new StreamSource(xmlFile);
			validator.validate(source);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
