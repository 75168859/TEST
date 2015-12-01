package cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class DT {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = "";
			while(!(s=br.readLine()).equalsIgnoreCase("exit")){
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
