package application;

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class ProgramDollar {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price: $");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought: ");
		double dollarQuantity = sc.nextDouble();

		double amountInReais = CurrencyConverter.dollarToReais(dollarPrice, dollarQuantity);

		System.out.printf("Amount to be paid in reais: R$%.2f", amountInReais);

		sc.close();
	}
}
