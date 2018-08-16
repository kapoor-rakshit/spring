package springproj;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;

public class circle implements Shape , BeanNameAware {
	
	private point_for_triangle_objinjection center;
	private MessageSource msgsrc;
	
	
	public MessageSource getMsgsrc() {
		return msgsrc;
	}

	public void setMsgsrc(MessageSource msgsrc) {
		this.msgsrc = msgsrc;
	}




	@Override
	public void draw() {
		
		System.out.println("Circle drawn");
		System.out.println(this.msgsrc.getMessage("point", new Object[] {center.getX(), center.getY()}, "default point", null));
	}
	
	
	
	
	public point_for_triangle_objinjection getCenter() {
		return center;
	}
	
	// @Required                                                           // REQUIRED Annotation for member var
	// @Resource(name="pointCBEAN")
	public void setCenter(point_for_triangle_objinjection center) {
		this.center = center;
	}


	
	@Override
	public void setBeanName(String beanname) {
		// TODO Auto-generated method stub
		
		System.out.println("Bean name is : " + beanname);
		
	}
	
	                                                                     /* Constructor/Destructor with Annotations */
	
	@PostConstruct
	public void myinitializecircle() {
		System.out.println("Const with annotations for circle");
	}

	@PreDestroy
	public void mydestroycircle() {
		System.out.println("Dest with annotations for circle");
	}



}
