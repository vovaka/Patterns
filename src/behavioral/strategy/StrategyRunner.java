package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * http://java.dzone.com/articles/design-patterns-strategy
 * 
 * http://javarevisited.blogspot.com/2014/04/difference-between-state-and-strategy-design-pattern-java.html
 * 
 * The Strategy pattern is to be used where you want to choose the algorithm to use at runtime. A good use of the
 * Strategy pattern would be saving files in different formats, running various sorting algorithms, or file
 * compression.The Strategy pattern provides a way to define a family of algorithms, encapsulate each one as an object,
 * and make them interchangeable.
 * 
 */
public class StrategyRunner {

	public static void main(String[] args) {

		StrategyContext context = new StrategyContext();

		context.setStrategy(new ZipStrategy());

		context.compress(new ArrayList<File>());

		context.setStrategy(new RarStrategy());
		context.compress(new ArrayList<File>());
	}

}
