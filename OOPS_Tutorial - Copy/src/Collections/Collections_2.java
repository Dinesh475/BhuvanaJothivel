package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int num;
		List<Integer> list = new ArrayList<Integer>(); 
		for(int i=0;i<n;i++) {
			num = in.nextInt();
			list.add(num);
		}
		Collections.sort(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}
	}
}
