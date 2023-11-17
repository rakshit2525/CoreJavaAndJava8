package java8Topics.methodReferences.constructorReference;

public class NotificationDetails {

	public static void main(String[] args) {
		
		INotificationService message = Notification::new;
		message.getNotified("Dear Customer, you have done 01 out of 05 free transactions at SBI ATMs!");
	}
}
