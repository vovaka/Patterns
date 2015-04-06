package structural.adapter;

public class AdapterRunner {

	
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.setTemp(120);
		System.out.println(adapter.getTempInFarengheiths());
		adapter.setTemp(10);
		System.out.println(adapter.getTempInCelsFromF());
	}
}
