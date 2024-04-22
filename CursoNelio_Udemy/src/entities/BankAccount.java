package entities;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String holderName;

	public BankAccount(int accountNumber, String ownerName) {
		this.accountNumber = accountNumber;
		this.holderName = ownerName;
	}

	public BankAccount(int accountNumber, String ownerName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = ownerName;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String ownerName) {
		this.holderName = ownerName;
	}

	public void withdraw(double value) {
		balance -= value + 5.00;
	}

	public void deposit(double value) {
		balance += value;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holderName + " | Balance: $"
				+ String.format("%.2f", balance);
	}

}
