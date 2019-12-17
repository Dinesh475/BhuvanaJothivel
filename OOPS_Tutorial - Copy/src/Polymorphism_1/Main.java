package Polymorphism_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Menu\n1. Player details of the delivery\n2. Run details of the delivery");
		int op = in.nextInt();
		Delivery d = new Delivery();
		switch(op) {
		case 1:{
			System.out.println("Enter the bowler name");
			in.nextLine();
			String bow = in.nextLine();
			System.out.println("Enter the batsman name");
			String bat = in.nextLine();
			System.out.println("Player details of the delivery");
			d.displayDeliveryDetails(bow, bat);
			break;
		}
		case 2:{
			System.out.println("Enter the number of runs");
			int run = in.nextInt();
			d.displayDeliveryDetails(run);
			break;
		}
		default: System.exit(0);
		}

	}

}
