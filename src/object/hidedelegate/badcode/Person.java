package object.hidedelegate.badcode;

/**
 * 《重构》 P157：隐藏“委托关系” 
 * 场景：客户通过一个委托类来调用另一个对象 
 * 方法：在服务类上建立客户所需的所有函数，用以隐藏委托关系
 * 
 * @author Vincent
 *
 */
public class Person {
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
