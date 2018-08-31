package springBOOTproj.db_table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity                          /* REGISTER as an ENTITY for making member vars as columns in TABLE entity */
public class STUDRec {
	
	@Id                          /* REGISTER desired member var as a PRIMARY key */
	int roll;

	String firstname, lastname;
	
	public STUDRec() {
	}
	
	public STUDRec(int roll, String firstname, String lastname) {
		super();
		this.roll = roll;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
