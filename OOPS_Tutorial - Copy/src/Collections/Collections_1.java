package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections_1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num;
		for(int i=0;i<n;i++) {
			num = in.nextInt();
			list.add(num);
		}
		int total = sum(list);
		double avg = ((double)total)/((double)n);
		System.out.println(total);
		System.out.println(avg);
	}
	public static int sum(List<Integer> list) 
    {  
        Iterator<Integer> it = list.iterator(); 
        int res = 0; 
        while (it.hasNext()) { 
            int num = it.next(); 
            res += num; 
        } 
        return res; 
    } 

}
