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
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
		System.out.printf("Product data: %s, $ %.2f, %d unist, Total: $ %.2f\n",
		
	public String toString() {
		return name 
			+ ", $ " 
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity 
			+ " units, Total: $ " 
			+ String.format("%.2f", totalValueInStock()); 
	}	
}
