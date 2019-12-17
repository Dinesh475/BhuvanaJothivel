package Polymorphism_3;

public class Bowler extends Player {
	private long noOfWickets;

	public Bowler(String name, String teamName, long noOfMatches, long noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}
	
	public long getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(long noOfWickets) {
		this.noOfWickets = noOfWickets;
	}

	public void displayDetails() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("Number of matches: "+this.getNoOfMatches());
		System.out.println("Number of wickets taken: "+this.getNoOfWickets());	
	}
}
