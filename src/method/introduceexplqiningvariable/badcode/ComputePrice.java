package method.introduceexplqiningvariable.badcode;

public class ComputePrice {
	private int quantity;
	private double itemPrice;

	/**这段代码较长，看起来比较费劲
	 * @return
	 */
	double getPrice() {
		return quantity * itemPrice - Math.max(0, quantity - 500) * itemPrice
				* 0.05 + Math.min(quantity * itemPrice * 0.1, 100);
	}
	
}
