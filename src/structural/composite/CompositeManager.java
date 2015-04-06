package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeManager implements Employee {

	private String name;
	private double salary;
	private List<Employee> employees = new ArrayList<>();

	public CompositeManager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void addEmplyee(Employee employee) {
		employees.add(employee);
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("Manager");
		System.out.println("\tName -> " + name);
		System.out.println("\tSalary -> " + salary);
		System.out.println("====================================");
		for (Employee emp : employees) {
			emp.print();
		}
	}

	@Override
	public void removeEmployee(Employee employee) {
		Iterator<Employee> iter = employees.iterator();
		while (iter.hasNext()) {
			if (iter.equals(employee)) {
				iter.remove();
			}
		}

	}

}
