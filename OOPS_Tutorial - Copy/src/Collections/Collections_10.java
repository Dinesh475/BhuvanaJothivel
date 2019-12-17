package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections_10 {
	public static void main(String args[]) {
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

        Iterator<Integer> itr = list1.iterator(); 
        int res = 0; 
        while (itr.hasNext()) { 
            int a = itr.next(); 
            res += a; 
        } 
        
        System.out.println(res);
	}
}
