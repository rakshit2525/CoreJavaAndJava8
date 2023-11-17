package java8Topics.methodReferences.staticMethod;

public class DataAssetImpl {
	
	public static void main(String[] args) {
		IDataAssetService service = DataAssetImpl::displayAssetDetails;
		service.displayAssetDetails();
	}
	
	public static void displayAssetDetails() {
		System.out.println("Asset ID: 6659874");
		System.out.println("Data Asset Name: Facility Org");
		System.out.println("Data Asset Description: This is one of the asset of the bank");
		System.out.println("Owner ID: 3325");
		System.out.println("Status Code: 25986");
		System.out.println("Group ID: 12344");
		System.out.println("Asset Version: 989");
		System.out.println("Asset Accessability: Private");
	}
}	
