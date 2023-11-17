package coreJavaTopics.exceptionHandling.multipleCatchBlocks;

public class MultipleCatchBlockExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("Important Code1.....");
			String name = "";
			int arr[] = new int[5];
			arr[9] = 20/0;
			System.out.println("The number at " + arr[9]);
			System.out.println("Length of the name: " + name.length());
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		System.out.println("Important Code2.....");
	}

}
