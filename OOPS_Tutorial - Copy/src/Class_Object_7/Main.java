package Class_Object_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of deliveries");
		int n = in.nextInt();
		Delivery d2[] = new Delivery[n];
		DeliveryBO db = new DeliveryBO();
		for(int i=0;i<n;i++) {    
			System.out.println("Enter the over");
			long over = in.nextInt();
			System.out.println("Enter the ball");
			long ball = in.nextInt();
			System.out.println("Enter the batsman");
			in.nextLine();
			String btnm = in.nextLine();
			System.out.println("Enter the bowler");
			String bwnm = in.nextLine();
			System.out.println("Enter the nonStricker");
			String nsnm = in.nextLine();
			d2[i]=new Delivery(over,ball,btnm,bwnm,nsnm);
		}
		System.out.println("Delivery Details");
		db.displayAllDeliveryDetails(d2);

	}

}
