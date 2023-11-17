package coreJavaTopics.ioPackages.inputStream;

import java.io.FileInputStream;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\FileInputStreamExample2.txt");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
