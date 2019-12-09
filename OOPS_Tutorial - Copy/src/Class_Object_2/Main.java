package Class_Object_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String name = in.nextLine();
		System.out.println("Enter the city name");
		String city = in.nextLine();
		Venue v = new Venue(name,city);
		System.out.println("Venue Details");
		System.out.print(v.toString());

	}

}
