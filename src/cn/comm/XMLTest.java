package cn.comm;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class XMLTest {
	
	@Test
	public  void createRFile() throws Exception {

//		File file = new File("out.xml");
//		File file = new File("bank.xml");
		File file = new File("output.dat");
		InputStream is = new FileInputStream(file);
		byte[] byteArr = new byte[(int) file.length()];
		is.read(byteArr);
		is.close();
		
		String fstr = new String(byteArr,"utf-8");
		
		byte[] fbyte = fstr.getBytes("utf-8");
		String str = new String(fbyte, "utf-8");
		
		FileOutputStream fos  = new FileOutputStream( "output2.dat" ); 
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8"); 
        osw.write(str); 
        osw.flush(); 
        osw.close();

        
	}
	
	@Test
	public void readXMLByDOM4J() throws Exception {
		SAXReader reader = new SAXReader();
		Document document = reader.read("test2.xml");
		Element root = document.getRootElement();
		for (Iterator i = root.elementIterator(); i.hasNext();) {
			Element element = (Element) i.next();
			/*
			 * for(Iterator j = element.elementIterator(); j.hasNext(); ){
			 * Element element2 = (Element) j.next();
			 * System.out.println(element2.getName() +"==" +
			 * element2.getTextTrim()); }
			 */
		}
	}
	
	

	@Test
	public void createXML() throws IOException {
		Document document = DocumentHelper.createDocument();
		Element datafile = document.addElement("DATAFILE");
//		document.setXMLEncoding("UTF-8");
		// 头
		Element datahead = datafile.addElement("DATAHEAD");
		datahead.addElement("DATA_NAME").addText("数据接口名称");
		datahead.addElement("DATA_TYPE").addText("数据处理类型");
		datahead.addElement("ROW_NUM").addText("数据记录条数");
		datahead.addElement("PAGE_NUM").addText("数据页数");
		datahead.addElement("FIELD_NUM").addText("数据域数量");

		// 字段
		Element fields = datafile.addElement("FIELDS");
		fields.addElement("FIELD").addAttribute("ID", "1").addText("字段1英文名");
		fields.addElement("FIELD").addAttribute("ID", "2").addText("字段2英文名");


		OutputFormat format = OutputFormat.createCompactFormat();
		format.setEncoding("utf-8");//<?xml version="1.0" encoding="utf-8"?>
		
		OutputStream out = new FileOutputStream(new File("bank.xml"));
		Writer writerf = new OutputStreamWriter(out,"utf-8");
		XMLWriter writer = new XMLWriter(writerf);
//		XMLWriter writer = new XMLWriter(new FileWriter(new File("bank.xml")),format);
		
		writer.write(document);
		writer.close();
		out.close();

	}

	@Test
	public void testGBK() {
		try {
			byte[] byteArr = "测试".getBytes("ISO-8859-1");
			OutputStream os = new FileOutputStream(new File("test.dat"));
			os.write(byteArr);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testJY(){
		try {
//			File file = new File("CP_YW_GL_DEPOSIT_HEADER_I_23_YWHJXB_2015041610091102604972.dat");
			File file = new File("jthr.dat");
			InputStream is = new FileInputStream(file);
			byte[] byteArr = new byte[(int) file.length()];
			is.read(byteArr);
			is.close();
			
			OutputStream os = new FileOutputStream(new File("jthr2.dat"));

			String str = new String(byteArr, "GB2312");
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			osw.write(str);
			osw.flush();
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fileSize(){
		String fileurl = "D:\\workspace\\esb_proj\\receive\\YWYY\\CP_YW_GL_DAILY_REPORT_I.YWYY_20150407000000779019_001.dat";
		boolean b = false;
		File f = new File(fileurl);
		long len = f.length();
		if (len > 0x100000)//100K=0x19000; 1024*1024=0x100000=1M,
			b = true;
		System.out.println(b);
	}
	
	@Test
	public void zifuji(){
		String messtr = "你好你好";
		try {
			byte[] bytes = messtr.getBytes("utf-8");
			String str = new String(bytes, "utf-8");
			System.out.println(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(System.getProperty("file.encoding"));
	}
	
	

	
}
