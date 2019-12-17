package Collections;

import java.util.*;

public class Collections_14 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int num;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			num = in.nextInt();
			list.add(num);		
		}
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			int a = list.get(i);
			while(a>0) {
				int r = a%10;
				list1.add(r);
				a = a/10;
				if(r==7) {
					list1.clear();
				}
			}
			list2.addAll(list1);
			list1.clear();
		}
		Iterator<Integer> itr = list2.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			int val = (int)itr.next();
			sum += val; 
		}
		System.out.println(sum);
	}
}
