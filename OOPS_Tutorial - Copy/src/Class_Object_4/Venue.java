package Class_Object_4;

import java.util.Scanner;

public class Venue {
	Scanner in = new Scanner(System.in);
	String venue;
	String city;
	public void Venue() {
		System.out.println("Enter the venue name");
		this.venue = in.nextLine();
		System.out.println("Enter the city name");
		this.city = in.nextLine();
	}
	public String toString() {
		return("Venue Name: " +venue+ "\nCity Name: "+city);
	}
}
