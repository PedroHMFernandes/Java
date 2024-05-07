package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> productsList = new ArrayList<Product>();
		System.out.print("Enter the number of products: ");
		int productsNumber = sc.nextInt();

		for (int i = 0; i < productsNumber; i++) {
			System.out.printf("Product #%d data:\n", i + 1);
			System.out.print("Common, used or imported (c/u/i): ");
			char productType = sc.next().toLowerCase().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				productsList.add(product);
			} else if (productType == 'u') {
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.print("Manufacture date (dd/MM/yyyy): ");
				sc.nextLine();
				String dateString = sc.nextLine();
				LocalDate manufactureDate = LocalDate.parse(dateString, dateFormat);
				Product product = new UsedProduct(name, price, manufactureDate);
				productsList.add(product);
			} else if (productType == 'c') {
				Product product = new Product(name, price);
				productsList.add(product);
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		for(Product product: productsList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
