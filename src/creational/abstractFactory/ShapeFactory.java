package creational.abstractFactory;

public class ShapeFactory extends AbstractFactory{
	
	public Shape getShape(final String shapeType) {
		Shape shape = null;
		if ("circle".equalsIgnoreCase(shapeType)) {
			shape = new Circle();
		} else if ("triangle".equalsIgnoreCase(shapeType)) {
			shape = new Triangle();
		} else {
			shape = new NullShape();
		}

		return shape;

	}

	@Override
	Fruit getFruit(String fruit) {
		return null;
	}
	
	
}
