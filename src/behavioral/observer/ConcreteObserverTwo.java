package behavioral.observer;

public class ConcreteObserverTwo implements Observer {
	private Observable observable;

	public ConcreteObserverTwo(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		if (!observable.isInStock()) {
			System.out
					.println("Sending email to manufacturer. Need more itmems");
		}

	}
}
