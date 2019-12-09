package Inheritance_2;

public class UGStudent extends Student {
	private String degree;
	private String stream;
	public UGStudent(String name, String id, int age, double grade, String address, String degree, String stream) {
		super(name, id, age, grade, address);
		this.degree = degree;
		this.stream = stream;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	void display() {
		System.out.println("UG Student Detail");
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Age: "+this.age);
		System.out.println("Grade: "+this.grade);
		System.out.println("Address: "+this.address);
		System.out.println("Degree: "+this.degree);
		System.out.println("Stream: "+this.stream);
	}
	boolean isPassed() {
		if(this.grade>50)
			return true;
		else
			return false;
	}
}
