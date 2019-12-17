package Interface_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("1. Cricket Player Details\n2. Hockey Player Details\nEnter choice");
		int op = in.nextInt();
		in.nextLine();
		System.out.println("Enter player name");
		String name = in.nextLine();
		System.out.println("Enter team name");
		String tname = in.nextLine();
		System.out.println("Enter number of matches played");
		int mp = in.nextInt();
		switch(op) {
		case 1:{
			System.out.println("Enter total runs scored");
			long rs = in.nextLong();
			System.out.println("Enter total number of wickets taken");
			int wt = in.nextInt();
			CricketPlayer cp = new CricketPlayer(name,tname,mp,rs,wt);
			System.out.println("Player Details");
			cp.displayPlayerStatistics();
			break;
		}
		case 2:{
			System.out.println("Enter the position");
			in.nextLine();
			String pos = in.nextLine();
			System.out.println("Enter total number of goals taken");
			int gt = in.nextInt();
			HockeyPlayer hp = new HockeyPlayer(name,tname,mp,pos,gt);
			System.out.println("Player Details");
			hp.displayPlayerStatistics();
			break;
		}
		default: System.exit(0);
		}
	}

}
