package esb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;


public class FileTest {
	public static void main(String[] args) throws Exception {
		String folderUrl = "C:\\Users\\liuhuan\\Desktop\\20151101";
		String checkStr = "3200002904348004";
		File fileDir = new File(folderUrl);
		File[] fileList = fileDir.listFiles();
		
		for (File file : fileList) {
			System.out.println("--------------start..checkFile===" + file.getName());
			Reader r = new FileReader(file);
			BufferedReader br = new BufferedReader(r);
			String str = "";
			while((str = br.readLine()) != null){
				if(str.indexOf(checkStr) != -1){
					System.out.println(str);
					break;
				}
			}
			br.close();
			System.out.println("end..checkFile===" + file.getName()+"\n");
		}
	}
}
