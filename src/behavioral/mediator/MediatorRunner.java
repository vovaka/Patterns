package behavioral.mediator;

public class MediatorRunner {
	/**
	 * http://java.dzone.com/articles/design-patterns-mediator
	 * 
	 * 
	 * The mediator is a good choice of pattern when the communication between objects is complicated, but well defined.
	 * When there are too many relationships between the objects in your code, it's time to think of having such a
	 * central point of control.
	 * 
	 * An observer based variation of the mediator pattern is used in Java Message Service (JMS) implementations, which
	 * allows applications to subscribe and publish data to other applications. This is a common combination of patterns
	 * that makes sense.
	 */

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();

		AbstractDude workDude = new WorkDude(mediator);
		AbstractDude gameDude = new GameDude(mediator);

		((ConcreteMediator) mediator).addDude(workDude);
		((ConcreteMediator) mediator).addDude(gameDude);

		workDude.send("WTF");
		gameDude.send("FU");

	}

}
