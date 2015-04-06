package structural.bridge;


public class Sony implements TV {

	@Override
	public void on() {
		System.out.println("sony on");

	}

	@Override
	public void off() {
		System.out.println("sony off");

	}

	@Override
	public void tuneChannel(int chanelNum) {
		System.out.println("sony channel is " + chanelNum);

	}

	@Override
	public String getName() {
		return Man.Sony.toString();
	}

}
