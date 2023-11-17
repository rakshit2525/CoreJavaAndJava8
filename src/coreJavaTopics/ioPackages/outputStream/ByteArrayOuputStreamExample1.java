package coreJavaTopics.ioPackages.outputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteArrayOuputStreamExample1 {

	public static void main(String[] args) {
		
		try {
			
			File file1 = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\BAOSExample11.txt");
			File file2 = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\BAOSExample12.txt");
			
			FileOutputStream fout1 = new FileOutputStream(file1);
			FileOutputStream fout2 = new FileOutputStream(file2);
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(75);
			
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			
			bout.flush();
			bout.close();
			fout1.close();
			fout2.close();
			
			System.out.println("Common data written to multiple files ..........");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
