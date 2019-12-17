package Interface_3;

public class Batsman extends CricketPlayer implements PlayerStatistics{
	private long runs;

	public Batsman(String name, String teamName, int noOfMatches, long runs) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {
		this.runs = runs;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("Total runs scored: "+this.getRuns());
	}
}
