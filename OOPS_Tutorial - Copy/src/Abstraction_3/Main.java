package Abstraction_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the cricket format\n1. ODI\n2. T20\n3. Test");
		int op = in.nextInt();
		System.out.println("Enter the current score");
		int cs = in.nextInt();
		System.out.println("Enter the current over");
		float co = in.nextFloat();
		System.out.println("Enter the target score");
		int ts = in.nextInt();
		switch(op) {
		case 1:{
			System.out.println("Requirements:");
			Match c = new ODImatch(cs,co,ts);
			ODImatch m = new ODImatch(cs,co,ts);
			System.out.printf("Need %.0f Runs in %d balls",m.calculateRunrate(),m.calculateBalls());
			c.display(m.calculateRunrate(),m.calculateBalls());
			break;
		}
		case 2:{
			System.out.println("Requirements:");
			Match c = new ODImatch(cs,co,ts);
			T20match m1 = new T20match(cs,co,ts);
			System.out.printf("Need %.0f Runs in %d balls",m1.calculateRunrate(),m1.calculateBalls());
			c.display(m1.calculateRunrate(),m1.calculateBalls());
			break;
			
		}
		case 3:{
			System.out.println("Requirements:");
			Match c = new ODImatch(cs,co,ts);
			TestMatch m2 = new TestMatch(cs,co,ts);
			System.out.printf("Need %.0f Runs in %d balls",m2.calculateRunrate(),m2.calculateBalls());
			c.display(m2.calculateRunrate(),m2.calculateBalls());
			break;
			
		}
		default: System.exit(0);
		}


	}

}
