package Inheritance_4;

public class CollegeStudent extends Student {
	private String major;
	private int year;
	public CollegeStudent(String name, String gender, String iDnum, int age, double cgpa, String major, int year) {
		super(name, gender, iDnum, age, cgpa);
		this.major = major;
		this.year = year;
	}
	public String getMajor() {
		return major;}
	public void setMajor(String Major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		
		return "Name: "+this.getName()+"\nGender: "+this.getGender()+"\nAge: "+this.getAge()+"\nIDNum: "+this.getiDnum()+"\nCGAP: "+this.getCgpa()+ "\nMajor: " + major + "\nYear: " + year;
	}
}
