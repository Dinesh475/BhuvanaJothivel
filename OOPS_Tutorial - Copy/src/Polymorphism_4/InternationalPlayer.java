package Polymorphism_4;

public class InternationalPlayer extends Player{
	private String capNumber;
	private long noOfTestAppearance;
	private long noOfODIAppearance;
	public InternationalPlayer(String name, String country, String capNumber, long noOfTestAppearance,
			long noOfODIAppearance) {
		super(name, country);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}
	public String getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(String capNumber) {
		this.capNumber = capNumber;
	}
	public long getNoOfTestAppearance() {
		return noOfTestAppearance;
	}
	public void setNoOfTestAppearance(int noOfTestAppearance) {
		this.noOfTestAppearance = noOfTestAppearance;
	}
	public long getNoOfODIAppearance() {
		return noOfODIAppearance;
	}
	public void setNoOfODIAppearance(int noOfODIAppearance) {
		this.noOfODIAppearance = noOfODIAppearance;
	}
	public void displayDetails() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Country name: "+this.getCountry());
		System.out.println("Cap number: "+this.getCapNumber());
		System.out.println("Number of test appearance: "+this.getNoOfTestAppearance());
		System.out.println("Number of ODI appearance: "+this.getNoOfODIAppearance());
	}
}
