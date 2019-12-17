package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the team name");
		String tname = in.nextLine();
		System.out.println("Enter the number of matches played in home ground");
		int hg = in.nextInt();
		System.out.println("Enter the runs scored");
		int hruns;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<hg;i++) {
			hruns = in.nextInt();
			list.add(hruns);
		}
		System.out.println("Enter the number of matches played in other ground");
		int og = in.nextInt();
		System.out.println("Enter the runs scored");
		int oruns;
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<og;i++) {
			oruns = in.nextInt();
			list1.add(oruns);
		}
		list.addAll(list1);
		System.out.println("Runs scored by "+tname);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			int num = (int)itr.next();
			System.out.println(num);
		}
		System.out.println("Runs scored by "+tname+" more than 300");
		Iterator itr1 = list.iterator();
		while(itr1.hasNext()) {
			int num = (int)itr1.next();
			if(num>300)
			System.out.println(num);
		}
	}
}
