package structural.flyweight;

public interface IFlyweight {
	enum Color {
		RED, BLACK, WHITE
	}

	Color getColor();

	<T> void draw(Point<T> point);

}
