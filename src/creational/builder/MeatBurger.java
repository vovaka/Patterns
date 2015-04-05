package creational.builder;

public class MeatBurger extends Burger {

	@Override
	public float price() {
		return 20.3f;
	}

	@Override
	public String name() {
		return "MeatBurger";
	}

}
