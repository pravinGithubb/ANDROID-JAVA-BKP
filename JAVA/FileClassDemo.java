package file_handling;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) {
		
		String fileName = "sample1.txt";
		String root = "C:\\test";
	
		File mFile = new File(root, "Java");
		
		//System.out.println(mFile.getAbsolutePath());
		
		if(!mFile.exists()) {
			mFile.mkdir();
			System.out.println("Directory created");
		}
		
		//File file = new File("C:\\test\\Java", fileName);
		File file = new File(mFile, fileName);
		
		if(file.exists()) {
			System.out.println("File already created");
			
		}else {
			try {
				if(file.createNewFile()) {
					System.out.println("File successfully created");

				}else {
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		//File file = new File("C:\\test34\\Java\\"+fileName);
	
	}
	
}
