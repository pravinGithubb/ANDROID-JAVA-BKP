package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	
	private int id;
	private String name;
	private String email;
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	
	
	
}

public class SerializationDemo {

	public static void main(String[] args) {
		
	User user = new User(12, "Tops","tops@gmail.com");
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\test\\Java\\sample1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(user);
			out.close();
			fout.close();
			
			System.out.println("Record saved.");
			
			FileInputStream fin = new FileInputStream("C:\\test\\Java\\sample1.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			User mUser = (User) in.readObject();
			System.out.println(mUser.getId()+","+mUser.getName());
			
			in.close();
			fin.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
