package card;

/**
 * Basic Deck class; uses Card class to 
 * 			create a Deck of 52 Cards
 * @author taterosen & marissapatel
 * Date 09/06/2020
 */

import card.Card.CardSuit;

public class Deck 
{
	public static final int DECK_SIZE = 52;
	public static final int CARDS_PER_SUIT = 13;

	private int top = 0;
	private Card[] deck;

	/**
	 * Create a single default Deck
	 */ 
	public Deck()
	{
		deck = new Card[DECK_SIZE];
		for(int i = 0; i < deck.length; i++)
		{
			int rank = (i + 1) % CARDS_PER_SUIT; 
			if (rank == 0)
			{
				rank = Card.KING;
			}

			if(i < CARDS_PER_SUIT)
			{
				deck[i] = new Card(CardSuit.Spades, rank);
			}
			else if( i < CARDS_PER_SUIT * 2)
			{
				deck[i] = new Card(CardSuit.Hearts, rank);
			}
			else if(i < CARDS_PER_SUIT * 3)
			{
				deck[i] = new Card(CardSuit.Clubs, rank);
			}
			else
			{
				deck[i] = new Card(CardSuit.Diamonds, rank);
			}
		}
	}
	
	/**
	 * @return size of a complete deck
	 */
	public int getSize()
	{
		return deck.length;
	}

	/**
	 * Method to shuffle the Deck
	 */
	public void shuffle()
	{
		for (int i = 0; i < deck.length - 1; i++)
		{
			int randomCard = (int)(Math.random() * deck.length);
			Card temp = deck[i];
			deck[i] = deck[randomCard];
			deck[randomCard] = temp;
		}
	}

	/**
	 * @return the top card in the Deck
	 */
	public Card dealTop()
	{
		if (top >= deck.length)
		{ 
			top = 0;
		}
		Card topCard = deck[top];
		top++;
		return topCard;
	}

	/**
	 * @return the # of remaining cards in the Deck
	 */
	public int remaining()
	{
		if (top == deck.length)
		{
			return deck.length;
		}
		return deck.length - top;
	}

	/**
	 * @return a string representation of the Deck
	 */
	@Override
	public String toString()
	{
		String deckString = "A Deck with cards: \n";
		int count = 1;
		for(int i = 0; i < deck.length; i++)
		{
			if (count % CARDS_PER_SUIT != 0)
			{
				deckString += this.dealTop() + ", ";
			}
			else
			{
				deckString += this.dealTop() + "\n";
			}
			count++;
		}
		return deckString;
	}

	/**
	 * Checks for object equality between two Decks
	 * @return true if decks are identical; false otherwise
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Deck))
		{
			return false;
		}
		if (this.remaining() != ((Deck)obj).remaining())
		{
			return false;
		}
		for (int i = 0; i < deck.length; i++)
		{	
			Card c = this.dealTop();
			Card c1 = ((Deck)obj).dealTop();
			if (!(c.equals(c1))) 
			{
				return false;
			}	
		}
		return true;
	}

	/**
	 * @return a hashcode value
	 */
	public int hashcode()
	{
		return deck.length * deck.length;
	}

}
