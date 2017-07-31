package movemethod.badcode;

/**《重构》 P142：搬移函数
 * 情景：有个函数与其所驻类之外的另一个类进行更多的交流->调用后者或被后者调用；
 * 做法：在该函数最常引用的类中建立一个有着类似行为的新函数，将旧函数变成一个单纯的委托函数，或是将旧函数完全移除。
 * 
 * 如果一个类和另一个类有太多的合作而形成高度的耦合，那么就应该搬移这个类。
 * @author Vincent
 *
 */
public class Account {
	private AccountType type;
	private int daysOverdrawn;
	/**
	 * 考虑将overdraftCharge()函数搬移到AccountType类中
	 * */
	double overdraftCharge() {
		if (type.isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
	}

	double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
		}
		return result;
	}

}
