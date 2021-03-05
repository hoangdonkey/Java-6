public class testAccount {
	public static void main(String[] args) {
		Account a1 = new Account("A1", "Dung");
		Account a2 = new Account("A2", "Quan");

		System.out.println(a1.toString());

		a1.credit(50000);

		System.out.println(a1.getBalance());

		System.out.println(a1.debit(10000));
		System.out.println(a1.debit(60000));

		a1.transferTo(a2, 50000);
		a1.transferTo(a2, 20000);

		System.out.println(a2.toString());
	}
}