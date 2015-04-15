package behavioral.interpreter;

public class InterpreterRunner {

	/**
	 * http://www.journaldev.com/1635/interpreter-design-pattern-in-java-example-tutorial
	 * 
	 * The Interpreter pattern should be used when you have a simple grammar that can be represented as an Abstract
	 * Syntax Tree. This is the more obvious use of the pattern. A more interesting and useful application of
	 * Interpreter is when you need a program to produce different types of output, such as a report generator.
	 */
	public static void main(String[] args) {
		Context context = new Context();
		AbstractInterpreter binInterpreter = new BinaryInterpreter(1234412312);
		AbstractInterpreter hexInterpreter = new HexInterpreter(1000);
		
		binInterpreter.interpret(context);
		hexInterpreter.interpret(context);

	}

}
