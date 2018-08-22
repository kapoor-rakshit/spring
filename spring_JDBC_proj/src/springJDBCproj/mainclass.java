package springJDBCproj;

import springJDBCproj.dao.daoclass;
import springJDBCproj.model.circle;

public class mainclass {

	public static void main(String[] args) {
		
		circle circle = new daoclass().getCircle(9025);          // init obj of DAO class to have data using ID (primaryKEY)
		System.out.println(circle.getName());

	}

}
