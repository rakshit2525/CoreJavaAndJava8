package coreJavaTopics.ioPackages.outputStream;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExample2 {

	public static void main(String[] args) {
		
		try {
			File file = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\FileOutputStreamExample2.txt");
			FileOutputStream fout = new FileOutputStream(file);
			String statement = "This is an example for FileOutputStream to write an array of bytes";
			byte[] b = statement.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Data Written Successfully......."); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
