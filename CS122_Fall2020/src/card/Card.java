package card;

/**
 * Basic playing card class
 * @author taterosen
 * Date: 8/28/2020
 */

public class Card implements Comparable<Card>
{
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	private final CardSuit suit;
	private final int rank;
	
	public enum CardSuit {Spades, Hearts, Clubs, Diamonds};

	/**
	 * Create a single valid Card.
	 * Improper valued parameters will be forced to valid
	 * @param suit use constants to set suit 
	 * @param value use 1-13 or constants ACE-KING to set face value
	 */
	public Card(CardSuit suit, int rank) 
	{
		//Invalid values are corrected
		if (rank < ACE || rank > KING) 
		{
			rank = ACE; 
			suit = CardSuit.Hearts;
		}
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * @return the Card's suit
	 */
	public CardSuit getSuit() 
	{
		return suit;
	}
	
	/**
	 * @return the Card's rank
	 */
	public int getRank()
	{
		return rank;
	}

	/**
	 * @return returns the face value
	 */
	public int getFaceValue() 
	{
		return this.getRank();
	}

	/**
	 * Suit value as a string
	 * @return a String representation of the suit
	 */
	public String suitAsString() 
	{
		switch ( suit ) {
		case Spades:   return "\u2660";
		case Hearts:   return "\u2665";
		case Diamonds: return "\u2666";
		case Clubs:    return "\u2663";
		}
		return null;  //should never get here
	}

	/**
	 * @return a String representation of the face value
	 */
	public String valueAsString() 
	{
		switch ( rank ) {
		case ACE:    return "Ace";
		case JACK:   return "Jack";
		case QUEEN:	 return "Queen";
		case KING:   return "King";
		default:	 return "" + rank;
		}
	}

	/**
	 * @return a string representation of the Card
	 */
	@Override
	public String toString() 
	{
		return this.valueAsString() + " of " + this.suitAsString(); 
	}

	/**
	 * Checks for object equality between two cards
	 * @return true if suit and value are identical; false otherwise
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof Card)
		{
			return suit == ((Card)obj).suit && rank == ((Card)obj).rank;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Hashcode necessary (details later in term)
	 * @return a hashcode value
	 */
	public int hashcode() 
	{
		return this.rank * this.rank;
	}

	@Override
	public int compareTo(Card o) 
	{
		int value1 = this.rank + (this.suit.ordinal() * 13);
		int value2 = ((Card) o).getRank() + (((Card)o).getSuit().ordinal() * 13);
		if(value1 == value2) return 0;
		else if(value1 > value2) return 1;
		else return -1;
	}
}