package Polymorphism_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter player name");
		String name = in.nextLine();
		System.out.println("Enter team name");
		String tname = in.nextLine();
		System.out.println("Enter number of matches");
		int mat = in.nextInt();
		System.out.println("Menu\n1. Bowler Details\n2. Batsman Details\nEnter choice");
		int op = in.nextInt();
		switch(op) {
		case 1:{
			System.out.println("Enter number of wickets taken");
			int wt = in.nextInt();
			Bowler bow = new Bowler(name,tname,mat,wt);
			bow.displayDetails();
			break;
		}
		case 2:{
			System.out.println("Enter number of runs scored");
			int runs = in.nextInt();
			Batsman bat = new Batsman(name,tname,mat,runs);
			bat.displayDetails();
			break;
		}
		default: System.exit(0);
		}
		

	}

}
