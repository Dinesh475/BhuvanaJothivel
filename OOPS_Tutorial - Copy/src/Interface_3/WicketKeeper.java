package Interface_3;

public class WicketKeeper extends CricketPlayer implements PlayerStatistics{
	private int noOfCatches, noOfStumpings;
	private long runs;
	private int noOfDismissals;
	public WicketKeeper(String name, String teamName, int noOfMatches, int noOfCatches, int noOfStumpings, long runs,
			int noOfDismissals) {
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.runs = runs;
		this.noOfDismissals = noOfDismissals;
	}
	public int getNoOfCatches() {
		return noOfCatches;
	}
	public void setNoOfCatches(int noOfCatches) {
		this.noOfCatches = noOfCatches;
	}
	public int getNoOfStumpings() {
		return noOfStumpings;
	}
	public void setNoOfStumpings(int noOfStumpings) {
		this.noOfStumpings = noOfStumpings;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public int getNoOfDismissals() {
		return noOfDismissals;
	}
	public void setNoOfDismissals(int noOfDismissals) {
		this.noOfDismissals = noOfDismissals;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("No of catches: "+this.getNoOfCatches());
		System.out.println("No of stumpings: "+this.getNoOfStumpings());
		System.out.println("No of dismissals: "+this.getNoOfDismissals());
		System.out.println("Total runs scored: "+this.getRuns());
	}
}
