package behavioral.command;

public class LightReceiver {
	boolean on;

	void turnOn() {
		on = true;
		System.out.println("Turned on");
	}

	void turnOff() {
		on = false;
		System.out.println("Turned off");
	}
}
