package extractclass.badcode;

/**
 * 《重构》P149：提炼类 
 * 问题：某个类做了应该由两个类做的事。 
 * 解决方法：我们可以建立一个新的类，然后将相关的字段和函数从旧类搬移到新类中。
 * 
 * @author Vincent
 *
 */
public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 如下代码放在Person类中容易造成困惑，是可以迁移到新类中的代码
	private String officeAreacCode;
	private String officeNumber;

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
