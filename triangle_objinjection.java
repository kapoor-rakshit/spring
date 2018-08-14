package springproj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class triangle_objinjection implements ApplicationContextAware , BeanNameAware , InitializingBean , DisposableBean, Shape{
	
	private point_for_triangle_objinjection pointA;
	private point_for_triangle_objinjection pointB;
	private point_for_triangle_objinjection pointC;
	private ApplicationContext context = null;
	
	
	
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


                                            /* IMPLEMENTATION of AWARE INTERFACES */
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
		System.out.println("Am a watchdog for triangle_objinjection context. It is called");
		
	}



	@Override
	public void setBeanName(String beanname) {
		System.out.println("Bean name is : " + beanname);
		
	}

                                          /* IMPLEMENTATION of SPRING DEPENDENT const/dest InitializingBean and DisposableBean */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean initialzed for triangle_objinjection");
		
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroyed for triangle_objinjection.");
		
	}
	
	                                    /* Implementation of user defined CONSTRUCTOR and DESTRUCTOR */
		public void initm() {
			System.out.println("Bean inited");
		}
		
		public void destm() {
			System.out.println("Bean destroyed");
		}

}
