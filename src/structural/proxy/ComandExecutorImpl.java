package structural.proxy;

import java.io.IOException;

public class ComandExecutorImpl implements ComandExecutor {

	@Override
	public void runCommand(String command) throws IOException {
		Runtime.getRuntime().exec(command);
		System.out.println("Command was executed " + command);

	}

}
