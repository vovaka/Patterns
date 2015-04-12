package structural.proxy;

import java.io.IOException;
/**
 * http://www.journaldev.com/1572/proxy-design-pattern-in-java-example-tutorial
 * http://java.dzone.com/articles/design-patterns-proxy
 *
 */
public class ProxyRunner {
	public static void main(String[] args) {
		ComandExecutor executor = new ComandExecutorProxy("test", "test");
		ComandExecutor executor2 = new ComandExecutorProxy("me", "pass");
		try {
			executor.runCommand("ls");
			executor2.runCommand("ls");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
