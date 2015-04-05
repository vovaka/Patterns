package creational.builder;

public abstract class Drink implements Item {

	@Override
	abstract public float price();

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
