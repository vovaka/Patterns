package structural.flyweight;

public class LineFlyweight implements IFlyweight {
	Color color;

	public LineFlyweight(Color color) {
		this.color = color;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public <T> void draw(Point<T> point) {

		System.out.println("drawing new line at " + point.getX() + ", "
				+ point.getY());

	}

}
