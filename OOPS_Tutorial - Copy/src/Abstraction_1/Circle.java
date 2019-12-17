package Abstraction_1;

public class Circle extends Shape {
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float calculateArea() {
		float pi = 3.14f;
		float area = pi*this.getRadius()*this.getRadius() ;
		return area;
	}
}
