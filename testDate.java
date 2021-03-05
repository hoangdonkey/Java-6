public class testDate {
	public static void main(String[] args) {
		Date d1 = new Date(8,5,1992);

		System.out.println(d1.toString());

		d1.setDate(5,3,2021);

		System.out.println(d1.toString());
	}
}