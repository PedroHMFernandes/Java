package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
		ShowProducts(true);
	}
	
	public void RemoveProducts(int quant) {
		this.quantity -= quantity;
		ShowProducts(true);
	}
	
	public void ShowProducts(boolean updated)  {
		if(!updated) {
		System.out.printf("Product data: %s, $ %.2f, %d unist, Total: $ %.2f\n",
				name, price, quantity, totalValueInStock());
		}
		
		else {
			System.out.printf("Updated data: %s, $ %.2f, %d unist, Total: $ %.2f\n",
					name, price, quantity, totalValueInStock());
		}
	}
	
	public void ShowProducts() {
		ShowProducts(false);
	}
	
}
