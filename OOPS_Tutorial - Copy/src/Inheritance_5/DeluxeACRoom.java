package Inheritance_5;

public class DeluxeACRoom extends DeluxeRoom {
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
	}
	public int getRatePerSqFeet() {
		return numberOfSqFeet*12;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {

	}
}
