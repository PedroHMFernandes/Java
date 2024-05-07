package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Pedro", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 1000.0, 500.0);
		SavingsAccount sacc = new SavingsAccount(1003, "Felipe", 1000.0, 0.01); 
		
		sacc.withdraw(200);
		System.out.println(sacc.getBalance());
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		bacc.withdraw(200);
		System.out.println(bacc.getBalance());
		   
		// UPCASTING
		// Atribuir um objeto da subclasse para a superclasse
		Account acc1= bacc;
		Account acc2 = new BusinessAccount(1004, "Roberto", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Lucca", 0.0, 0.01);
		
		// DOWNCASTING
		// Atribuir um objeto da superclasse para a subclasse
		BusinessAccount acc4 = (BusinessAccount) acc1;  
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
