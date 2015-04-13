package behavioral.command;

public class CommandInvoker {
	
	void invokeCommand(Command command) {
		command.execute();
	}

}
