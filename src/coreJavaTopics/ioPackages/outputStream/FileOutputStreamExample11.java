package coreJavaTopics.ioPackages.outputStream;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExample11 {

	public static void main(String[] args) {
		
		//create the object of FileOutputStream and pass the fully 
		//qualified location of the file
		try {
			//the below code creates a file and then writes the data on that file
			File file = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\FileOutputStreamExample11.txt");
			FileOutputStream fout = new FileOutputStream(file);
			fout.write(71);
			fout.close();
			System.out.println("Data Written Successfully.......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
