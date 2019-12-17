package Abstraction_1;

public class Square extends Shape {
	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	public float calculateArea() {
		float area = this.getSide()*this.getSide();
		return area;
	}
}
