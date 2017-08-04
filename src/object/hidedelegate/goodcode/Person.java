package object.hidedelegate.goodcode;

public class Person {
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//添加getManager()函数来增加对department对象函数的委托
	public Person getManager() {
		return department.getManager();
	}
}
