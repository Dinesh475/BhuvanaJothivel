package Inheritance_1;

public class currentBill extends Bill{
	private int numberOfUnitsConsumed;
	private double costPerUnit;
	
	public currentBill(int bill, String name, int numberOfUnitsConsumed, double costPerUnit) {
		super(bill, name);
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
		this.costPerUnit = costPerUnit;
	}
	public int getNumberOfUnitsConsumed() {
		return numberOfUnitsConsumed;
	}
	public void setNumberOfUnitsConsumed(int numberOfUnitsConsumed) {
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
	}
	public double getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(double costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public void genetrateBill() {
		double ans = this.numberOfUnitsConsumed*this.costPerUnit;
		System.out.printf("Current Bill Amount: %.1f\n",ans);
	}
}
