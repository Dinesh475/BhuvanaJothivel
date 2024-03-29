package Interface_2;

public class HockeyPlayer extends Player implements PlayerStatistics {
	private String position;
	private int noOfGoals;
	public HockeyPlayer(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getNoOfGoals() {
		return noOfGoals;
	}
	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("No of matches played: "+this.getNoOfMatches());
		System.out.println("Position: "+this.getPosition());
		System.out.println("No of goal taken: "+this.getNoOfGoals());
	}
}
