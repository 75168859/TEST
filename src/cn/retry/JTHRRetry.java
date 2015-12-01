package cn.retry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class JTHRRetry {

	public static void main(String[] args){
		Properties properties = new Properties();
		InputStream in = null;
		try{
		///esb_prod/esb_proj/
		String projPath = JTHRRetry.class.getClass().getResource("/").getPath();
		File configFile = new File(projPath + "jthrRetry.properties");
		in = new FileInputStream(configFile);
		properties.load(in);
		in.close();
		
		String folderUrl = properties.getProperty("RETRY_FILE_FOLDER");
		System.out.println(folderUrl);
		File fileDir = new File(folderUrl);
		File[] fileList = fileDir.listFiles();
		for (File file : fileList) {
			
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
