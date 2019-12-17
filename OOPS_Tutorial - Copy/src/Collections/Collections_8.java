package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("Enter player name");
		String pname = in.nextLine();
		list.add(pname);
		System.out.println("Enter age");
		String age = in.nextLine();
		list.add(age);
		System.out.println("Enter country");
		String count = in.nextLine();
		list.add(count);
		
		System.out.println("Player details");
		Iterator itr = list.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}
		
		System.out.println("Enter Skill");
		String skill = in.nextLine();
		System.out.println("Enter the position to add the skill");
		int p1 = in.nextInt();
		list.set(p1,skill);
		
		System.out.println("Player details");
		Iterator itr1 = list.iterator();
		while(itr1.hasNext()){  
			System.out.println(itr1.next());
		}
		
		System.out.println("Enter the position of the detail to be removed");
		int p2 = in.nextInt();
		list.remove(p2);
		
		System.out.println("Player details");
		Iterator itr2 = list.iterator();
		while(itr2.hasNext()){  
			System.out.println(itr2.next());
		}
		
	}
}
