package inlinetemp;

public class Order {
	private double price;

	public Order(double price) {
		this.price = price;
	}

	public double basePrice() {
		return price;
	}
}