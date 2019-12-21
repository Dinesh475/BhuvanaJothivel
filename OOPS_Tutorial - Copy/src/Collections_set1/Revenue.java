package Collections_set1;

import java.util.List;

public class Revenue implements Comparable<Revenue> {
	private String revenueCategory;
	private int amount;
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Revenue(String l, int l1) {
		super();
		this.revenueCategory = l;
		this.amount = l1;
	}
	 
	
	@Override
	public int compareTo(Revenue o) {
		if(amount == o.amount)
			return 0;
		else if(amount>o.amount)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s", revenueCategory,amount);
	}
	
	
}
