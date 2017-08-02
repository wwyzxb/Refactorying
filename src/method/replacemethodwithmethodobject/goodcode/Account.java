package method.replacemethodwithmethodobject.goodcode;

public class Account {
	int gama(int inputVal, int quantity, int yearToDate) {
		/**
		 * 6、将旧函数的本体替换成“创建新类的对象，而后调用其中的compute()函数”
		 * */
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}

	int delta() {
		return 10;
	}

}
