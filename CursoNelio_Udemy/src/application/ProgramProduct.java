package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");

		Product product1 = new Product(name, price);

		System.out.println("\nProduct data: " + product1.toString());

		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product1.AddProducts(quantity);
		System.out.println("\nUpdated data: " + product1.toString());

		System.out.print("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product1.RemoveProducts(quantity);
		System.out.println("\nUpdated data: " + product1.toString());

		sc.close();
	}
}
