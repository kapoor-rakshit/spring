package springJDBCproj;

import java.util.List;

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
		
		circle circle = dao.getCircle(4084);                            // 1. READ
		System.out.println(circle.getName());
		
		System.out.println(dao.getCount());                             // 2.
		
		System.out.println(dao.getname(9025));                          // 3.
		
		circle crcobj = dao.getcircleobj(9025);                         // 4.
		System.out.println(crcobj.getId() + "  " + crcobj.getName());
		
		List<circle> reclist = dao.getallrows();                        // 5.
		for(circle recdet : reclist) {
			System.out.println(recdet.getId() + " " + recdet.getName()); 
		}
		
		// dao.insertrecs(new circle(4095, "RK"));                           // 6. INSERT
		
		// dao.delrec("RK");                                                 // 7. DELETE
		
		// dao.updaterec();                                                  // 8. UPDATE/ALTER
		
		// dao.createtable();                                                // 9. CREATE TABLE
		
		dao.insertNamedvals(new circle(1090, "JG", 58));                     // 10. NAMEDPARAM JDBCTEMPLATE
		
	}

}
