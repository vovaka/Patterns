package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * http://java.dzone.com/articles/design-patterns-iterator 
 * This pattern is useful when you need access to elements in a
 * set without access to the entire representation. When you need a uniform traversal interface, and multiple traversals
 * may happen across elements, iterator is a good choice.
 * 
 * It also makes you code much more reasonable, getting rid of the typical for loop syntax across sections of your
 * codebase.
 * 
 */

public class IteratorRunner {
	private static List<String> listString;
	private static List<Integer> listInteger;

	public static void main(String[] args) {
		stringListInit();
		intListInit();
		GenericAgregator<String> agregator = new GenericAgregator<>(listString);
		IIterator<String> iter = agregator.getIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());

		}
		System.out.println("=============================");
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());

		}
		System.out.println("=============================");
		GenericAgregator<Integer> agregator2 = new GenericAgregator<>(
				listInteger);
		IIterator<Integer> iter2 = agregator2.getIterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next());

		}
		System.out.println("=============================");
		while (iter2.hasPrevious()) {
			System.out.println(iter2.previous());

		}

	}

	private static List<String> stringListInit() {
		listString = new ArrayList<>();
		listString.add("one");
		listString.add("two");
		listString.add("three");
		listString.add("four");
		listString.add("five");
		listString.add("six");
		return listString;
	}

	private static List<Integer> intListInit() {
		listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(4);
		listInteger.add(5);
		listInteger.add(6);
		return listInteger;
	}

}
