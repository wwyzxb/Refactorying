package method.extarctmethod;

import method.extarctmethod.badcode.BadMethod;
import method.extarctmethod.goodcode.GoodMethod;

public class OrderTest {
	public static void main(String[] args) {
		BadMethod badDemo=new BadMethod();
		badDemo.printOwing();
		
		GoodMethod goodDemo=new GoodMethod();
		goodDemo.printOwing();
	}

}
