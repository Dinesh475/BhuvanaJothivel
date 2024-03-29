package Class_Object_7;

public class Delivery {
	private long over;
	private long ball;
	private String batsman;
	private String bowler;
	private String nonStricker;
	public Delivery(long over, long ball, String batsman, String bowler, String nonStricker) {
		super();
		this.over = over;
		this.ball = ball;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStricker = nonStricker;
	}
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStricker() {
		return nonStricker;
	}
	public void setNonStricker(String nonStricker) {
		this.nonStricker = nonStricker;
	}
	@Override
	public String toString() {
		return "Over: " + over + "\nBall: " + ball + "\nBatsman: " + batsman + "\nBowler:" + bowler
				+ "\nNonStricker:" + nonStricker;
	}
}
