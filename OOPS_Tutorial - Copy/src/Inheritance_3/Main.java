package Inheritance_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. Four Wheeler\n2. Two Wheeler");
		System.out.println("Enter Vehicle Type");
		int ch = in.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Vehicle Make");
			in.nextLine();
			String make = in.nextLine();
			System.out.println("Vehicle Number");
			String num = in.nextLine();
			System.out.println("Fuel Type\n1. Petrol\n2. Diesel");
			int ftype = in.nextInt();
			String fuel;
			if(ftype == 1)
				 fuel = "Petrol";
			else
				 fuel = "Diesel";
			System.out.println("Fuel Capacity");
			int fcap = in.nextInt();
			System.out.println("Enter CC");
			int cc = in.nextInt();
			System.out.println("Audio System");
			in.nextLine();
			String ausys = in.nextLine();
			System.out.println("Number of doors");
			int door = in.nextInt();
			Vehicle v = new Vehicle(make,num,fuel,fcap,cc);
			v.displayMAke();
			v.displayBasicInfo();
			FourWheeler fw = new FourWheeler(make,num,fuel,fcap,cc,ausys,door);
			v.displayDetailInfo();
			fw.displayDetailInfo();
		}
		case 2: {
			System.out.println("Vehicle Make");
			in.nextLine();
			String make = in.nextLine();
			System.out.println("Vehicle Number");
			String num = in.nextLine();
			System.out.println("Fuel Type\n1. Petrol\n2. Diesel");
			int ftype = in.nextInt();
			String fuel;
			if(ftype == 1)
				 fuel = "Petrol";
			else
				 fuel = "Diesel";
			System.out.println("Fuel Capacity");
			int fcap = in.nextInt();
			System.out.println("Enter CC");
			int cc = in.nextInt();
			System.out.println("Kick Strart Available (Yes/No)");
			in.nextLine();
			String kick = in.nextLine();
			boolean kickstart;
			if(kick.equals(" Yes"))
				kickstart = true;
			else
				kickstart = false;
			Vehicle v = new Vehicle(make,num,fuel,fcap,cc);
			v.displayMAke();
			v.displayBasicInfo();
			TwoWheeler tw = new TwoWheeler(make,num,fuel,fcap,cc,kickstart);
			v.displayDetailInfo();
			tw.displayDetailInfo();
		}
		}

	}

}
