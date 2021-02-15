package com.vcentry.classexamples;

public class BankTransaction {

	public static void main(String[] args) {
		
		Account mani = new Account();
		Account keerthana = new Account();
		
		mani.setName("Manikandan");
		
		System.out.println(mani.getName());
		
		mani.setBalance(100.0d);
		
		double balance = mani.getBalance();

		System.out.println("balance is " + balance);
		
		
	}

}
