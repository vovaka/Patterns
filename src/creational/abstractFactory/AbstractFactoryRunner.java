package creational.abstractFactory;

public class AbstractFactoryRunner {
	public static void main(String[] args) {
		AbstractFactory sFactory = FactoryProducer.getFactory("shape");
		sFactory.getShape("circle").draw();;
		AbstractFactory fFactory = FactoryProducer.getFactory("fruit");
		fFactory.getFruit("orange").peel();
	}
}
