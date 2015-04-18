package behavioral.observer;

public class ConcrteObserver implements Observer {

	private Observable observable;

	public ConcrteObserver(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		if (observable.isInStock()) {
			System.out.println("Sending email to client. Item is in stock");
		} else {
			System.out.println("Sending email to client. Item is out of stock");
		}

	}

}
