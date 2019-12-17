package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections_9 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		String pname;
		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			pname = in.nextLine();
			list.add(pname);
		}
		while(true) {
			System.out.println("Menu\n1. Insert players\n2. Delete players");
			int op = in.nextInt();
			in.nextLine();
			switch(op) {
			case 1: String name = in.nextLine();
			list.add(name);
			System.out.println("Player details after insertion");
			Iterator itr = list.iterator();
			while(itr.hasNext()){  
				System.out.println(itr.next());
			}
			break;
			case 2: String dname = in.nextLine();
			list.remove(dname);
			System.out.println("Player details after deletion");
			Iterator itr1 = list.iterator();
			while(itr1.hasNext()){  
				System.out.println(itr1.next());
			}
			break;
			default: System.exit(0);
			}
			System.out.println("Do you want to continue? (Yes/No)");
			String opt = in.nextLine();
			if(opt.equalsIgnoreCase("Yes"))
				continue;
			else
				break;
		}
	}
}
