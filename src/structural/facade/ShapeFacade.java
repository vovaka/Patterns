package structural.facade;

public class ShapeFacade {

	private Shape circle;
	private Shape triangle;

	public ShapeFacade() {
		circle = new Circle();
		triangle = new Triangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void draTriangle(){
		triangle.draw();
	}
}
