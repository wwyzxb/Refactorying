package splittemporaryvariable.goodcode;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}

	public void shapeInfo() {
		/**
		 * 可以将临时变量定义成final，这样可以检测临时变量是否被多次赋值
		 * */
		final double perimeter = 2 * (width + height);
		System.out.println(perimeter);
		final double area = height * width;
		System.out.println(area);
	}

}
