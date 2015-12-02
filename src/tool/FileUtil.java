package tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileUtil {

	/**
	 * 从文件夹中查找指定字符串
	 * @param folderUrl 需要遍历的文件夹  路径  如： C:\\Users\\liuhuan\\Desktop\\20151101
	 * @param checkStr 需要查找的字符串
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void searchStrFromFolder(String folderUrl,String checkStr) throws FileNotFoundException,
			IOException {
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
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String folderUrl = "C:\\Users\\liuhuan\\Desktop\\20151101";
		String checkStr = "3200002904348004";
		searchStrFromFolder(folderUrl,checkStr);
	}
	
}
