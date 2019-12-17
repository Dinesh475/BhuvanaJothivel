package Interface_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter player name");
		String pname = in.nextLine();
		System.out.println("Enter team name");
		String tname = in.nextLine();
		System.out.println("Enter number of matches played");
		int mp = in.nextInt();
		System.out.println("Enter total runs scored");
		long rs = in.nextLong();
		System.out.println("Enter number of wickets taken");
		int wt = in.nextInt();
		Player p = new Player(pname,tname,mp,rs,wt);
		System.out.println("Player Details");
		p.displayPlayerStatistics();
	}

}
