package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections_16 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		String name;
		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			name = in.nextLine();
			if(name.contains("0-0"))
				list.add(name);
		}
		List<String> list1 = new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			String x[] = list.get(i).split("-",3);
			list1.add(x[0]);
		}
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String a = (String)itr.next();
			System.out.println(a);
		}
	}
}
