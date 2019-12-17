package Class_Object_10;

public class Match_1_BO {
	public Match_1 createMatch_1(String data, Venue_3[] venue_3List) {
		String[] input = data.split(",");
		Venue_3 v = null;
		for(int i=0;i<venue_3List.length;i++) {
			if(venue_3List[i].getName().equals(input[3])) {
				v = venue_3List[i];
				break;
			}
		}
		Match_1 m = new Match_1(input[0],input[1],input[2],v);
		return m;
	}
	public void findVenue_3(String match_1Date, Match_1[] Match_1List) {
		for(int i=0;i<Match_1List.length;i++) {
			if(Match_1List[i].getDate().equals(match_1Date)) {
				System.out.println(Match_1List[i].getVenue_3().getName());
			}
		}
	}
	public void findAllMatchesInGivenVenue_3(String venue_3name, Match_1[] Match_1List) {
		System.out.println(String.format("%-16s %-16s %-16s", "DATE","TEAM1","TEAM2"));
		for(int i=0;i<Match_1List.length;i++) {
			if(Match_1List[i].getVenue_3().equals(venue_3name)) {
				System.out.println(String.format("%-16s %-16s %-16s",Match_1List[i].getDate(),Match_1List[i].getTeam1(),Match_1List[i].getTeam2()));
			}
		}
	}
	
}