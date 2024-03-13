package poo;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProgramProduct {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product1 = new Product();

		System.out.println("Enter product data:");	
		
		System.out.print("Name: ");
		product1.name = sc.nextLine();
		System.out.print("Price: ");
		product1.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product1.quantity = sc.nextInt();
		
		product1.ShowProducts();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		product1.AddProducts(add);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int remove = sc.nextInt();
		product1.RemoveProducts(remove);
		
		sc.close();
	}
}
