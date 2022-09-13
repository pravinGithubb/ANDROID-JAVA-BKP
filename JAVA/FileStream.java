package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) {
		
		String message = "Hello guys.. gud evening";
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\test\\Java\\sample.txt");
			fout.write(message.getBytes());
			fout.close();
			
			System.out.println("Record saved.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
