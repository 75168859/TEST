package cn.comm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

/**
 * 发送报文
 * @author liuhuan
 *
 */
public class TestSender {
	
	static{
		System.setProperty("LOG_SYS", "YWYY_LOG");
	}
	private static Properties properties = new Properties();
	
	public static void main(String[] args) {

		try {
				init();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			for (Enumeration e = properties.elements(); e.hasMoreElements();){
				File[] filesList = getFileList(e.nextElement());
				System.out.println(Arrays.toString(filesList));
			}
			Iterator it = properties.keySet().iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
	}
	
	private static File[] getFileList(Object nextElement) {
		System.out.println("nextElement===" + nextElement);
		File f = new File((String)nextElement);
		if(f.isDirectory()){
			return f.listFiles();
		}
		return null;
	}

	private static void init() throws IOException {
		InputStream in = null;
		try {
			File f = new File(properties.getClass().getResource("/").getPath());
			String xiegang = File.separator;
			String conf_name = (new StringBuilder()).append(f).append(xiegang)
					.append("sendconf.properties").toString();
			in = new FileInputStream(conf_name);
			properties.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
