package test;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Properties;

public class TestFile {
	
	private static Properties pro = new Properties();
	
	int aa = 1;
	
	public static void main(String[] args) {
		try {
			pro.load(TestFile.class.getClassLoader().getResourceAsStream("files.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(pro.get("1"));
		
		int aa = 2;
		System.out.println(aa);
		
	}
}
