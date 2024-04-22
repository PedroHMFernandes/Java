package entities;

public class SimpleProduct {
	private String name;
	private double price;

	public SimpleProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setPrice(double value) {
		price = value;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
