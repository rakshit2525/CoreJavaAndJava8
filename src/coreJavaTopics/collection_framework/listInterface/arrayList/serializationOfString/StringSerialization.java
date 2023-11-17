package coreJavaTopics.collection_framework.listInterface.arrayList.serializationOfString;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StringSerialization {

	public static void main(String[] args) {
		
		//since the String class already implements Serializable interface
		//there is no need for this class to implement it
		//creating an ArrayList of String object
		ArrayList<String> squadOfIndia = new ArrayList<String>();
		squadOfIndia.add("R Sharma");
		squadOfIndia.add("V Kohli");
		squadOfIndia.add("K L Rahul");
		squadOfIndia.add("S Iyer");
		squadOfIndia.add("I Kishan");
		squadOfIndia.add("R Jadeja");
		squadOfIndia.add("M Shami");
		squadOfIndia.add("M Siraj");
		
		try {
			
			//Serialization
			/*
			FileOutputStream fout = new FileOutputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\IndianCricketTeam.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(squadOfIndia);
			oout.close();
			fout.close();
			System.out.println("Serialization of String ArrayList of String Object successfull......");
			*/
			
			//De-serialization
			FileInputStream fis = new FileInputStream("R:\\JavaTraining\\CoreJavaSessions\\src\\coreJavaTopics\\ioPackages\\files\\IndianCricketTeam.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> players = (ArrayList<String>) ois.readObject();
			System.out.println(players);
			ois.close(); 
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
