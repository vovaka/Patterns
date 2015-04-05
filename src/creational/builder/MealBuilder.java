package creational.builder;

public class MealBuilder {

	public void createMeatMeal() {
		Meal meal = new Meal();
		meal.addItem(new MeatBurger());
		meal.addItem(new Pepsi());
		meal.showAll();
		meal.getPrice();
	}
}
