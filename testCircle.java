public class testCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();

		System.out.println("The circle has the radius of "
			+ c1.getRadius() + " and area of " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("The circle has the radius of "
			+ c2.getRadius() + " and area of " + c2.getArea());

		Circle c3 = new Circle(3.0,"Yellow");
		System.out.println("The circle has the radius of "
			+ c3.getRadius() + " and area of " + c3.getArea());

		Circle c4 = new Circle(4.0,"Blue");
		System.out.println(c4.toString());
	}	
}