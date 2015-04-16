package behavioral.iterator;

public interface IIterator<T> {

	boolean hasNext();

	boolean hasPrevious();

	T next();

	T previous();

}
