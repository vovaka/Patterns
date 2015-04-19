package behavioral.visitor;

public class PostageVisitor implements Visitor {
	private double postageCost = 0;

	public double getPostageCost() {
		return postageCost;
	}

	@Override
	public void visit(Book book) {
		double bookPrice = book.getPrice();
		postageCost += book.getWeight() > 10 ? bookPrice * 2 : bookPrice * 1.3;
	}

	@Override
	public void visit(Disk disk) {
		double diskPrice = disk.getDiskPrice();
		int numberOfDisks = disk.getNumberOfDisks();
		postageCost += numberOfDisks > 3 ? diskPrice * (numberOfDisks - 1)
				: diskPrice * numberOfDisks;
	}

}
