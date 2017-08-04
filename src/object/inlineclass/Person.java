package object.inlineclass;

/**
 * 《重构》P154 :将类内联化
 * 场景：某个类没有做太多的事情
 * 解决：将这个类的所有特性搬移到另一个类中，然后移除原类
 * 
 * @author Vincent
 *
 */
public class Person {
	private String name;
	private String officeAreacCode;
	private String officeNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeAreacCode() {
		return officeAreacCode;
	}

	public void setOfficeAreacCode(String officeAreacCode) {
		this.officeAreacCode = officeAreacCode;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getTelephoneNumber() {
		return ("(" + officeAreacCode + ")" + officeNumber);
	}
}
