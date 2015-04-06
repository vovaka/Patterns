package creational.prototype;

import creational.prototype.PrototypeFactory.Type;

/**
 * http://howtodoinjava.com/2013/01/04/prototype-design-pattern-in-java/
 *
 */
public class PrototypeRunner {
	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeCapabe movie = PrototypeFactory
				.getInstance(Type.movie);
		System.out.println(movie);
		PrototypeCapabe album = PrototypeFactory
				.getInstance(Type.album);
		System.out.println(album);
	}
}
