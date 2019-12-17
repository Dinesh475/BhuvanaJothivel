package Interface_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		while(true) {
		System.out.println("1. Bowler\n2. Batsman\n3. Wicket Keeper\n4. AllRounder\nEnter choice");
		int op = in.nextInt();
		switch(op) {
		case 1:{
			System.out.println("Enter the Bowler Details");
			in.nextLine();
			System.out.println("Enter player name");
			String name = in.nextLine();
			System.out.println("Enter team name");
			String tname = in.nextLine();
			System.out.println("Enter number of matches played");
			int mp = in.nextInt();
			System.out.println("Enter number of wickets taken");
			int wt = in.nextInt();
			Bowler bw = new Bowler(name,tname,mp,wt);
			bw.displayPlayerStatistics();
			break;
		}
		case 2:{
			System.out.println("Enter the Bowler Details");
			in.nextLine();
			System.out.println("Enter player name");
			String name = in.nextLine();
			System.out.println("Enter team name");
			String tname = in.nextLine();
			System.out.println("Enter number of matches played");
			int mp = in.nextInt();
			System.out.println("Enter the runs scored");
			long rs = in.nextLong();
			Batsman bm = new Batsman(name,tname,mp,rs);
			bm.displayPlayerStatistics();
			break;
		}
		case 3:{
			System.out.println("Enter the AllRounder Details");
			in.nextLine();
			System.out.println("Enter player name");
			String name = in.nextLine();
			System.out.println("Enter team name");
			String tname = in.nextLine();
			System.out.println("Enter number of matches played");
			int mp = in.nextInt();
			System.out.println("Enter number of catches taken");
			int ct = in.nextInt();
			System.out.println("Enter number of stumpings");
			int st = in.nextInt();
			System.out.println("Enter number of dismissals");
			int dm = in.nextInt();
			System.out.println("Enter the runs scored");
			long rs = in.nextLong();
			WicketKeeper wk = new WicketKeeper(name,tname,mp,ct,st,rs,dm);
			wk.displayPlayerStatistics();
			break;
		}
		case 4:{
			System.out.println("Enter the AllRounder Details");
			in.nextLine();
			System.out.println("Enter player name");
			String name = in.nextLine();
			System.out.println("Enter team name");
			String tname = in.nextLine();
			System.out.println("Enter number of matches played");
			int mp = in.nextInt();
			System.out.println("Enter the runs scored");
			long rs = in.nextLong();
			System.out.println("Enter number of wickets taken");
			int wt = in.nextInt();
			AllRounder ar = new AllRounder(name,tname,mp,rs,wt);
			ar.displayPlayerStatistics();
			break;
		}
		default: System.exit(0);
		}
		System.out.println("Do you want to continue? (Yes/No)");
		in.nextLine();
		String opt = in.nextLine();
		if(opt.equalsIgnoreCase("Yes"))
			continue;
		else
			break;
		}

	}

}
