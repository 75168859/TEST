package cn.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLTest {

	public static void main(String[] args) throws Exception {
		String fileUrl = "D:\\workspace\\test\\92260200000_CST_FACTOR_I_0000_20150531_A_0001_0001.xml";
		File f = new File(fileUrl);
		String t = f.getName();
		System.out.println(t.substring(0, t.lastIndexOf(".")));
	}
}
