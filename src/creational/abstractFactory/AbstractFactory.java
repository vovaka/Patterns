package creational.abstractFactory;

abstract class AbstractFactory {

	abstract Shape getShape(String shape);
	abstract Fruit getFruit(String fruit);
}
