package coreJavaTopics.innerClasses.nonStaticInnerClass.anonymousInnerClass;

public class TestAnonymousInnerClass {
	
	public static void main(String[] args) {
		
		ITransferService service = new ITransferService() {
			
			@Override
			public void thirdPartyPayment() {
				System.out.println("This is Third Party Payment Method");
			}
			
			@Override
			public void impsTransfer() {
				System.out.println("This is IMPS Transfer Method");
			}
		};
		
		service.thirdPartyPayment();
		service.impsTransfer();
	}
}
