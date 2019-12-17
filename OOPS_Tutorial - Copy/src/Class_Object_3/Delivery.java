package Class_Object_3;

import java.util.Scanner;

public class Delivery {
	long over;
	long ball;
	long run;
	String batsname;
	String bowsname;
	String nsname;
	Scanner in = new Scanner (System.in);
	Delivery(){
	System.out.println("Enter the over");
	this. over= in.nextLong();
	System.out.println("Enter the ball");
	this. ball= in.nextLong();
	System.out.println("Enter the runs");
	this. run= in.nextLong();
	in.nextLine();
	System.out.println("Enter the batmans name");
	this. batsname= in.nextLine();
	System.out.println("Enter the bowler name");
	this. bowsname= in.nextLine();
	System.out.println("Enter the nonStricker name");
	this. nsname= in.nextLine(); }
	public void displayAllDeliveryDetails() {
		System.out.println("Over: "+over);
		System.out.println("Ball: "+ball);
		System.out.println("Runs: "+run);
		System.out.println("Batsman: "+batsname);
		System.out.println("Bowler: "+bowsname);
		System.out.println("NonStricker: "+nsname);
	}	
}
