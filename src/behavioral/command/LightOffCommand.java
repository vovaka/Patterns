package behavioral.command;

public class LightOffCommand implements Command {

	private LightReceiver lightReceiver;

	public LightOffCommand(LightReceiver receiver) {
		lightReceiver = receiver;
	}

	@Override
	public void execute() {
		lightReceiver.turnOff();

	}

}
