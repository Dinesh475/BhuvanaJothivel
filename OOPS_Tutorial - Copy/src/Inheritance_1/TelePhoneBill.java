package Inheritance_1;

public class TelePhoneBill extends Bill {
	private int numberOfCallsMade;
	private double costPerCall;
	
	public TelePhoneBill(int bill, String name, int numberOfCallsMade, double costPerCall) {
		super(bill, name);
		this.numberOfCallsMade = numberOfCallsMade;
		this.costPerCall = costPerCall;
	}
	public int getNumberOfCallsMade() {
		return numberOfCallsMade;
	}
	public void setNumberOfCallsMade(int numberOfCallsMade) {
		this.numberOfCallsMade = numberOfCallsMade;
	}
	public double getCostPerCall() {
		return costPerCall;
	}
	public void setCostPerCall(double costPerCall) {
		this.costPerCall = costPerCall;
	}
	public void genetrateBill() {
		double total = this.numberOfCallsMade*this.costPerCall;
		System.out.printf("Telephone Bill Amount: %.1f\n",total);
	}
}
