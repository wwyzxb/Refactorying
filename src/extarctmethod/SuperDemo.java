package extarctmethod;

import java.util.Vector;

public class SuperDemo {
	protected String billCode = "JD10010";
	protected static Vector<Order> orders = new Vector<Order>();
	static {
		orders.add(new Order(1, "Shoe", 230.99));
		orders.add(new Order(2, "Pen", 5.99));
		orders.add(new Order(3, "iPhone", 4999.0));
		orders.add(new Order(4, "Toy", 99.99));
		orders.add(new Order(5, "T-Shirt", 349.0));
	}
}
