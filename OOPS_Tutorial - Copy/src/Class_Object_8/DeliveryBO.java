package Class_Object_8;

public class DeliveryBO {
	void deliveryAllDeliveryDetails(Delivery[] Deliverylist) {
		System.out.println("Delivery Details");
		System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s", "OVER","BALLS","RUNS","BATSMAN","BOWLERS","NONSTRICKER"));
		for(Delivery d : Deliverylist ) {
		System.out.println(d.toString());}
	}
	void deliveryBatsmanBowlerDetails(Delivery[] Deliverylist, long ball, long over) {
		for(Delivery d : Deliverylist ) {
			if(d.getBall()==ball && d.getOver()==over) {
				System.out.println("Batsman: "+ d.getBatsname());
				System.out.println("Bowler: "+ d.getBowler());
			}
		}
	}
	void displayMaximumRunDetails(Delivery[] Deliverylist) {
		Long max=0L,o=0L,b=0L;
		for(Delivery d : Deliverylist) {
			if(max<d.getRuns()) {
				max = d.getRuns();
				o = d.getOver();
				b = d.getBall();
			}
		}
		System.out.println("Maximum Runs: "+max);
		System.out.println("Over: "+o);
		System.out.println("Ball: "+b);
	}
}
