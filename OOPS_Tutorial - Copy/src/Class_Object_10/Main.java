package Class_Object_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the city count");
		int n = in.nextInt();
		City c[] = new City[n];
		in.nextLine();
		String city;
		City ci[] = new City[n];
		CityBO cbo = new CityBO();
		for(int i=0;i<n;i++) {
			System.out.println("Enter city "+(i+1)+" detail");
			city= in.nextLine();
			ci[i] = cbo.createCity(city);
		}
		System.out.println("Enter the venue count");
		int vn = in.nextInt();
		in.nextLine();
		String v;
		Venue_3 ve[] = new Venue_3[n];
		Venue_3_BO vbo = new Venue_3_BO();
		for(int j=0;j<vn ;j++) {
			System.out.println("Enter venue "+(j+1)+" detail");
			v = in.nextLine();

			ve[j] = vbo.createVenue_3(v,ci);
		}	
		System.out.println("Enter the match count");
		int o = in.nextInt();
		in.nextLine();
		String mt;
		Match_1 m[] = new Match_1[n];
		Match_1_BO mbo = new Match_1_BO();
		for(int k=0;k<o;k++) {
			System.out.println("Enter match "+(k+1)+" detail");
			mt = in.nextLine();
			m[k] = mbo.createMatch_1(mt,ve);
		}
		System.out.println("Menu");
		System.out.println("1. Find Venue\n2. Find All Matches In A Specific Venue\nType 1 or 2");
		while(true) {
			System.out.println("Enter your choice");
			int ch = in.nextInt();
			in.nextLine();
			switch(ch) {
			case 1: {
				System.out.println("Enter match date");
				String d1 = in.nextLine();
				System.out.print("Match was held at "); 
				mbo.findVenue_3(d1,m);
			}
			System.out.println("Do you want to continue(Yes/No)");
			String asd = in.nextLine();
			if(asd.equalsIgnoreCase("yes"))
				continue;
			else
				break;
			case 2: {
				System.out.println("Enter venue name");
				String d1 = in.nextLine();
				System.out.println("Matches in venue "+d1+" are");
				mbo.findAllMatchesInGivenVenue_3(d1,m);
			}
			default: System.exit(0);
			
			}
		}

	}

}
