package Class_Object_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of delivery details");
		int n = in.nextInt();
		Delivery d[] = new Delivery[n];
		DeliveryBO d1 = new DeliveryBO();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Over");
			long over = in.nextLong();
			System.out.println("Enter the Ball");
			long ball = in.nextLong();
			System.out.println("Enter the Runs");
			long run = in.nextLong();
			in.nextLine();
			System.out.println("Enter the batsman name");
			String bn = in.nextLine();
			System.out.println("Enter the bowlers name");
			String bwn = in.nextLine();
			System.out.println("Enter the nonStrickers name");
			String nsn = in.nextLine();
			d[i] = new Delivery(over,ball,run,bn,bwn,nsn);
		}
		System.out.println("Enter Your Choice");
		System.out.println("1.View Delivery Details\n2. Batsman and Bowlers\n3. Maximum runs");
		int ch = in.nextInt();
		switch(ch) {
		case 1: {
			d1.deliveryAllDeliveryDetails(d);
			break;
		}
		case 2: {
			System.out.println("Enter the over for which batsman and bowler to be known");
			Long o = in.nextLong();
			System.out.println("Enter the ball for which batsman and bowler to be known");
			Long b = in.nextLong();
			d1.deliveryBatsmanBowlerDetails(d, b, o);
			break;
			
		}
		case 3: {
			d1.displayMaximumRunDetails(d);
			break;
		}
		default: System.exit(0);
		}



	}

}
