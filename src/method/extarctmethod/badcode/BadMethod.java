package method.extarctmethod.badcode;

import java.util.Enumeration;

import method.extarctmethod.Order;
import method.extarctmethod.SuperDemo;

public class BadMethod extends SuperDemo {

	public void printOwing() {
		Enumeration<Order> e = orders.elements();
		double outStanding = 0.0;
		printBanner();
		//统计订单的总价
		while (e.hasMoreElements()) {
			Order each = e.nextElement();
			outStanding += each.getAmount();
		}
		// 打印订单
		System.out.println("name:" + billCode);
		System.out.println("amount:" + outStanding);
	}

	private void printBanner() {
		System.out.println("*************************");
		System.out.println("******Customer Owes******");
		System.out.println("*************************");
	};
}
