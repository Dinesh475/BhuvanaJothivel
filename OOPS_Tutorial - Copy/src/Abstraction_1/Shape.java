package Abstraction_1;

public abstract class Shape {
	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public float calculateArea() {
		return 1.1f;
	}
}
