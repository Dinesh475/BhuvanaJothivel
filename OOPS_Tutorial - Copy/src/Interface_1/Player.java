package Interface_1;

public class Player implements PlayerStatistics{
	private String name;
	private String teamName;
	private int noOfMatches;
	private long totalRunsScored;
	private int noOfWicketsTaken;
	public Player(String name, String teamName, int noOfMatches, long totalRunsScored, int noOfWicketsTaken) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
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
	public void displayPlayerStatistics(){
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("Total runs scored: "+this.getTotalRunsScored());
		System.out.println("No of wickets taken: "+this.getNoOfWicketsTaken());
	}
}
