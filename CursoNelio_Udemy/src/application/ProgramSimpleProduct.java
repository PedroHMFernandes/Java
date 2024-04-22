package application;

import entities.SimpleProduct;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSimpleProduct {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of products:");
		int n = sc.nextInt();
		SimpleProduct[] arrayProducts = new SimpleProduct[n];

		for (int i = 0; i < arrayProducts.length; i++) {
			sc.nextLine();
			System.out.print(i+1 +"º " + "Product name: ");
			String name = sc.nextLine();
			System.out.print(name + " Product price: $");

			double price = sc.nextDouble();
			arrayProducts[i] = new SimpleProduct(name, price);
		}

		double priceSum = 0;
		for (int i = 0; i < arrayProducts.length; i++) {
			priceSum += arrayProducts[i].getPrice();
		}

		double averagePrice =  priceSum / arrayProducts.length ;
		System.out.printf("Average price: $%.2f", averagePrice);
		
		sc.close();
	}
}
