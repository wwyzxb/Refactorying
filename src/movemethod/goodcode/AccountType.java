package movemethod.goodcode;

public class AccountType {
	boolean isPremium(){
		return true;
	}
	
	/**
	 * 当使用到源类函数中的某些特性时，有如下几种方案：
	 * 1.将这个特性也移到目标类中；
	 * 2.建立或使用一个从目标类到源类的引用关系；
	 * 3.将源对象当做参数传给目标函数；
	 * 4.如果所需特性是一个变量，将它当作参数传给目标函数。（本例中将daysOverdrawn当做参数传给目标函数）
	 * */
	double overdraftCharge(int daysOverdrawn) {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
	}

}
