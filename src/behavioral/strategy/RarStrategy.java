package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class RarStrategy implements Strategy {

	@Override
	public void cmpressFiles(ArrayList<File> files) {
		System.out.println("Raring files.....");

	}

}
