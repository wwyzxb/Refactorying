package method.inlinemethod.goodcode;

public class InlineMethod {
	private static int numberOfLateDeliveries = 0;
	
	/**将函数内联可以精简代码
	 * @return
	 */
	int getRating() {
		return numberOfLateDeliveries > 5 ? 2 : 1;
	}
	
}
