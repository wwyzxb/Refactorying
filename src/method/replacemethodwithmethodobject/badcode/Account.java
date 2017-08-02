package method.replacemethodwithmethodobject.badcode;

/**《重构》 P135：以函数对象取代函数
 * 1、存在一个大型的函数，对很多局部变量很难采用extrac method方法进行重构
 * 2、将这个函数放进一个单独的对象中，这样局部变量就变成了对象内的字段。
 * 3、然后可以在同一个对象中将这个大型函数分解成多个小函数。
 * @author Vincent
 *
 */
public class Account {
	/**
	 * 如果一个函数中局部变量泛滥成灾，那么想分解这个函数就变得非常的困难，这个时候我们可以使用“函数对象”来解决该问题。
	 * */
	int gama(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue1;
	}

	int delta() {
		return 10;
	}

}
