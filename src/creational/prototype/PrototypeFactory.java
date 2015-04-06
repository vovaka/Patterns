package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	static enum Type {
		movie, album
	}

	private static Map<Type, PrototypeCapabe> prototypeMap = new HashMap<>();
	static {
		prototypeMap.put(Type.movie, new Movie());
		prototypeMap.put(Type.album, new Album());
	}

	public static PrototypeCapabe getInstance(Type key)
			throws CloneNotSupportedException {

		return prototypeMap.get(key).clone();
	}
}
