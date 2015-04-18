package behavioral.state;

public class Context {
	
	private State state;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Context(State state) {
		this.state = state;
	}
	
	public void doAction(){
		state.handleRequest();
	}
	
	

}
