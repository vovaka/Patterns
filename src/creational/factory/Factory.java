package creational.factory;

public class Factory {
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
}
