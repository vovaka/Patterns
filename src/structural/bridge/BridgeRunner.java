package structural.bridge;

/**
 * http://java.dzone.com/articles/design-patterns-bridge
 * 
 */
public class BridgeRunner {

	public static void main(String[] args) {
		RemoteControl remote = new ControlWithReset(new Sony());
		remote.on();
		remote.setChannel(50);
		((ControlWithReset) remote).resetTV();
		remote.off();
	}
}
