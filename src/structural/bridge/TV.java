package structural.bridge;

public interface TV {

	void on();
	void off();
	void tuneChannel(int chanelNum);
	
	String getName();
	
	enum Man{
		Panasonic, Sony
	}
}
