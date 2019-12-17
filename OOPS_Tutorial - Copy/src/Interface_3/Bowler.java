package Interface_3;

public class Bowler extends CricketPlayer implements PlayerStatistics {
	private int noOfWickets;

	public Bowler(String name, String teamName, int noOfMatches, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("No of wickets taken: "+this.getNoOfWickets());
	}
}
