package Class_Object_6;

import java.util.Scanner;

public class Venue {
	Scanner in = new Scanner(System.in);
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public void setName() {
		this.name = in.nextLine();
	}
	public void setCity() {
		this.city = in.nextLine();
	}
}
