package Inheritance_5;

public class DeluxeRoom extends HotelRoom{
	private int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		if(this.isHasWifi()) {
		int total = this.numberOfSqFeet*ratePerSqFeet;
		return total;
		}
		else {
			int total = this.numberOfSqFeet*(ratePerSqFeet+2);
			return total;
		}
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
}
