package method.inlinetemp.goodcode;

import method.inlinetemp.Order;

public class InlineTemp {
	boolean moreThousand() {
		Order anOrder = new Order(2000);
		return anOrder.basePrice() > 1000;
	}
}
