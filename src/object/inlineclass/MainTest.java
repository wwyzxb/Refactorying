package object.inlineclass;

public class MainTest {
	public static void main(String[] args) {
		Person martin=new Person();
//		martin.getOfficeTelephone().setAreaCode("781");
//		System.out.println(martin.getOfficeTelephone().getAreaCode());
		martin.setOfficeAreacCode("781");
		System.out.println(martin.getOfficeAreacCode());;
	}
}
