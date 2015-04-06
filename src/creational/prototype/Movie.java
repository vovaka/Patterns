package creational.prototype;

public class Movie implements PrototypeCapabe {

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie");
		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "Movie";
	}
}
