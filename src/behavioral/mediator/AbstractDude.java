package behavioral.mediator;

public abstract class AbstractDude {
	Mediator mediator;

	void send(String message) {
		mediator.send(message, this);
	}

	abstract void receive(String message);

}
