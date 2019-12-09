package Class_Object_5;

public class Wicket {
	private long over;
	private long ball;
	private String wt;
	private String pn;
	private String bn;
	Wicket(long p, long q, String r, String s, String t) {
		this.over = p;
		this.ball = q;
		this.wt = r;
		this.pn = s;
		this.bn = t;
	}
	
	public Long getOver() {
		return over;
	}
	public Long getBall() {
		return ball;
	}
	public String getWtype() {
		return wt;
	}
	public String getPname() {
		return pn;
	}
	public String getBname() {
		return bn;
	}
}
