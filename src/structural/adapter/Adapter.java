package structural.adapter;

public class Adapter implements TargetTemperatureReporter {
	private AdapteeCelsious celsious;
	private float temp;

	public Adapter() {
		celsious = new AdapteeCelsious();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	@Override
	public float getTempInCelcious() {
		return celsious.getTemp();
	}

	@Override
	public float getTempInFarengheiths() {
		return convertToF();
	}

	@Override
	public float getTempInCelsFromF() {
		return convertToC();
	}

	private float convertToF() {
		return (temp - 32) * 5 / 9;
	}

	private float convertToC() {
		return (temp * 9 / 5) + 32;
	}

}
