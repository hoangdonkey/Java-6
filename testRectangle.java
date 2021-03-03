public class testRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,4);

		System.out.println(r1.toString());

		r1.setWidth(3);

		System.out.println(r1.toString());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
	}
}