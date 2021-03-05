public class testInvoice {
	public static void main(String[] args) {
		Invoice i1 = new Invoice("A1", "Good", 3, 35.99);

		System.out.println(i1.toString());

		i1.setUnitPrice(39.99);

		System.out.println(i1.getUnitPrice());
		System.out.println(i1.getTotal());
	}
}