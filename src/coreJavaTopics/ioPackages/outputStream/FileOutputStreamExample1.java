package coreJavaTopics.ioPackages.outputStream;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {
		
		//create the object of FileOutputStream and pass the fully 
		//qualified location of the file
		try {
			//the below code writes the data on already existing text file
			FileOutputStream fout = new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\FileOutputStreamExample1.txt");
			fout.write(106);
			fout.close();
			System.out.println("Data Written Successfully ............. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
