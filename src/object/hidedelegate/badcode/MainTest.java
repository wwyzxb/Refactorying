package object.hidedelegate.badcode;

public class MainTest {
	public static void main(String[] args) {
		Person join=new Person();
		//如果客户想知道某人的经理是谁，就必须要先取得Department对象
		//如果我们对客户隐藏Department，可以减少耦合
		Person manager=join.getDepartment().getManager();
	}

}
