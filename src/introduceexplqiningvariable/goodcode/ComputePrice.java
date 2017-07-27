package introduceexplqiningvariable.goodcode;

public class ComputePrice {
	private int quantity;
	private double itemPrice;

	/** 这段代码较长，看起来比较费劲 */
	// double getPrice() {
	// return quantity * itemPrice - Math.max(0, quantity - 500) * itemPrice
	// * 0.05 + Math.min(quantity * itemPrice * 0.1, 100);
	// }

	/**
	 * 1、我们将上面的较长的表达式引入临时变量逐步拆解；
	 * 2、但是对于这样的列子的重构我们最好还是使用ExtractMethod方式来进行重构，见getPrice2()
	 * 3、引入临时变量的方法一般适用于需要处理大量临时变量的算法
	 * */
	double getPrice1() {
		final double basePrice = quantity * itemPrice;
		final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice
				* 0.05;
		final double shipping = Math.min(quantity * itemPrice * 0.1, 100);
		return basePrice - quantityDiscount - shipping;
	}

	/**
	 * 1、使用ExtractMethod方式来进行重构，可以在当前类中进行代码复用；
	 * 2、如果想让其他对象使用可以改变访问控制符。
	 */
	double getPrice2() {
		return basePrice() - quantityDiscount() - shipping();
	}

	double basePrice() {
		return quantity * itemPrice;
	}

	double quantityDiscount() {
		return Math.max(0, quantity - 500) * itemPrice * 0.05;
	}

	double shipping() {
		return Math.min(quantity * itemPrice * 0.1, 100);
	}

}
