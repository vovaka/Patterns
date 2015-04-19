package behavioral.visitor;

public interface Visitor {
	
	void visit(Book book);
	void visit(Disk disk);

}
