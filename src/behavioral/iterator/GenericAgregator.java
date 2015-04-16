package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class GenericAgregator<T> implements IAgregator<T> {
	private List<T> list = new ArrayList<>();

	public GenericAgregator(List<T> list) {
		this.list = list;
	}

	@Override
	public IIterator<T> getIterator() {
		return new GenericIterator<T>();
	}

	private class GenericIterator<S> implements IIterator<T> {
		private int currentItem = 0;

		@Override
		public boolean hasNext() {
			return currentItem < list.size();
		}

		@Override
		public boolean hasPrevious() {
			return currentItem > 0;
		}

		@Override
		public T next() {
			T result = (T) list.get(currentItem++);
			return result;
		}

		@Override
		public T previous() {
			T result = (T) list.get(--currentItem);
			return result;
		}

	}

}
