package Abstraction_2;

public class MembershipCard extends Card {
	private int rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return this.getHolderName() + "'s Membership Card Details\n" + "Card Number "+ this.getCardNumber()+"\nRating "+this.getRating();
	}
	
}
