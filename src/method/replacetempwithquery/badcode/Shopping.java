package method.replacetempwithquery.badcode;

public class Shopping {
	private double quantity;
	private double itemPrice;

	public Shopping(double quantity, double itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	public double getPrice() {
		return basePrice() * discountFactor();
	}

	private double basePrice() {
		return quantity * itemPrice;
	}

	private double discountFactor() {
		return basePrice() > 1000 ? 0.95 : 0.98;
	}

}
