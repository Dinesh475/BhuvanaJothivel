package Collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections_15 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number of matches");
		int n = in.nextInt();
		System.out.println("Enter the runs scored by them");
		int num; 
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			num = in.nextInt();
			list.add(num);
		}
		Iterator<Integer> itr = list.iterator();
		int count = 0;
		while(itr.hasNext()) {
			int flag = 0;
			int a = (int) itr.next();
			for(int i=2;i<=(a/2);i++) {
				if(a%i==0) {
					flag = 1;
					break;
				}
			}
			if(flag!=1)
				count++;
		}
		System.out.println("Number of prime scores: "+count);
	}
}
