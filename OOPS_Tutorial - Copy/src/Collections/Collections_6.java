package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = 5;
		
		List<String> list = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 8");
		String pname;
		while(n>0) {
			pname = in.nextLine();
			list.add(pname);
			n--;
		}
		System.out.println("Enter the rank to be searched");
		int rank = in.nextInt();
		String temp = list.get(rank-1);		
		System.out.println(temp);

	}
}
