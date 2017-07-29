package removeassignmentstoparameters;

/**《重构》 P131 移除对参数的赋值
 * 1、代码对一个参数进行赋值；
 * 2、以一个临时变量取代该参数的位置。
 * @author Vincent
 *
 */
public class DiscountInfo {
	
	private int inputval;
	private int quantity;
	private int yearToDate;
	
	public DiscountInfo(int inputVal,int quantity,int yearToDate){
		this.inputval=inputVal;
		this.quantity=quantity;
		this.yearToDate=yearToDate;
	}
	
	private int discount(int inputVal,int quantity,int yearToDate){
		/**
		 * 参考discount2()代码中切记不要对参数进行赋值，可以如discount2中对参数加上final关键字（但一般不这么做），可以检测是否对参数赋值
		 * */
		if(inputVal>50) {
			inputVal-=2;
		}
		if(quantity>100){
			inputVal-=1;
		}
		if(yearToDate>10000){
			inputVal-=4;
		}
		return inputVal;
	}
	
	
	private int discount2(final int inputVal,final int quantity,final int yearToDate){
		int result=inputVal;
		if(inputVal>50) {
			result-=2;
		}
		if(quantity>100){
			result-=1;
		}
		if(yearToDate>10000){
			result-=4;
		}
		return result;
	}
	
	
	

}
