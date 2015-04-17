package behavioral.memento;

public class Originator {

	private StringBuffer buffer;
	private Memento memento;

	public Originator(String content) {
		buffer = new StringBuffer().append(content);
	}

	public void addToBuffer(String content) {
		buffer.append(content);
	}

	public void show() {
		System.out.println(buffer);
	}

	public void save() {
		memento = new Memento(this.buffer);
	}

	public void undo() {
		this.buffer = memento.getBuffer();
	}

	private class Memento {
		private StringBuffer buffer;

		public Memento(StringBuffer buffer) {
			this.buffer = new StringBuffer(buffer);
		}

		public StringBuffer getBuffer() {
			return buffer;
		}

	}
}
