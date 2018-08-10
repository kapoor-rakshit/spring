package springproj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class drawingapp {

	public static void main(String[] args) {
		
		/* SETTER/CONSTRUCTOR INJECTION */
		
		// WITHOUT USING SPRING
		
	// triangle triangle = new triangle();
	// triangle.draw();
		
		
		// USING SPRING BeanFactory CONFIG
		
	// BeanFactory factory  = new XmlBeanFactory(new FileSystemResource("spring.xml"));      
		                                                                                     // specify path for "spring.xml"
	// triangle triangle = (triangle) factory.getBean("triangle");                 // ask bean factory to generate object of "id" from xml
	
		
		// USING SPRING APPLICATION CONTEXT
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");          // Using SPRING APPLICATION CONTEXT (includes more features)
	                                                                                       // "spring.xml" must be in classpath ie src
	// triangle triangle = (triangle) context.getBean("triangle");                 // use context to generate bean of "id"
    // triangle.draw();
	
	
	
	
	
	   /* OBJECT INJECTION */
	
	// WITHOUT USING SPRING (to it's full :) )
	
//	point_for_triangle_objinjection ptA = (point_for_triangle_objinjection) context.getBean("pointABEAN");
//	point_for_triangle_objinjection ptB = (point_for_triangle_objinjection) context.getBean("pointBBEAN");
//	point_for_triangle_objinjection ptC = (point_for_triangle_objinjection) context.getBean("pointCBEAN");
//	
//	
//	triangle_objinjection tr = new triangle_objinjection();
//	tr.setPointA(ptA);
//	tr.setPointB(ptB);
//	tr.setPointC(ptC);
//	
//	tr.draw();
	
	
	// USING SPRING
	
	triangle_objinjection tr = (triangle_objinjection) context.getBean("triangle");
	tr.draw();
	
	}

}
