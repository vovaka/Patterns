package behavioral.visitor;

public class Disk implements Visitable {

	double diskPrice;
	int numberOfDisks;

	public Disk(double diskPrice, int numberOfDisks) {
		this.diskPrice = diskPrice;
		this.numberOfDisks = numberOfDisks;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getDiskPrice() {
		return diskPrice;
	}

	public int getNumberOfDisks() {
		return numberOfDisks;
	}

}
