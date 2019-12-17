package Interface_2;

public class CricketPlayer extends Player implements PlayerStatistics{
	private long totalRunsScored;
	private int noOfWicketsTaken;
	public CricketPlayer(String name, String teamName, int noOfMatches, long totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public long getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(long totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOfWicketsTaken() {
		return noOfWicketsTaken;
	}
	public void setNoOfWicketsTaken(int noOfWicketsTaken) {
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("No of matches played: "+this.getNoOfMatches());
		System.out.println("Total runs scored: "+this.getTotalRunsScored());
		System.out.println("No of wickets taken: "+this.getNoOfWicketsTaken());
	}
}
