package springJDBCproj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import springJDBCproj.model.circle;

public class daoclass {
	
	public circle getCircle(int circleid) {
		
		Connection conn = null;
		
		try {
			
			String driver = "org.apache.derby.jdbc.ClientDriver";                            // init DRIVER
			Class.forName(driver).newInstance();
			
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Shapes");       // init CONNECTION
			
			PreparedStatement ps = conn.prepareStatement("select * from circle where id = ?");   // QUERY
			ps.setInt(1, circleid);
			
			circle circle = null;
			
			ResultSet rs = ps.executeQuery();                                                   // EXECUTE QUERY
			
			if(rs.next()) {
				circle = new circle(circleid, rs.getString("name"));
			}
			
			rs.close();                                                                        // CLOSE
			ps.close();
			return circle;
		}
		catch (Exception e){
			
			throw new RuntimeException(e);
			
		}
		finally {
			
			try {
				conn.close();                                                                 // CLOSE
			}
			catch(SQLException e) {
				
			}
			
		}
		
	}

}
