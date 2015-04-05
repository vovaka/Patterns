package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void getPrice() {
		float price = 0;
		for (Item it : items) {
			price += it.price();
		}
		System.out.println("Meat meal price " + price);
	}

	public void showAll() {
		System.out.println("Meal contains:");
		for (Item it : items) {
			System.out.println("\t" + it.name());
		}
	}

}
