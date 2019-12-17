package Inheritance_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room");
		System.out.println("Select Room Type");
		int ch = in.nextInt();
		in.nextLine();
		switch(ch) {
		case 1: {
			System.out.println("Hotel Name");
			String name = in.nextLine();
			System.out.println("Room Square Feet Area");
			int area = in.nextInt();
			in.nextLine();
			System.out.println("Room has TV(Yes/N0");
			String op = in.nextLine();
			boolean a;
			if(op.equals("Yes"))
				a = true;
			else
				a = false;
			System.out.println("Room has Wifi(Yes/No");
			in.nextLine();
			String opt = in.nextLine();
			boolean b;
			if(opt.equals("Yes"))
				b = true;
			else
				b = false;
			DeluxeRoom d = new DeluxeRoom(name,area,a,b,10);
			System.out.println("Room Tariff per day: "+d.getRatePerSqFeet());
			break;
		}
		case 2:{
			System.out.println("Hotel Name");
			String name = in.nextLine();
			System.out.println("Room Square Feet Area");
			int area = in.nextInt();
			in.nextLine();
			System.out.println("Room has TV(Yes/N0");
			String op = in.nextLine();
			boolean a;
			if(op.equals("Yes"))
				a = true;
			else
				a = false;
			System.out.println("Room has Wifi(Yes/No");
			in.nextLine();
			String opt = in.nextLine();
			boolean b;
			if(opt.equals("Yes"))
				b = true;
			else
				b = false;
			DeluxeACRoom dac = new DeluxeACRoom(name,area,a,b,12);
			System.out.println("Room Tariff per day: "+dac.getRatePerSqFeet());
			break;
		}
		case 3:
		{
			System.out.println("Hotel Name");
			String name = in.nextLine();
			System.out.println("Room Square Feet Area");
			int area = in.nextInt();
			in.nextLine();
			System.out.println("Room has TV(Yes/N0");
			String op = in.nextLine();
			boolean a;
			if(op.equals("Yes"))
				a = true;
			else
				a = false;
			System.out.println("Room has Wifi(Yes/No");
			in.nextLine();
			String opt = in.nextLine();
			boolean b;
			if(opt.equals("Yes"))
				b = true;
			else
				b = false;
			SuiteACRoom sac = new SuiteACRoom(name,area,a,b,15);
			System.out.println("Room Tariff per day: "+sac.getRatePerSqFeet());
			break;
		}
		default:
			System.exit(0);
	}

	}

}
