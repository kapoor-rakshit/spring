package springAOPproj.model;

public class Triangle {
	
	private String name;

	public String getName() {
		System.out.println("getName of triangle called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
