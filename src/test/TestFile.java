package test;

import java.io.IOException;
import java.util.Properties;

public class TestFile {
	
	private static Properties pro = new Properties();
	
	
	public static void main(String[] args) {
		try {
			pro.load(TestFile.class.getResourceAsStream("./files.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(pro.get("1"));
	}
}
