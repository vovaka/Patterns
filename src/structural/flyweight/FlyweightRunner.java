package structural.flyweight;

import structural.flyweight.IFlyweight.Color;

public class FlyweightRunner {
	public static void main(String[] args) {
		Flyweightfactory factory = new Flyweightfactory();

		LineFlyweight lf1 = (LineFlyweight) factory.getFlyweight(Color.RED);

		LineFlyweight lf2 = (LineFlyweight) factory.getFlyweight(Color.BLACK);

		LineFlyweight lf3 = (LineFlyweight) factory.getFlyweight(Color.RED);

		LineFlyweight lf4 = (LineFlyweight) factory.getFlyweight(Color.BLACK);

		lf1.draw(new Point<Integer>(10, 40));
		lf2.draw(new Point<Integer>(2, 32));
		lf3.draw(new Point<Integer>(32, 20));
		lf4.draw(new Point<Integer>(111, 42));

		System.out.println(Flyweightfactory.count);
	}
}
