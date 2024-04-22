package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramBankAccount {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDepositVerification = sc.next().toLowerCase().charAt(0);

		BankAccount currentAccount;

		if (initialDepositVerification == 'y') {
			System.out.print("Enter initial deposit value: $");
			double initialDeposit = sc.nextDouble();
			currentAccount = new BankAccount(accountNumber, holderName, initialDeposit);
		} else {
			currentAccount = new BankAccount(accountNumber, holderName);
		}

		System.out.println("\nAccount data:");
		System.out.println(currentAccount.toString());

		System.out.print("\nEnter a deposit value: $");
		double deposit = sc.nextDouble();
		currentAccount.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(currentAccount.toString());

		System.out.print("\nEnter a withdraw value: $");
		double withdraw = sc.nextDouble();
		currentAccount.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(currentAccount.toString());

		sc.close();
		
		
	}
}
