package structural.bridge;

public abstract class RemoteControl {

	protected TV manufacturer;

	public RemoteControl(TV manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void on() {
		manufacturer.on();
	}

	public void off() {
		manufacturer.off();
	}

	public void setChannel(int chanelNum) {
		manufacturer.tuneChannel(chanelNum);
	}
}
