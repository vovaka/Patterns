package behavioral.state;

public class StopState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Stoping.....");
	}

}
