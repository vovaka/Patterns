package creational.builder;

public abstract class Burger implements Item {

	@Override
	abstract public float price();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
