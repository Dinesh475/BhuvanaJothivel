package Inheritance_1;

public class Bill {
	private int bill;
	private String name;
	public Bill(int bill, String name) {
		super();
		this.bill = bill;
		this.name = name;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void genetrateBill() {
		System.out.println("Bill Number: "+this.bill);
		System.out.println("Customber Name: "+this.name);
	}
}
