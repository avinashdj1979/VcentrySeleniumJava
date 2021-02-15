package edu.vcentry.classes.basic01;

public class Account {

	private String accountNumber;
	private String customerName;
	private String mobileNumber;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber; 
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println(String.format("My New Balance is \u20B9 %.2f ", balance));
	}
	
	public void withdraw(double amount) {
		if((balance - amount) < 0) {
			System.out.println("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println(String.format("My New Balance is \u20B9 %.2f ", balance));
		}

	}
}

// Encapsulation
