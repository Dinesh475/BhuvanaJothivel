package Polymorphism_3;

public class Batsman extends Player{
	private long noOfRuns;

	public Batsman(String name, String teamName, long noOfMatches, long noOfRuns) {
		super(name, teamName, noOfMatches);
		this.noOfRuns = noOfRuns;
	}

	public long getNoOfRuns() {
		return noOfRuns;
	}

	public void setNoOfRuns(long noOfRuns) {
		this.noOfRuns = noOfRuns;
	}
	public void displayDetails() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("Number of matches: "+this.getNoOfMatches());
		System.out.println("Number of runs scored: "+this.getNoOfRuns());
	}
}
