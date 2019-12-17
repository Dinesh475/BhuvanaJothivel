package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_5 {
public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n = 5, n1 = 5;
		List<String> list = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 8");
		String pname;
		while(n>0) {
			pname = in.nextLine();
			list.add(pname);
			n--;
		}
		List<String> list1 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 9");
		String pname1;
		while(n1>0) {
			pname1 = in.nextLine();
			list1.add(pname1);
			n1--;
		}
		list.retainAll(list1);
		System.out.println("Consistent run scorers");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String temp = (String)itr.next();
				System.out.println(temp);
		}

	}
}
