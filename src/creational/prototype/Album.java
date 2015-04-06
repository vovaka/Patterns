package creational.prototype;

public class Album implements PrototypeCapabe {

	@Override
	public Album clone() throws CloneNotSupportedException {
		System.out.println("Cloning Album");
		return (Album) super.clone();
	}

	@Override
	public String toString() {
		return "Album";
	}

}
