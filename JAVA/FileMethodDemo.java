package file_handling;

import java.io.File;

public class FileMethodDemo {

	public static void main(String[] args) {
		
		File file = new File("C:\\");
		
		/*
		 * String[] array = file.list();
		 * 
		 * for(String str : array) { System.out.println(str); }
		 */
		
		File[] fileArray = file.listFiles();
		
		for(File f : fileArray) {
			System.out.println(f.getName()+" : "+"isHidden =>"+f.isHidden()+" isReadOnly =>"+f.canRead()+" isReadAndWrite => "+f.canWrite()+" isDir => "+f.isDirectory());
		}
		
	}
	
}
