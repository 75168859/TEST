package cn.comm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

public class FileList {

	public static void main(String[] args) {
		File file = new File("D:\\workspace\\cpbank\\files\\22\\aaa.txt");
		
		if(!file.exists()){
			System.out.println(false);
		}else{
			System.out.println(true);
			
		}
		
		try {
//			System.out.println(Object.class.getResource("/").getPath());
//			if(!file.getParentFile().exists()){
//				file.getParentFile().mkdirs();
//			}
//			System.out.println(file.getAbsolutePath());
			/*Document document = DocumentHelper.createDocument();
			Element datafile = document.addElement("DATAFILE");
			document.setXMLEncoding("gbk");
			// ͷ
			Element datahead = datafile.addElement("DATAHEAD");
			datahead.addElement("DATA_NAME").addText("��ݽӿ����");
			datahead.addElement("DATA_TYPE").addText("��ݴ�������");
			datahead.addElement("ROW_NUM").addText("��ݼ�¼����");
			datahead.addElement("PAGE_NUM").addText("���ҳ��");
			datahead.addElement("FIELD_NUM").addText("���������");

			OutputStream out = new FileOutputStream(file);
			Writer writerf = new OutputStreamWriter(out, "UTF-8");// �ļ��ı���(�ļ����Ϊ)
			XMLWriter writer = new XMLWriter(writerf);
			
			
			
			
			writer.write(document);
			writer.close();
			out.close();*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	final static void showAllFiles(File dir) throws Exception {
		File[] fs = dir.listFiles();
		for (int i = 0; i < fs.length; i++) {
//			System.out.println(fs[i].getAbsolutePath());
			System.out.println("<library>" + fs[i].getName() + "</library>");
			if (fs[i].isDirectory()) {
				try {
					showAllFiles(fs[i]);
				} catch (Exception e) {
				}
			}
		}
	}

}
