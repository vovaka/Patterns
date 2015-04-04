package creational.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {
		AbstractFactory factory = null;
		if ("shape".equalsIgnoreCase(factoryName)) {
			factory = new ShapeFactory();
		} else if ("fruit".equalsIgnoreCase(factoryName)) {
			factory = new FruitsFactory();
		}
		return factory;
	}
}
