package behavioral.observer;

public class ObserverRunner {

	/**
	 * http://java.dzone.com/articles/observer-pattern-java
	 * 
	 */
	public static void main(String[] args) {
		Observable item = new ConcreteObservable();
		Observer observer = new ConcrteObserver(item);
		Observer observer2 = new ConcreteObserverTwo(item);
		
		item.addObserver(observer);
		item.addObserver(observer2);
		
		((ConcreteObservable)item).setObservableState(false);
		((ConcreteObservable)item).setObservableState(true);
		
		item.removeObserver(observer2);
		((ConcreteObservable)item).setObservableState(false);
	}

}
