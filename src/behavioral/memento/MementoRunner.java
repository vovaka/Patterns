package behavioral.memento;

/**
 * http://www.journaldev.com/1734/memento-design-pattern-in-java-example-tutorial
 * 
 * The Memento pattern is useful when you need to provide an undo mechanism in your applications, when the internal
 * state of an object may need to be restored at a later stage. Using serialization along with this pattern, it's easy
 * to preserve the object state and bring it back later on. 
 * 
 * 
 */
public class MementoRunner {

	public static void main(String[] args) {
		Originator originator = new Originator("test");

		Caretaker caretaker = new Caretaker(originator);

		originator.addToBuffer("lalalalal");

		caretaker.save();

		caretaker.show();
		originator.addToBuffer("123213123");
		caretaker.show();
		caretaker.undo();
		caretaker.show();

		originator.addToBuffer("!!!!!!!");
		caretaker.save();

	}

}
