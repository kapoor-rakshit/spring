package springproj;

public class triangle_objinjection {
	
	private point_for_triangle_objinjection pointA;
	private point_for_triangle_objinjection pointB;
	private point_for_triangle_objinjection pointC;
	
	
	
	public point_for_triangle_objinjection getPointA() {
		return pointA;
	}



	public void setPointA(point_for_triangle_objinjection pointA) {
		this.pointA = pointA;
	}



	public point_for_triangle_objinjection getPointB() {
		return pointB;
	}



	public void setPointB(point_for_triangle_objinjection pointB) {
		this.pointB = pointB;
	}



	public point_for_triangle_objinjection getPointC() {
		return pointC;
	}



	public void setPointC(point_for_triangle_objinjection pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		
		System.out.println("PointA = " + getPointA().getX() + ", " + getPointA().getY());
		System.out.println("PointB = " + getPointB().getX() + ", " + getPointB().getY());
		System.out.println("PointC = " + getPointC().getX() + ", " + getPointC().getY());
	}

}
