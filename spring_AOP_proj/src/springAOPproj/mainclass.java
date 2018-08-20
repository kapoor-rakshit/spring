package springAOPproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAOPproj.service.ShapeService;

public class mainclass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);   // extra arg eliminates the need to typecast manually
		System.out.println(shapeService.getTriangle().getName());

	}

}
