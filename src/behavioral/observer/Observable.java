package behavioral.observer;

public interface Observable {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyAllObservers();
	
	boolean isInStock();
}
