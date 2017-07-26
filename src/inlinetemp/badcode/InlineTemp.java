package inlinetemp.badcode;

import inlinetemp.Order;

/**《重构》 P119：内联临时变量
 * 场景：如果一个临时变量只被一个简单表达式赋值一次，而他又妨碍了其他的重构手段。
 * 方法：将所有对该变量的引用动作。替换成对它赋值的那个表达式自身。
 * @author Vincent
 *
 */
public class InlineTemp {
	boolean moreThousand() {
		Order anOrder = new Order(2000);
		//可以在临时变量之前添加final关键字，检测该变量是否只被赋值一次
		final double basePrice = anOrder.basePrice();
		//这里的basePrice为一个临时变量，当这个临时变量妨碍了其他重构手段时，可以考虑使用表达式来代替该临时变量
		return basePrice > 1000;
	}
}
