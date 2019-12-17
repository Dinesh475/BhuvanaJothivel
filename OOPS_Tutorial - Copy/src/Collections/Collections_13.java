package Collections;

import java.util.*;

public class Collections_13 {
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
		for(int i=1;i<list.size();i=i+2) {
			list1.add(list.get(i));
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<list.size();i=i+2) {
			list2.add(list.get(i));
		}
		Iterator<Integer> itr = list1.iterator();
		Iterator<Integer> itr1 = list2.iterator();
		int sum1 = 0, sum2 = 0;
		while (itr.hasNext()) {
			int a = (int)itr.next();
			if(a%2!=0) {
				sum1 += a;
			}
		}
		while (itr1.hasNext()) {
			int a = (int)itr1.next();
			if(a%2==0) {
				sum2 += a;
			}
		}
		System.out.println(sum1+sum2);
	}
}
