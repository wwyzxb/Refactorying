package object.extractclass.goodcode;

/**
 * 将原来Person类中与电话号码相关的类提炼出来，组成新的TelephoneNumber类
 * 
 * @author Vincent
 *
 */
public class TelephoneNumber {
	private String number;
	private String areaCode;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getTelephoneNumber() {
		return ("(" + areaCode + ")" + number);
	}

}
