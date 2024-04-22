 package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// Construtores
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	// Outros métodos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		if (this.quantity < quantity) {
			this.quantity = 0;
		} else {
			this.quantity -= quantity;
		}
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
