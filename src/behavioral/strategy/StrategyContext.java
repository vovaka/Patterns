package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class StrategyContext {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void compress(ArrayList<File> files) {
		strategy.cmpressFiles(files);
	}

}
