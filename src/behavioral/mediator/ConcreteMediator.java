package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

	List<AbstractDude> dudes;

	public ConcreteMediator() {
		dudes = new ArrayList<>();
	}

	public void addDude(AbstractDude dude) {
		dudes.add(dude);
	}

	@Override
	public void send(String message, AbstractDude originator) {
		for (AbstractDude dude : dudes) {
			if (!dude.equals(originator)) {
				dude.receive(message);
			}
		}
	}

}
