package Class_Object_9;

public class MatchBO {
	void printAllMatchDetails(Match[] Matchlist) {
		System.out.println("Match Details");
		System.out.println("Date\t\t"+"Team1\t\t"+"Team2\t\t"+"Venue\t\t"+"Status\t\t"+"Winner");
		for(Match m: Matchlist)
			System.out.println(m.toString());
	}
	void printAllMatchDetailsWithOutcomeStatus(Match[] Matchlist, String outcomeStatus) {
		System.out.println("Match Details");
		System.out.println("Date\t\t"+"Team1\t\t"+"Team2\t\t"+"Venue\t\t"+"Status\t\t"+"Winner");
		for(Match m1: Matchlist) {
			if(m1.getOutcome().getStatus() == outcomeStatus)
				System.out.println(m1.toString());
		}
	}
	void printAllMatchDetailsWithOutcomeWinnerTeam(Match[] Matchlist, String outcomeWinnerTeam) {
		System.out.println("Match Details");
		System.out.println("Date\t\t"+"Team1\t\t"+"Team2\t\t"+"Venue\t\t"+"Status\t\t"+"Winner");
		for(Match m2: Matchlist) {
			if(m2.getOutcome().getWinnerTeam() == outcomeWinnerTeam)
				System.out.println(m2.toString());
		}
	}
}
