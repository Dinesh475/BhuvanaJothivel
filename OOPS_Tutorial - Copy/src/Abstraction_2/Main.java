package Abstraction_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Select the card\n1. Payback Card\n2. Membership Card");
		int n = in.nextInt();
		in.nextLine();
		switch(n) {
		case 1:{
			System.out.println("Enter the card details");
			String detail = in.nextLine();
			String s[] = detail.split("|");
			String name = s[0];
			String num = s[1];
			String date = s[2];
			System.out.println("Enter points in card");
			int pt = in.nextInt();
			System.out.println("Enter amount");
			double amount = in.nextDouble();
			PaybackCard pc = new PaybackCard(name,num,date,pt,amount);
			System.out.println(pc.toString());
			break;
		}
		case 2:{
			System.out.println("Enter the card details");
			String detail = in.nextLine();
			String s[] = detail.split("|");
			String name = s[0];
			String num = s[1];
			String date = s[2];
			System.out.println("Enter rating in card");
			int rate = in.nextInt();
			MembershipCard mc = new MembershipCard(name,num,date,rate);
			System.out.println(mc.toString());
			break;
		}
		default: System.exit(0);
		}


	}

}
