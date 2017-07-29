package replacemethodwithmethodobject.goodcode;

/**
 * 1、建立一个新类，根据待处理函数的用途，为这个类命名
 * 
 * @author Vincent
 *
 */
public class Gamma {
	/**
	 * 2、在新类中建立一个final字段，用来保存原先的大型函数所在的对象
	 * */
	private final Account account;
	/**
	 * 3、针对原函数中每个临时变量和每个参数建立一个对应的字段进行保存
	 * */
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;
	
	/**
	 * 4、在新类中建立一个构造函数，接收源对象以及原函数的所有参数作为参数
	 * */
	Gamma(Account source, int inputVal, int quantity, int yearToDate) {
		this.account = source;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}
	
	/**
	 * 5、将原函数的代码复制到compute()函数中，如果需要调用源对象的任何函数，可以通过源对象字段进行调用
	 * */
	/*后期我们可以对compute()函数，采用extract method方法进行重构*/
	int compute() {
		importantValue1 = (inputVal * quantity) + account.delta();
		importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue1;
	}
}
