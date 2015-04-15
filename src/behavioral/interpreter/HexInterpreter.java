package behavioral.interpreter;

public class HexInterpreter implements AbstractInterpreter {

	private int num;

	public HexInterpreter(int num) {
		this.num = num;
	}

	@Override
	public void interpret(Context context) {
		System.out.println(context.getHex(num));
	}

}
