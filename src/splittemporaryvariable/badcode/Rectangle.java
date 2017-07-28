package splittemporaryvariable.badcode;

/**《重构》 P128：分解临时变量
 * 1.程序中有某个临时变量被赋值超过一次，但它既不是循环变量也不被用于收集计算结果
 * 2.针对每次复制，创造一个独立、对应的临时变量
 * 3.很多临时变量用于保存一段冗长代码的运算结果，以便稍后使用，这种临时变量应该只被赋值一次。
 * @author Vincent
 *
 */
public class Rectangle {
	private double width;
	private double height;

	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}

	public void shapeInfo() {
		/**
		 * 这里临时变量temp被赋值了两次，我们可以将临时变量定义成final，这样可以检测临时变量是否被多次赋值
		 * */
		double temp = 2 * (width + height);
		System.out.println(temp);
		temp = height * width;
		System.out.println(temp);
	}
	
}
