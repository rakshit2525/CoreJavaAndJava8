package coreJavaTopics.ioPackages.outputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {

		try {
			
			File file = new File("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\BufferedOutputStreamExample.txt");
			FileOutputStream fout = new FileOutputStream(file);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String sentence = "Coding is like poetry should be short and concise";
			byte[] b = sentence.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
			System.out.println("This is an example of BufferedOutputStream Class....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
