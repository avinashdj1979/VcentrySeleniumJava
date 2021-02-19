package edu.vcentry.classes.midlevel;

public class Account {
	//Fields, Member variables, instance variables
	private String accountNumber;
	private String customerName;
	private String mobileNumber;
	private double balance;
	
	public Account() {
		System.out.println("I am in Constructor");
	}

	/**
	 * @param accountNumber
	 * @param customerName
	 * @param mobileNumber
	 * @param balance
	 */
	public Account(String accountNumber, String customerName, String mobileNumber, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}

	/**
	 * @param accountNumber
	 * @param customerName
	 * @param mobileNumber
	 */
	public Account(String accountNumber, String customerName, String mobileNumber) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
