package springBOOTproj.db_table;

public class STUDRec {
	
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
