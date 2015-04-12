package structural.flyweight;

public class Point<T> {
	private T x;
	private T y;

	public Point(T x, T y) {
		this.x = x;
		this.y = y;
	}

	T getX() {
		return x;
	}

	T getY() {
		return y;
	}

}
