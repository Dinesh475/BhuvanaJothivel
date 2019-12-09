package Class_Object_8;

public class Delivery {
	private Long over;
	private Long ball;
	private Long runs;	
	private String batsname;
	private String bowler;
	private String nonStricker;
	public Delivery(Long over, Long ball, Long runs, String batsname, String bowler, String nonStricker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsname = batsname;
		this.bowler = bowler;
		this.nonStricker = nonStricker;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsname() {
		return batsname;
	}
	public void setBatsname(String batsname) {
		this.batsname = batsname;
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
		return String.format("%-20s%-20s%-20s%-20s%-20s%-20s",over,ball,runs,batsname,bowler,nonStricker);
	}
}
