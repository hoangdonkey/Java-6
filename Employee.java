public class Employee {
	private int id;
	private String fName;
	private String lName;
	private int salary;

	public Employee(int id, String fName, String lName, int salary) {
		this.id = id;
		this.fName = fName;
		this.lName =  lName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

	public String getName() {
		return fName + " " + lName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int newSalary) {
		salary = newSalary;
	}

	public int getAnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int raise) {
		salary += (salary * raise /100);
		return salary;
	}

	public String toString() {
		return "Employee: [id = " + id + ", name = " + fName + " " + lName + ", Salary = " + salary + "]"; 
	}
}