package cn.m2;



public class TestMain1 {
	
	
	public static void main(String[] args) {
		String rep = "　";//中文全角空格
		String str1 = "AA　";
		String str2 = "AA ";
		System.out.println(str1.replaceAll(rep, ""));
		System.out.println(str2.trim());
	}
	
}
