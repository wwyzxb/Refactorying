package movefield.goodcode;

public class Account {
	private AccountType type;

	double interestForAmountDays(double amount, int days) {
		/**
		 * 将所有对源字段interestRate的引用替换为对某个目标函数（getInterestRate()）的调用
		 * */
		return type.getInterestRate() * amount * days / 365;
	}
}
