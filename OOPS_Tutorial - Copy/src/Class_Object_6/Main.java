package Class_Object_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Venue p = new Venue();
		System.out.println("Enter the venue name");
		p.setName();
		System.out.println("Enter the city name");
		p.setCity();
		System.out.println("Venue details");
		System.out.println("Venue name: "+p.getName());
		System.out.println("City name: "+p.getCity());
		System.out.println("Verify and update venue details");
		System.out.println("Menu");
		System.out.println("1. Update Venue name\n2. Update City name\n3. All informations are correct/exit\nType 1 or 2 or 3");
		int ch = in.nextInt();
		switch(ch) {
		case 1: {
			System.out.println("Enter the venue name");
			p.setName();
			System.out.println("Venue details");
			System.out.println("Venue name: "+p.getName());
		    System.out.println("City name: "+p.getCity());
			break; }
		case 2: {
			System.out.println("Enter the city name");
			p.setCity();
			System.out.println("Venue details");
			System.out.println("Venue name: "+p.getName());
		    System.out.println("City name: "+p.getCity());
			break; }
		case 3: {
			System.out.println("Venue details");
			System.out.println("Venue name: "+p.getName());
		    System.out.println("City name: "+p.getCity()); }
		}

	}

}
