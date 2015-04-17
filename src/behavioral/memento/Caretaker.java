package behavioral.memento;

public class Caretaker {
	private Originator origintaor;

	public Caretaker(Originator origintaor) {
		this.origintaor = origintaor;
	}

	public void save() {
		origintaor.save();
	}
	
	public void undo(){
		origintaor.undo();
	}
	
	public void show(){
		origintaor.show();
	}
}
