package coreJavaTopics.abstraction.multipleInheritanceWithInterface.solutionForMIWithInterface;

public class AccountBeneficiaryDetails implements IAccountService, IBeneficiaryService{

	@Override
	public void addBeneficiary() {
		System.out.println("Beneficiary added");
	}

	@Override
	public void deleteBeneficiary() {
		System.out.println("Beneficiary deleted");
	}

	@Override
	public void updateBeneficiary() {
		System.out.println("Beneficiary updated");
	}

	@Override
	public void getaccountDetails() {
		System.out.println("Account Number: 9985632147");
		System.out.println("Branch Name: HDFC Branch");
		System.out.println("Name: Ramesh");
		System.out.println("Balance: 50,000/-");
	}

	@Override
	public void isAccountActive() {
		System.out.println("Account is active");
	}
	
	//there is same methodM in both the interfaces, but since it is just declared there and 
	//we are providing the implementation in the implementation class there will be no ambiguity
	/*
	 * @Override 
	 * public void methodM() {}
	 */
	
	public static void main(String[] args) {
		AccountBeneficiaryDetails details = new AccountBeneficiaryDetails();
		details.getaccountDetails();
		System.out.println("-----------------------------");
		details.addBeneficiary();
	}



}
