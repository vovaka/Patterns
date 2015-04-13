package behavioral.command;

/**
 * http://java.dzone.com/articles/design-patterns-command
 * 
 * <li>A history of requests is needed</li> <li>You need callback functionality</li> <li>Requests need to be handled at
 * variant times or in variant orders</li> <li>The invoker should be decoupled from the object handling the invocation.</li>
 * 
 */
public class CommandRunner {

	public static void main(String[] args) {

		LightReceiver lightReceiver = new LightReceiver();
		LightOnCommand onCommand = new LightOnCommand(lightReceiver);
		LightOffCommand offCommand = new LightOffCommand(lightReceiver);

		CommandInvoker invoker = new CommandInvoker();
		invoker.invokeCommand(onCommand);
		invoker.invokeCommand(offCommand);

	}

}
