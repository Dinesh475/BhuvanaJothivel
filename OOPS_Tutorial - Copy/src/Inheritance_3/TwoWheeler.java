package Inheritance_3;

public class TwoWheeler extends Vehicle{
private boolean kickStartAvailable;

	
	public TwoWheeler(String make, String vehicalNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicalNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}


	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}


	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}


	public void displayDetailInfo() {
		if( kickStartAvailable)
		System.out.println("Kick Start Available: YES");
		else
			System.out.println("Kick Start Available: NO");	
	}
}
