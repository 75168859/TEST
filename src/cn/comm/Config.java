package cn.comm;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Config {
	private static PropertyResourceBundle prb;
	
	static{
		prb = (PropertyResourceBundle)ResourceBundle.getBundle("cn/config/config");
	}
	
	public static String getString(String key){
		return prb.getString(key);
	}
	
	
	public static void main(String[] args) {
		System.out.println(Config.getString("BB"));
		System.out.println(prb.getClass().getResource("/cn"));
	}
	
	
	
	

}
