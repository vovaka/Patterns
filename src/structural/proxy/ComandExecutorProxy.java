package structural.proxy;

import java.io.IOException;

public class ComandExecutorProxy implements ComandExecutor {

	private ComandExecutorImpl executorImpl;
	private String name;
	private String password;

	public ComandExecutorProxy(String userName, String pswd) {
		name = userName;
		password = pswd;
		executorImpl = new ComandExecutorImpl();

	}

	@Override
	public void runCommand(String command) throws IOException {
		if (isAdmin(name, password)) {
			executorImpl.runCommand(command);
		} else {
			System.out.println("not authrized");
		}

	}

	private boolean isAdmin(String name, String password) {
		return "me".equalsIgnoreCase(name) && "pass".equalsIgnoreCase(password);
	}
}
