package structural.bridge;

public class Panasonic implements TV {

	@Override
	public void on() {
		System.out.println("On panasonic");

	}

	@Override
	public void off() {
		System.out.println("Off panasonic");
	}

	@Override
	public void tuneChannel(int chanelNum) {
		System.out.println("panasonic channel is " + chanelNum);

	}

	@Override
	public String getName() {
		return Man.Panasonic.toString();
	}
	

}
