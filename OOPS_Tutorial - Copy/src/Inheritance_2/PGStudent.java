package Inheritance_2;

public class PGStudent extends Student{
	private String specialization;
	private int numberOfPapersPublished;
	
	public PGStudent(String name, String id, int age, double grade, String address, String specialization,
			int numberOfPapersPublished) {
		super(name, id, age, grade, address);
		this.specialization = specialization;
		this.numberOfPapersPublished = numberOfPapersPublished;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNumberOfPapersPublished() {
		return numberOfPapersPublished;
	}
	public void setNumberOfPapersPublished(int numberOfPapersPublished) {
		this.numberOfPapersPublished = numberOfPapersPublished;
	}
	void display() {
		System.out.println("PG Student Detail");
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Age: "+this.age);
		System.out.println("Grade: "+this.grade);
		System.out.println("Address: "+this.address);
		System.out.println("Specialization: "+this.specialization);
		System.out.println("Number Of Papers Published: "+this.numberOfPapersPublished);
	}
	boolean isPassed() {
		if(this.grade>50)
			return true;
		else
			return false;
	}
}
