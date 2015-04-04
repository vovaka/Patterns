package creational.factory;

public class FactoryRunner {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Shape circle = factory.getShape("Circle");
		circle.draw();
		Shape triangle = factory.getShape("TrianGle");
		triangle.draw();

		Shape wtf = factory.getShape("wtf");
		wtf.draw();
	}
}
