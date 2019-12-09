package Class_Object_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of matches");
		int n = in.nextInt();
		Match m1[] = new Match[n];
		Outcome o1[] = new Outcome[n];
		MatchBO mbo1 = new MatchBO();
		in.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter match "+(i+1)+" details");
			System.out.println("Enter match date");
			String date = in.nextLine();
			System.out.println("Enter team one");
			String t1 = in.nextLine();
			System.out.println("Enter team two");
			String t2 = in.nextLine();
			System.out.println("Enter venue");
			String venue = in.nextLine();
			System.out.println("Enter status");
			String status = in.nextLine();
			System.out.println("Enter winner team");
			String wteam = in.nextLine();
			m1[i] = new Match(date,t1,t2,venue,o1[i] = new Outcome(status,wteam));
		}		
		while(true) {
			System.out.println("Menu");
			System.out.println("1. View Match Details\n2. Filter match details with outcome status\n3. Filter match details with outcome winner team");
			int ch = in.nextInt();
			in.nextLine();
			switch(ch) {
			case 1: {
				mbo1.printAllMatchDetails(m1);
				break;
			}
			case 2: {
				System.out.println("Enter outcome status");
				String os = in.nextLine();
				mbo1.printAllMatchDetailsWithOutcomeStatus(m1, os);
				break;
			}
			case 3: {
				System.out.println("Enter outcome winner team");
				String ow = in.nextLine();
				mbo1.printAllMatchDetailsWithOutcomeWinnerTeam(m1,ow);
				break;
			}
			case 4:
				System.exit(0);
			}
			if(ch>=4)
				break;
		}

	}

}
