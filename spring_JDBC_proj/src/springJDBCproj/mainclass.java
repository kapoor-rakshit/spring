package springJDBCproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springJDBCproj.dao.daoclass;
import springJDBCproj.model.circle;

public class mainclass {

	public static void main(String[] args) {
		
		// WITHOUT USING SPRING
		
//		circle circle = new daoclass().getCircle(4084);          // init obj of DAO class to have data using ID (primaryKEY)
//		System.out.println(circle.getName());
		
		
		
		// USING SPRING
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		daoclass dao = context.getBean("daoid", daoclass.class);
		
		circle circle = dao.getCircle(4084);                            // 1.
		System.out.println(circle.getName());
		
		System.out.println(dao.getCount());                             // 2.
		
		System.out.println(dao.getname(9025));                          // 3.
		
		circle crcobj = dao.getcircleobj(9025);                         // 4.
		System.out.println(crcobj.getId() + "  " + crcobj.getName());

	}

}
