package cn.comm.jax;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class XmlToBean {

	@Test
	public void xml2Bean() throws JAXBException{
		File f = new File("D:\\workspace\\test\\src\\营业日报XML结构.xml");
		JAXBContext context = JAXBContext.newInstance(CpYwGlDailyReportIList.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		CpYwGlDailyReportIList list = (CpYwGlDailyReportIList) unmarshaller.unmarshal(f);
		System.out.println(list.size());
		for(HeaderElement he : list){
			System.out.println(he.getCpYwGlDailyReportI().getSrcLineId());
		}
	}
}





