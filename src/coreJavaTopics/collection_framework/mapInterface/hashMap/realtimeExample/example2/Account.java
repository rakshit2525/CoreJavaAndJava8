package coreJavaTopics.collection_framework.mapInterface.hashMap.realtimeExample.example2;

public class Account {
	
	long acc_num;
	String acc_holder_name;
	String city;
	
	public Account(long acc_num, String acc_holder_name, String city) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.city = city;
	}

	public long getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}

	public String getAcc_holder_name() {
		return acc_holder_name;
	}

	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", city=" + city + "]";
	}
	
}
