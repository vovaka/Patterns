package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * http://java.dzone.com/articles/design-patterns-visitor
 * 
 * The pattern should be used when you have distinct and unrelated operations to perform across a structure of objects.
 * This avoids adding in code throughout your object structure that is better kept seperate, so it encourages cleaner
 * code. You may want to run operations against a set of objects with different interfaces. Visitors are also valuable
 * if you have to perform a number of unrelated operations across the classes.
 * 
 * In summary, if you want to decouple some logical code from the elements that you're using as input, visitor is
 * probably the best pattern for the job.
 * 
 */
public class VisitorRunner {

	public static void main(String[] args) {
		Book book1 = new Book(23.12, 15);
		Book book2 = new Book(22.2, 2);
		Disk disk1 = new Disk(13.23, 5);
		Disk disk2 = new Disk(12.2, 2);

		List<Visitable> items = new ArrayList<>();

		items.add(book1);
		items.add(book2);
		items.add(disk1);
		items.add(disk2);

		PostageVisitor postageVisitor = new PostageVisitor();

		for (Visitable vis : items) {
			vis.accept(postageVisitor);
		}

		System.out.println(postageVisitor.getPostageCost());

	}
}
