package Collections_set1;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		TreeSet<Revenue> tsrev = new TreeSet<Revenue>();
		List<String> l = new ArrayList<String>();
		Revenue rec[] = new Revenue[5];
		int i = 0;
		while(true) {
			System.out.println("Enter revenue category");
			String revenue = in.nextLine();
			System.out.println("Enter revenue amount");
			int amount = in.nextInt();
			rec[i] = new Revenue(revenue,amount);
			in.nextLine();
			System.out.println("Do you want to continue");
			String op = in.nextLine();
			tsrev.add(rec[i]);
			if(op.equalsIgnoreCase("Yes")) {
				i++;
				continue; }
			else
				break;
		}
		System.out.println("Top spending categories");
		System.out.println(String.format("%-15s%-15s", "Category","Amount"));
		System.out.println(tsrev);	
	}
}
