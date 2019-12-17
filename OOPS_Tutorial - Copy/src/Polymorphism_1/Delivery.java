package Polymorphism_1;

public class Delivery {
	void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Bowler - "+bowler);
		System.out.println("Batsman - "+batsman);
	}
	void displayDeliveryDetails(long run) {
		System.out.println("Number of runs scored in the delivery - "+run);
		if(run==4||run==6)
			System.out.println("It is a boundary");
	}
}
