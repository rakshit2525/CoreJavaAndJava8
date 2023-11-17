package java8Topics.predefinedFunctionalInterfaces.predicateInterface;

import java.util.function.Predicate;

public class SavingAccountTestPredicate {

	public static void main(String[] args) {
		
		Predicate<SavingAccount> predicate = (balance) -> balance .getAcc_balance() > 2000.0;
		boolean result = predicate.test(new SavingAccount(896574123l, "Ramesh", 2500.0d));
		System.out.println(result);
	}
}
