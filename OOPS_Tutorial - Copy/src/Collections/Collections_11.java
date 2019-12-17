package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections_11 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int scr;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			scr = in.nextInt();
			list.add(scr);
		}
		Iterator<Integer> itr = list.iterator();
		int count = 0, count1 = 0;
        while (itr.hasNext()) { 
        	int temp = (int) itr.next();
        	if(temp>=50 && temp<100)
        		count++;
        	else if (temp>=100)
        		count1++;
        } 
        System.out.println(count);
        System.out.println(count1);
		
	}
}
