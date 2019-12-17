package Polymorphism_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter player name");
		String name = in.nextLine();
		System.out.println("Enter player country");
		String coun = in.nextLine();
		System.out.println("Enter the cap number");
		String cap = in.nextLine();
		System.out.println("Enter number of test appearance");
		long ta = in.nextLong();
		System.out.println("Enter number of ODI appearance");
		long oa = in.nextLong();
		System.out.println("Player Details");
		InternationalPlayer ip = new InternationalPlayer(name,coun,cap,ta,oa);
		ip.displayDetails();

	}

}
