package creational.abstractFactory;

public class FruitsFactory extends AbstractFactory {

	public Fruit getFruit(String fruitName) {
		Fruit fruit = null;
		if ("orange".equalsIgnoreCase(fruitName)) {
			fruit = new Orange();
		}
		return fruit;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}
}
