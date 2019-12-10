package Class_Object_10;

public class Match_1 {
	private String date;
	private String team1;
	private String team2;
	private Venue_3 venue_3;
	
	public Match_1(String date, String team1, String team2, Venue_3 venue_3) {
		super();
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.venue_3 = venue_3;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public Venue_3 getVenue_3() {
		return venue_3;
	}
	public void setVenue_3(Venue_3 venue_3) {
		this.venue_3 = venue_3;
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s",date,team1,team2,venue_3);
	}
	
}
