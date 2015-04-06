package structural.composite;

public class Developer implements Employee {
	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void addEmplyee(Employee employee) {
		throw new IllegalArgumentException("Not supported");

	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("Developer");
		System.out.println("\tName -> " + name);
		System.out.println("\tSalary -> " + salary);

	}

	@Override
	public void removeEmployee(Employee employee) {
		throw new IllegalArgumentException("Not supported");

	}

}
