package Abstraction_3;

public class ODImatch extends Match{
	public ODImatch(int currentScore, float currentOver, int target){
		super(currentScore,currentOver,target);
	}
	public float calculateRunrate() {
		float need = this.target - this.currentScore;
		return need;
	}
	public int calculateBalls() {
		int a = (int)(50 - this.currentOver)*6;
		return a;
	}
}
