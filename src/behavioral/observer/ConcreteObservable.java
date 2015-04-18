package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable {
	
	private List<Observer> observers = new ArrayList<>();
	
	private boolean inStock = false;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer : observers){
			observer.update();
		}

	}

	private boolean getObservableState() {
		return inStock;
	}

	public void setObservableState(boolean observableState) {
		this.inStock = observableState;
		notifyAllObservers();
	}

	@Override
	public boolean isInStock() {
		return getObservableState();
	}

}
