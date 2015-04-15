package behavioral.interpreter;

public class BinaryInterpreter implements AbstractInterpreter {

	private int num;

	public BinaryInterpreter(int num) {
		this.num = num;
	}

	@Override
	public void interpret(Context context) {
		System.out.println(context.getBinary(num));

	}

}
