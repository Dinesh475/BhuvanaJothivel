package Class_Object_1;

import java.util.Scanner;

public class Players {
	String name;
	String country;
	String skill;
	public void Players() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the player name");
		this.name = in.nextLine();
		System.out.println("Enter the country name");
		this.country = in.nextLine();
		System.out.println("Enter the skill");
		this.skill = in.nextLine();
	}
	public String toString() {
		return("Player Name: " +name+ "\nCountry Name: "+country+ "\nSkill: " +skill);
	}
}
