package Interface_3;

public class AllRounder extends CricketPlayer implements PlayerStatistics{
	private long runs;
	private int noOfWickets;
	public AllRounder(String name, String teamName, int noOfMatches, long runs, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
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
		System.out.println("Total runs scored: "+this.getRuns());
		System.out.println("No of wickets taken: "+this.getNoOfWickets());
	}
}
