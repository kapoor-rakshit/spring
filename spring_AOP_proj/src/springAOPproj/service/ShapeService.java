package springAOPproj.service;


import springAOPproj.aspect.Loggable;
import springAOPproj.model.Circle;
import springAOPproj.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Loggable                                                       // CUSTOM ANNOTATION attached with this TARGET method and ASPECT
	public Triangle getTriangle() {
		System.out.println("getTriangle called");
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
