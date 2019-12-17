package Inheritance_4;

public class Student {
	private String name;
	private String gender;
	private String iDnum;
	private int age;
	private double cgpa;
	public Student(String name, String gender, String iDnum, int age, double cgpa) {
		super();
		this.name = name;
		this.gender = gender;
		this.iDnum = iDnum;
		this.age = age;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getiDnum() {
		return iDnum;
	}
	public void setiDnum(String iDnum) {
		this.iDnum = iDnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nGender: " + gender + "\nID Number: " + iDnum + "\nAge: " + age + "\nCgpa: " + cgpa;
	}
}
