package springproj;

public class triangle {
	
	private String type;
	private int height;
	
	public triangle(String type) {                   // CONSTRUCTOR(s)
		this.type = type;
	}
	
	public triangle(int height) {
		this.height = height;
	}
	
	public triangle(int height,String type) {
		this.height = height;
		this.type = type;
	}
	
	
	public String getType() {                      // GETTER
		return type;
	}

	public int getHeight() {
		return height;
	}

//	public void setType(String type) {            // SETTER
//		this.type = type;
//	}


	public void draw() {
		System.out.println(getType() + " Triangle drawn " + getHeight());
	}

}
