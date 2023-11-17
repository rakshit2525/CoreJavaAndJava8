package coreJavaTopics.innerClasses.nonStaticInnerClass.localInnerClass.realTimeExample;

public class PaymentSettings {
	
	private long cell_number = 9900225566l;
	private String cust_name = "Ramesh";
	private String city = "Dharwad";
	
	public void airtelPaymentBank() {
		class AirtelPaymentSetting {
			void displayAirtelSettingInfo() {
				System.out.println("----------------------- This is Airtel Payment Setting -------------------------------");
				System.out.println("Mobile Number: " + cell_number);
				System.out.println("Customer Name: " + cust_name);
				System.out.println("City: " + city);
			}
		}
		AirtelPaymentSetting airtel = new AirtelPaymentSetting();
		airtel.displayAirtelSettingInfo();
	}
	
	public void paytmWalletSetting() {
		class PaytmWallet {
			void displayPaytmSettingInfo() {
				System.out.println("----------------------- This is Paytm Wallet Setting -------------------------------");
				System.out.println("Mobile Number: " + cell_number);
				System.out.println("Customer Name: " + cust_name);
				System.out.println("City: " + city);
			}
		}
		PaytmWallet paytm = new PaytmWallet();
		paytm.displayPaytmSettingInfo();
	}
	
	public void amazonWalletSetting() {
		class AmazonWallet {
			void displayPaytmSettingInfo() {
				System.out.println("----------------------- This is Amazon Wallet Setting -------------------------------");
				System.out.println("Mobile Number: " + cell_number);
				System.out.println("Customer Name: " + cust_name);
				System.out.println("City: " + city);
			}
		}
		AmazonWallet amazon = new AmazonWallet();
		amazon.displayPaytmSettingInfo();
	}
	
	public static void main(String[] args) {
		PaymentSettings payment = new PaymentSettings();
		payment.airtelPaymentBank();
		payment.paytmWalletSetting();
		payment.amazonWalletSetting();
	}
}
