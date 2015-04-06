package structural.composite;

/**
 * http://java.dzone.com/articles/composite-design-pattern-java-0
 *
 */
public class CompositeRunner {
	public static void main(String[] args) {
		Developer dev1 = new Developer("1", 10000);
		Developer dev2 = new Developer("2", 10230);
		CompositeManager manager = new CompositeManager("man1", 202323);
		manager.addEmplyee(dev1);
		manager.addEmplyee(dev2);
		Developer dev3 = new Developer("3", 2323);
		CompositeManager mainManager = new CompositeManager("mainMan",
				112312313);
		mainManager.addEmplyee(manager);
		mainManager.addEmplyee(dev3);
		mainManager.print();
		mainManager.removeEmployee(dev3);
		mainManager.print();

	}

}
