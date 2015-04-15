package behavioral.interpreter;

public class Context {
	public String getBinary(int num) {
		return Integer.toBinaryString(num);
	}

	public String getHex(int num) {
		return Integer.toHexString(num);
	}
}
