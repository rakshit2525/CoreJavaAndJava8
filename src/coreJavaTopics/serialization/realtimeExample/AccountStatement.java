package coreJavaTopics.serialization.realtimeExample;

import java.io.Serializable;

public class AccountStatement implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long cust_id;
	private long acc_num;
	private String holder_name;
	private String branch;
	private long branch_code;
	private String city;
	private long cell_num;
	private String pan_card;
	private double over_draft_limit;
	private String acc_status;
	private double acc_balance;
	
	public AccountStatement(long cust_id, long acc_num, String holder_name, String branch, long branch_code,
			String city, long cell_num, String pan_card, double over_draft_limit, String acc_status,
			double acc_balance) {
		super();
		this.cust_id = cust_id;
		this.acc_num = acc_num;
		this.holder_name = holder_name;
		this.branch = branch;
		this.branch_code = branch_code;
		this.city = city;
		this.cell_num = cell_num;
		this.pan_card = pan_card;
		this.over_draft_limit = over_draft_limit;
		this.acc_status = acc_status;
		this.acc_balance = acc_balance;
	}

	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	public long getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(long branch_code) {
		this.branch_code = branch_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getCell_num() {
		return cell_num;
	}

	public void setCell_num(long cell_num) {
		this.cell_num = cell_num;
	}

	public String getPan_card() {
		return pan_card;
	}

	public void setPan_card(String pan_card) {
		this.pan_card = pan_card;
	}

	public double getOver_draft_limit() {
		return over_draft_limit;
	}

	public void setOver_draft_limit(double over_draft_limit) {
		this.over_draft_limit = over_draft_limit;
	}

	public String getAcc_status() {
		return acc_status;
	}

	public void setAcc_status(String acc_status) {
		this.acc_status = acc_status;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	
}
