package behavioral.mediator;

public class WorkDude extends AbstractDude {

	public WorkDude(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	void receive(String message) {
		System.out.println("Work dude received---> " + message);

	}

}
