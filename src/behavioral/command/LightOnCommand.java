package behavioral.command;

public class LightOnCommand implements Command {

	LightReceiver lightReceiver;

	public LightOnCommand(LightReceiver light) {
		lightReceiver = light;
	}

	@Override
	public void execute() {
		lightReceiver.turnOn();

	}

}
