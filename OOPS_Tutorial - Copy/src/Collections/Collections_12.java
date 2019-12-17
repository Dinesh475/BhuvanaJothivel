package Collections;

import java.util.*;

public class Collections_12 {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		String team = in.nextLine();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<team.length();i++) {
			list.add(String.valueOf(team.charAt(i)));
		}
		Collections.reverse(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
