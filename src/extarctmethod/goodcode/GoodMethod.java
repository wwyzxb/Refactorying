package extarctmethod.goodcode;

import java.util.Enumeration;

import extarctmethod.Order;
import extarctmethod.SuperDemo;

/**Tips：
 * 1.当一个函数过长或者需要一段注释才能让人理解时，可以考虑抽取成一个独立函数；
 * 2.抽取那些可以放进独立函数的代码，并让函数名称来解释该函数的用途；
 * 3.尽量让函数只返回一个值。
 * @author Vincent
 *
 */
public class GoodMethod extends SuperDemo {

	/**
	 * 向外提供唯一的打印支付信息的详情的方法
	 */
	public void printOwing() {
		printBanner();
		double outStanding=getOutStanding();
		printDetails(outStanding);
	}

	/**计算订单总额
	 * @return
	 */
	private double getOutStanding() {
		Enumeration<Order> e = orders.elements();
		double result = 0.0;
		while (e.hasMoreElements()) {
			Order each = e.nextElement();
			result += each.getAmount();
		}
		return result;
	}

	/**打印订单的汇总情况
	 * @param outStanding
	 */
	private void printDetails(double outStanding) {
		System.out.println("name:" + billCode);
		System.out.println("amount:" + outStanding);
	}

	/**
	 * print banner
	 */
	private void printBanner() {
		System.out.println("*************************");
		System.out.println("******Customer Owes******");
		System.out.println("*************************");
	};
}
