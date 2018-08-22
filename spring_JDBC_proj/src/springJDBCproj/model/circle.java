package springJDBCproj.model;

public class circle {
	
	int id;
	String name;
	
	
	public circle(int id, String name) {                  // CONSTRUCTOR for JDBC
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
