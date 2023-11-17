package java8Topics.methodReferences.instanceMethod;

public class RequestDetails implements IRequestService{

	public static void main(String[] args) {
		
		RequestDetails details = new RequestDetails();
		IRequestService service = details::requestForChequeBook;
		service.requestForChequeBook();
		
	}
	
	public void requestForChequeBook() {
		System.out.println("Customer Name: Ramesh");
		System.out.println("Address: 4/11A, Richmond Street");
		System.out.println("City: Mysore");
		System.out.println("State: Karnataka");
	}
}
