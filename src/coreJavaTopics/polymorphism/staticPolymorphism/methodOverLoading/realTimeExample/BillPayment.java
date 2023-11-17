package coreJavaTopics.polymorphism.staticPolymorphism.methodOverLoading.realTimeExample;

public class BillPayment {
	
	long acc_num;
	String bank_name;
	long electric_meter_number;
	String due_date;
	String locality_address;
	double electricity_bill_amt;
	
	long dth_cust_id;
	String cust_name;
	double dth_monthly_payment;
	String dth_package;
	
	long gasNumber;
	double gas_amount;
	String service_provider;
	
	static void makePayment(long acc_num, String bank_name, long electric_meter_number, String due_date, String locality_address, double electricity_bill_amt) {
		System.out.println("------------------------ Electricity Payment ----------------------");
		System.out.println("Bank Account Number: " + acc_num);
		System.out.println("Bank Name: " +bank_name);
		System.out.println("Meter Number: " + electric_meter_number);
		System.out.println("Due Date: " + due_date);
		System.out.println("Locality Address: " + locality_address);
		System.out.println("Bill Amount: " + electricity_bill_amt);
		System.out.println("");
	}
	
	static void makePayment(long dth_cust_id, String cust_name, double dth_monthly_payment, String dth_package) {
		System.out.println("------------------------ DTH Payment ----------------------");
		System.out.println("Customer ID: " + dth_cust_id);
		System.out.println("Customer Name: " + cust_name);
		System.out.println("DTH Package: " + dth_package);
		System.out.println("Monthly Payment: " + dth_monthly_payment);
		System.out.println("");
	}
	
	static void makePayment(long gasNumber, double gas_amount, String service_provider) {
		System.out.println("------------------------ Gas Payment ----------------------");
		System.out.println("Gas Number: " + gasNumber);
		System.out.println("Service Provider: " + service_provider);
		System.out.println("Gas Payment Amount: " + gas_amount);
	}
	
}
