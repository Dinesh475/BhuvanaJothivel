package Inheritance_2;

public class Student {
	protected String name;
	protected String id;
	protected int age;
	protected double grade;
	protected String address;
	public Student(String name, String id, int age, double grade, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void display() {
		System.out.println("Student Detail");
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Age: "+this.age);
		System.out.println("Grade: "+this.grade);
		System.out.println("Address: "+this.address);
	}
	boolean isPassed() {
		if(this.grade>50)
			return true;
		else
			return false;
	}
}
