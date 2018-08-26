package springJDBCproj.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import springJDBCproj.model.circle;

public class daosupportclass extends NamedParameterJdbcDaoSupport {
	
	/* PROVIDES BUILTin VARS (dataSource, etc...) , GETTERS, SETTERS */
	/* SO ONE CAN USE AUTOWIRE if BEAN ID of DATASOURCE BEAN is same as "dataSource" in spring.xml*/
	
	
	
	public void insertNamedvals(circle crcobj) {
		String sqlstmt = "INSERT into triangle (ID, NAME, HEIGHT) values (:idval, :nameval, :htval)";    // MIND the ':'
		SqlParameterSource namedparams = new MapSqlParameterSource("idval", crcobj.getId())
				                             .addValue("nameval", crcobj.getName())
				                             .addValue("htval", crcobj.getHeight())
				                             ;
		this.getNamedParameterJdbcTemplate().update(sqlstmt, namedparams);
	}

}


   /* In a similar manner we can have a class extends JdbcDaoSupport */
