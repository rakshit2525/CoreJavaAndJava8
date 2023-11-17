package coreJavaTopics.exceptionHandling.throwsKeyword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordExample {
	
	public static void getFile() throws FileNotFoundException {
		FileReader reader = new FileReader("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\test.txt");
		BufferedReader buff = new BufferedReader(reader);
		System.out.println(buff);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		System.out.println("Important Code 1....");
		try {
			getFile();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}
		System.out.println("Rest of the code......");
	}
}
