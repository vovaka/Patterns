package structural.facade;

/**
 * http://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 *
 */
public class FacadeRunner {

	public static void main(String[] args) {
		ShapeFacade facade = new ShapeFacade();
		facade.drawCircle();
		facade.draTriangle();
	}
}
