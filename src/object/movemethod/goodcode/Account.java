package object.movemethod.goodcode;

public class Account {
	private AccountType type;
	private int daysOverdrawn;

	/**
	 * 不删除源函数，将源函数的本体替换成一个简单的委托动作
	 * */
	double overdraftCharge() {
		return type.overdraftCharge(daysOverdrawn);
	}

	double bankCharge1() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
		}
		return result;
	}

	/**
	 * 删除源函数，找出源函数所有的调用者，并将其重定向
	 * */
	double bankCharge2() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += type.overdraftCharge(daysOverdrawn);
		}
		return result;
	}

}
