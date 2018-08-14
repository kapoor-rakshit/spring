package springproj;

import org.springframework.beans.factory.BeanNameAware;

public class circle implements Shape , BeanNameAware {
	
	private point_for_triangle_objinjection center;
	
	
	@Override
	public void draw() {
		
		System.out.println("Circle drawn");
		System.out.println("Circle point : " + center.getX() + " " + center.getY());
	}
	
	
	
	
	public point_for_triangle_objinjection getCenter() {
		return center;
	}

	public void setCenter(point_for_triangle_objinjection center) {
		this.center = center;
	}




	@Override
	public void setBeanName(String beanname) {
		// TODO Auto-generated method stub
		
		System.out.println("Bean name is : " + beanname);
		
	}
	
	

}
