package structural.bridge;

public class ControlWithReset extends RemoteControl {
	
	public ControlWithReset(TV manufacturer) {
		super(manufacturer);
	}

	public void resetTV() {
		manufacturer.tuneChannel(0);
		System.out.println(manufacturer.getName() + " reseted");
	}
}
