package tool;

import java.io.IOException;
import java.util.Properties;

public class SysProperties {
	
	private static Properties pro = new Properties();
	
	
	static{
		try {
			pro.load(SysProperties.class.getClassLoader().getResourceAsStream("properties.properties"));
		} catch (IOException e) {
		  
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(pro.getProperty("aaa"));
	}
	
	
}
