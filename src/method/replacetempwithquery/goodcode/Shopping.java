package method.replacetempwithquery.goodcode;

/**
 * 《重构》 P120：以查询取代临时变量 
 * 场景：程序以一个临时变量保存某一表达式的运算结果；
 * 方法：将这个表达式提炼到一个独立的函数中，并将这个临时变量的所有引用点替换为对新函数的调用。这样这个新函数就可以被其他函数进行复用。
 * 
 * 临时变量的主要问题在于：
 * 1.它们都只是暂时的，而且只能在所属的函数内使用，这会导致我们写出更长的函数，才能访问到临时变量。如果我们将临时变量替换成查询（提炼成一个函数），
 * 那么类中所有的函数都可以获得这份信息，这也可以使类能够编写更加清晰的代码。
 * 2.局部变量会使代码难以被提炼，所以应该尽可能的使用查询来代替临时变量。
 * @author Vincent
 *
 */
public class Shopping {
	private double quantity;
	private double itemPrice;

	public Shopping(double quantity, double itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	/*
	 * 重构之前可以使用final来修饰临时变量，这样可以让编译器帮我们检查临时变量是否只被赋值一次，
	 * 如果临时变量不止被赋值一次，我们就不该进行该项重构。
	 * */
	public double getPrice() {
		//basePrice临时变量可以提炼成一个函数
		double basePrice = quantity * itemPrice;
		//discountFactor临时变量也可以被提炼成一个函数
		double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}

}
