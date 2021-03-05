public class testEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Tien", "Dung", 50000);
		System.out.println(e1.toString());

		e1.setSalary(60000);
		System.out.println(e1.getSalary());

		e1.raiseSalary(20);
		System.out.println(e1.getSalary());
		System.out.println(e1.getAnualSalary());
	}
}