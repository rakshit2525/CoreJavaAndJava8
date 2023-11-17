package coreJavaTopics.exceptionHandling.throwKeyword;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckFileExistence {
	
	public static void checkFile() throws FileNotFoundException {
		File f = new File("R:\\JavaTraining\\test.txt");
		if(f.exists()) {
			System.out.println("File is found!!");
		} else {
			throw new FileNotFoundException("File is not found in the location mentioned!!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Important Code1.....");
		try {
			checkFile();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} finally {
			System.out.println("Rest of the important code");
		}
	}

}
