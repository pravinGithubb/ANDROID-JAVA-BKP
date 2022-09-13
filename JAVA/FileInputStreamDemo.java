	package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		File file = new File("C:\\test\\Java\\sample.txt");
		
		try {
			FileInputStream fin = new FileInputStream(file);
			InputStreamReader stream = new InputStreamReader(fin);
			BufferedReader reader = new BufferedReader(stream);
			
			String str = "";
			
			while ((str = reader.readLine())!=null) {
				System.out.println(str);
			}
			
			/*
			 * int i = 0;
			 * 
			 * while((i=fin.read())!=-1) { System.out.print((char)i); }
			 */
			
		
			
			fin.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
