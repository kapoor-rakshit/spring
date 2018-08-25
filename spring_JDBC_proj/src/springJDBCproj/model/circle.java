package springJDBCproj.model;

public class circle {
	
	int id;
	int height;
	String name;
	
	
	public circle(int id, String name) {                  // CONSTRUCTOR for JDBC
		setId(id);
		setName(name);
	}
	
	public circle(int id, String name, int height) {
		setId(id);
		setName(name);
		setHeight(height);
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public circle() {                                    // CONSTRUCTOR for ROWMAPPER
		// TODO Auto-generated constructor stub
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
