package behavioral.mediator;

public class GameDude extends AbstractDude {

	public GameDude(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	void receive(String message) {
		System.out.println("Game dude received-----> " + message);

	}

}
