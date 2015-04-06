package structural.adapter;

public class AdapterRunner {

	/**
	 * http://www.avajava.com/tutorials/lessons/adapter-pattern.html?page=2
	 */
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.setTemp(120);
		System.out.println(adapter.getTempInFarengheiths());
		adapter.setTemp(10);
		System.out.println(adapter.getTempInCelsFromF());
	}
}
