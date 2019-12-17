package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = 5;
		
		List<String> list = new ArrayList<String>();
		String pname;
		while(n>0) {
			pname = in.nextLine();
			list.add(pname);
			n--;
		}
		System.out.println("Enter swap positions");
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		Collections.swap(list,p1,p2);
		Iterator itr = list.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}

	}
}
