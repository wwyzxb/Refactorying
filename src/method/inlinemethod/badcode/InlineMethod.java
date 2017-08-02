package method.inlinemethod.badcode;

/**
 * 《重构》P117 内联函数： 当一个函数的本体与名称同样清除易懂时，可以考虑在函数调用点插入函数本体，然后移除该函数。
 * 
 * @author Vincent
 *
 */
public class InlineMethod {
	private static int numberOfLateDeliveries = 0;

	int getRating() {
		return moreThanFiveLateDeliveries() ? 2 : 1;
	}

	/*
	 * 该函数可以被内联，但是如果有子类继承了该函数，就不要将此函数内联，因为子类无法复写一个不存在的函数
	 */
	boolean moreThanFiveLateDeliveries() {
		return numberOfLateDeliveries > 5 ? true : false;
	}

}
