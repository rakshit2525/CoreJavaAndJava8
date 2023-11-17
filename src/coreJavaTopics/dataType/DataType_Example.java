package coreJavaTopics.dataType;

public class DataType_Example {
	
	int intNum;
	short shortNum;
	char charA;
	long longNum;
	double doubleNum;
	float floatNum;
	byte byteNum;
	boolean flag;
	DataType_Example obj;

	public static void main(String[] args) {
		
		//create object to access the non-static variables
		DataType_Example obj = new DataType_Example();
		System.out.println("Int default value: " + obj.intNum);
		System.out.println("Short default value: " + obj.shortNum);
		System.out.println("Char default value: " + obj.charA);
		System.out.println("Long default value: " + obj.longNum);
		System.out.println("Double default value: " + obj.doubleNum);
		System.out.println("Float default value: " + obj.floatNum);
		System.out.println("Byte default value: " + obj.byteNum);
		System.out.println("Boolean default value: " + obj.flag);
		System.out.println("DataType_Example (Class Object) default value: " + obj.obj);
		
	}

}
