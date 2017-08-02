package object.extractclass.goodcode;

/**
 * 经过提炼之后的Person类，提炼类是改善并发程序的一种常用技术，因为它可以使提炼之后的类分别加锁。
 * 
 * @author Vincent
 *
 */
public class Person {
	private String name;
	// 我们可以将原来的Person中与电话号码相关的函数委托给officeTelephone，从而隐藏该类
	private TelephoneNumber officeTelephone = new TelephoneNumber();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephoneNumber() {
		return officeTelephone.getTelephoneNumber();
	}

	TelephoneNumber getOfficeTelephone() {
		return officeTelephone;
	}

}
