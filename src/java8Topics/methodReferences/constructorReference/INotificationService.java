package java8Topics.methodReferences.constructorReference;

@FunctionalInterface
public interface INotificationService {

	Notification getNotified(String message);
	
}
