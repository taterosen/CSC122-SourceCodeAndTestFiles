package deck;

/**
 * JUnit Test class for Deck class
 * @author taterosen & marissapatel
 * Date: 09/06/2020
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import card.Card;
import card.Card.CardSuit;
import card.Deck;

class DeckTest 
{
	/**
	 * Method to test Deck default constructor
	 */
	@Test
	void testDefaultConstructor() 
	{
		Deck d = new Deck();
		
		assertTrue(d.getSize() == Deck.DECK_SIZE, "Initial size is 52");
		
		assertTrue(d.dealTop() instanceof Card, "");
		
		for(int i = 0; i < Deck.DECK_SIZE; i++)
		{
			assertTrue(d.dealTop() != null, "Deck is full");
		}
		
	}
	
	
	/**
	 * Method to test values of cards
	 */
	@Test
	void testValueAndRank()
	{
		Deck d = new Deck(); 
		Card c = new Card (CardSuit.Spades, Card.ACE);
		Card c2 = new Card(CardSuit.Spades, 2);
		assertTrue(d.dealTop().equals(c), "Card has correct value");
		assertTrue(d.dealTop().equals(c2), "Card has correct value");
	}
	
	/**
	 * Method to test number remaining
	 */
	@Test
	void testRemaining()
	{
		Deck d = new Deck();
		assertTrue(d.remaining() == Deck.DECK_SIZE, "Remaining = 52");
		
		d.dealTop();
		assertTrue(d.remaining() == Deck.DECK_SIZE - 1, "Remaining = 51 after dealing top");
	}
	
	/**
	 * Method to test dealing too many cards
	 */
	@Test
	void testDealTooMany()
	{
		Deck d = new Deck();
		
		for(int i = 0; i < d.getSize(); i++)
		{
			d.dealTop();
		}
		assertTrue(d.dealTop() == new Card(CardSuit.Spades, Card.ACE), 
				"Deck returns to first card after the whole deck is dealt");
	}
	
	/**
	 * Method to test shuffle() method in Deck class
	 */
	@Test
	void testShuffle()
	{
		Deck d = new Deck();
		Deck d2 = new Deck();
		
		assertTrue(d.dealTop().equals(d2.dealTop()) && d.dealTop().equals(d2.dealTop()), 
				"Decks are initially the same");
		
		d.shuffle();
		assertTrue(d.dealTop() != d2.dealTop() &&
				d.dealTop() != d2.dealTop(), "Deck shuffled");
	}
	

}
