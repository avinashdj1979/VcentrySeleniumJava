package edu.vcentry.classes.basic01;

public class BankTransaction {

	public static void main(String[] args) {
		
		Account dhans = new Account();
		
		dhans.setAccountNumber("A001");
		
		System.out.println(String.format("Dhan's account number is %s", dhans.getAccountNumber()));
		
		dhans.deposit(100.0d);
		
		dhans.getBalance();
	
		dhans.withdraw(99.0d);
	}
}
