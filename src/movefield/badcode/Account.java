package movefield.badcode;

/**《重构》 P146：搬移字段
 * 场景：在程序中，某个字段被其所驻类之外的另一个类更多地用到；
 * 解决：在目标类中新建一个字段，修改元字段的所有用户，令他们改用新字段。
 * @author Vincent
 *
 */
public class Account {
	/**
	 * 比如我需要将interestRate字段搬移到<AccountType>类中去
	 * */
	private double interestRate;

	double interestForAmountDays(double amount, int days) {
		return interestRate * amount * days / 365;
	}
}
