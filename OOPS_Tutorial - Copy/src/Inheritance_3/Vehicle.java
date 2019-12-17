package Inheritance_3;

public class Vehicle {
	protected String make;
	protected String vehicalNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public Vehicle(String make, String vehicalNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicalNumber = vehicalNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicalNumber() {
		return vehicalNumber;
	}
	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void displayMAke() {
		System.out.println("*** "+this.getMake()+" ***");
	}
	public void displayBasicInfo() {
		System.out.println("--- Basic Information ---");
		System.out.println("Vehicle Number: "+this.getVehicalNumber());
		System.out.println("Fuel Capacity: "+this.getFuelCapacity());
		System.out.println("Fuel Type: "+this.getFuelType());
		System.out.println("CC: "+this.getCc());
	}
	public void displayDetailInfo() {
		System.out.println("--- Detail Information ---");
	}
}
