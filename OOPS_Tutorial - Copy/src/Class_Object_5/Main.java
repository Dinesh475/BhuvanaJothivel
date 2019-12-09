package Class_Object_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int n = in.nextInt();
		Wicket w[] = new Wicket[n];
		for(int i=0;i<n;i++) {    
			System.out.println("Enter the details of wicket"+(i+1));
			String wd = in.next();
			String a[] = wd.split(",");
			w[i]=new Wicket(Long.valueOf(a[0]),Long.valueOf(a[1]),a[2],a[3],a[4]);
		}
		System.out.println("Wicket Details");
		for(int i=0;i<n;i++) {    
			System.out.println("Over: "+w[i].getOver());
			System.out.println("Ball: "+w[i].getBall());
			System.out.println("Wicket Type: "+w[i].getWtype());
			System.out.println("Player Name: "+w[i].getPname());
			System.out.println("Bowler Name: "+w[i].getBname());
		}

	}

}
