package coreJavaTopics.ioPackages.inputStream;

import java.io.FileInputStream;

public class FileInputStreamExample1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\BAOSExample11.txt");
			int i = fis.read();
			System.out.println((char)i);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
