package edu.vcentry.classes.practice;

public class BankTransactions {

	public static void main(String[] args) {
		
		Account myAccount = new Account();
		myAccount.setBalance(100.0d);
		myAccount.deposit(50.0d);
		myAccount.withdraw(100.0d);
		
		
		Account jaiGanesh = new Account();
		jaiGanesh.addNewCustomer("A001", "Jai Ganesh", "2018462635");
		
		System.out.println(String.format("Jai's account number is %s", jaiGanesh.getAccountNumber()));
	}

}
