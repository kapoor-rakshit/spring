package springJDBCproj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springJDBCproj.model.circle;

public class daoclass {

	private DataSource dataSource;                              // for SPRING
	private JdbcTemplate jdbcTemplate;       // JdbcTemplate var
	

	public circle getCircle(int circleid) {
		
		//WITHOUT using SPRING
		
//		Connection conn = null;
//		
//		try {
//			
//			String driver = "org.apache.derby.jdbc.ClientDriver";                            // init DRIVER
//			Class.forName(driver).newInstance();
//			
//			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Shapes;CREATE=TRUE;");       // init CONNECTION
//			
//			PreparedStatement ps = conn.prepareStatement("select * from circle where id = ?");   // QUERY
//			ps.setInt(1, circleid);
//			
//			circle circle = null;
//			
//			ResultSet rs = ps.executeQuery();                                                   // EXECUTE QUERY
//			
//			if(rs.next()) {
//				circle = new circle(circleid, rs.getString("name"));                           // PARSE QUERY
//			}
//			
//			rs.close();                                                                        // CLOSE
//			ps.close();
//			return circle;
//		}
//		catch (Exception e){
//			
//			throw new RuntimeException(e);
//			
//		}
//		finally {
//			
//			try {
//				conn.close();                                                                 // CLOSE
//			}
//			catch(SQLException e) {
//				
//			}
//			
//		}
		
		
		
		// USING SPRING
		                                                                    // 1. Return OBJECT , without using JDBC_TEMPLATE
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();                                             // INIT DRIVER, CONNECTION in spring.xml
			
			PreparedStatement ps = conn.prepareStatement("select * from circle where id = ?");   // QUERY
			ps.setInt(1, circleid);
			
			circle circle = null;
			
			ResultSet rs = ps.executeQuery();                                                   // EXECUTE QUERY
			
			if(rs.next()) {
				circle = new circle(circleid, rs.getString("name"));                           // PARSE QUERY
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
			catch(SQLException e) {}
		}
		
		
	}
	
	public int getCount() {
		String sqlstmt = "SELECT COUNT(*) from CIRCLE";
		return jdbcTemplate.queryForObject(sqlstmt, Integer.class);     // 2. SQL statement , required return class
	}
	
	
	public String getname(int circleid) {
		String sqlstmt = "SELECT NAME from CIRCLE where ID = ?";       // 3. SQL statement , comma sep args , required return class
		return jdbcTemplate.queryForObject(sqlstmt, new Object[] {circleid}, String.class );
	}
	
	                                                                  // 4. Return OBJECT
	                                                                  //    SQL statement , comma sep args , ROWMAPPER
	public circle getcircleobj(int circleid) {
		String sqlstmt = "SELECT * from CIRCLE where ID = ?";
		return jdbcTemplate.queryForObject(sqlstmt, new Object[] {circleid}, new circleMapper());
	}
	public class circleMapper implements RowMapper<circle>{          // ROWMAPPER CLASS

		@Override
		public circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			circle crc = new circle();
			crc.setId(rs.getInt("id"));
			crc.setName(rs.getString("name"));
			return crc;
			
		}
	}
	
	
	                                         /* REQD Getter(s) and Setter(s) */
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);              // init Jdbc template with datasource
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
