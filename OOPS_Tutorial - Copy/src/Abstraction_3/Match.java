package Abstraction_3;

public abstract class Match {
	protected int currentScore;
	protected float currentOver;
	protected int target;
	public Match(int currentScore, float currentOver, int target) {
		super();
		this.currentScore = currentScore;
		this.currentOver = currentOver;
		this.target = target;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public void display(double reqRunrate, int balls) {
		System.out.printf("\nRequired Run Rate- %.2f" ,(reqRunrate/(balls/6)));
	}
}
