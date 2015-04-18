package behavioral.state;

/**
 * http://www.javacodegeeks.com/2013/08/state-design-pattern-in-java-example-tutorial.html
 * 
 *  http://java.dzone.com/articles/design-patterns-state
 * 
 * You should use the State pattern when the behaviour of an object should be influenced by it's state, and when complex
 * conditions tie object behaviour to it's state.
 */
public class StateRunner {

	public static void main(String[] args) {
		State state1 = new StartState();
		State state2 = new StopState();

		Context context = new Context(state1);

		context.doAction();

		context.setState(state2);

		context.doAction();

	}

}
