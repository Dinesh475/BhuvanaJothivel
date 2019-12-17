package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int count=0;
		in.nextLine();
		String actual_ven = in.nextLine();
		String ven;
		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			ven = in.nextLine();
			list.add(ven);
		}
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String temp = (String)itr.next();
			if(temp.equalsIgnoreCase(actual_ven))
				count++;
		}
		System.out.println(count);
	}
}
