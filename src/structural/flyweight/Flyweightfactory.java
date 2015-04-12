package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

import structural.flyweight.IFlyweight.Color;

public class Flyweightfactory {
	private static List<IFlyweight> flyweights;
	public static int count = 0;

	public Flyweightfactory() {
		flyweights = new ArrayList<>();
	}

	public IFlyweight getFlyweight(Color color) {
		for (IFlyweight fly : flyweights) {
			if (fly.getColor().equals(color)) {
				return fly;

			}
		}

		IFlyweight newFlyweight = new LineFlyweight(color);
		flyweights.add(newFlyweight);
		count++;
		return newFlyweight;
	}
}
