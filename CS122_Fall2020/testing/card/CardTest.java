package card;

/**
 * JUnit Test class for Card class
 * @author taterosen & carlyholton
 * Date: 09/03/2020
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest 
{

	public final int INVALID_SUIT = 7;
	public final int INVALID_VALUE = 25;
	
	/**
	 * Method to test valid and invalid values passed into the Card constructor
	 * Tests for each possible suit and value type
	 */
	/*@Test
	public void testBasicConstructor()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue (testCard.getFaceValue() == Card.ACE, "Face value");
		assertTrue (testCard.getSuit() == Card.HEARTS, "Suit");
		
		Card testCard2 = new Card(Card.SPADES,Card.JACK);
		assertTrue (testCard2.getFaceValue() == Card.JACK, "Face value");
		assertTrue (testCard2.getSuit() == Card.SPADES, "Suit");
		
		Card testCard3 = new Card(Card.CLUBS,Card.QUEEN);
		assertTrue (testCard3.getFaceValue() == Card.QUEEN, "Face value");
		assertTrue (testCard3.getSuit() == Card.CLUBS, "Suit");
		
		Card testCard4 = new Card(Card.DIAMONDS,Card.KING);
		assertTrue (testCard4.getFaceValue() == Card.KING, "Face value");
		assertTrue (testCard4.getSuit() == Card.DIAMONDS, "Suit");

		Card testCard5 = new Card(Card.SPADES,6);
		assertTrue (testCard5.getFaceValue() == 6, "Face value");
		assertTrue (testCard5.getSuit() == Card.SPADES, "Suit");
		
		Card invalidCard = new Card(INVALID_SUIT,INVALID_VALUE);
		assertTrue (invalidCard.getFaceValue() == Card.ACE, "Face value");
		assertTrue (invalidCard.getSuit() == Card.HEARTS, "Suit");
	}*/
	
	/**
	 * Method to test the getSuit() method in the Card class
	 * Tests for each possible suit
	 */
	/*@Test
	public void testGetSuit()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue (testCard.getSuit() == Card.HEARTS, "Get Suit");
		
		Card testCard2 = new Card(Card.SPADES,Card.ACE);
		assertTrue (testCard2.getSuit() == Card.SPADES, "Get Suit");
		
		Card testCard3 = new Card(Card.CLUBS,Card.ACE);
		assertTrue (testCard3.getSuit() == Card.CLUBS, "Get Suit");
		
		Card testCard4 = new Card(Card.DIAMONDS,Card.ACE);
		assertTrue (testCard4.getSuit() == Card.DIAMONDS, "Get Suit");
	}*/
	
	/**
	 * Method to test the getFaceValue() method in the Card class
	 * Tests for each possible value type
	 */
	/*@Test
	public void testGetFaceValue()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue (testCard.getFaceValue() == Card.ACE, "Get Face Value");
		
		Card testCard2 = new Card(Card.HEARTS,Card.JACK);
		assertTrue (testCard2.getFaceValue() == Card.JACK, "Get Face Value");
		
		Card testCard3 = new Card(Card.HEARTS,Card.QUEEN);
		assertTrue (testCard3.getFaceValue() == Card.QUEEN, "Get Face Value");
		
		Card testCard4 = new Card(Card.HEARTS,Card.KING);
		assertTrue (testCard4.getFaceValue() == Card.KING, "Get Face Value");
		
		Card testCard5 = new Card(Card.HEARTS, 6);
		assertTrue (testCard5.getFaceValue() == 6, "Get Face Value");
	}*/
	
	/**
	 * Method to test the suitAsString() method in the Card class
	 * Tests for each possible suit
	 */
	/*@Test
	public void testSuitAsString()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue (testCard.suitAsString().equals("♥"), "Suit as String");
		
		Card testCard2 = new Card(Card.SPADES,Card.ACE);
		assertTrue (testCard2.suitAsString().equals("♠"), "Suit as String");
		
		Card testCard3 = new Card(Card.CLUBS,Card.ACE);
		assertTrue (testCard3.suitAsString().equals("♣"), "Suit as String");
		
		Card testCard4 = new Card(Card.DIAMONDS,Card.ACE);
		assertTrue (testCard4.suitAsString().equals("♦"), "Suit as String");
	}*/
	
	/**
	 * Method to test the valueAsString() method in the Card class
	 * Tests for each possible value type
	 */
	/*@Test
	public void testValueAsString()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue (testCard.valueAsString().equals("Ace"), "Value as String");
		
		Card testCard2 = new Card(Card.HEARTS,Card.JACK);
		assertTrue (testCard2.valueAsString().equals("Jack"), "Value as String");
		
		Card testCard3 = new Card(Card.HEARTS,Card.QUEEN);
		assertTrue (testCard3.valueAsString().equals("Queen"), "Value as String");
		
		Card testCard4 = new Card(Card.HEARTS,Card.KING);
		assertTrue (testCard4.valueAsString().equals("King"), "Value as String");
		
		Card testCard5 = new Card(Card.HEARTS,6);
		assertTrue (testCard5.valueAsString().equals("6"), "Value as String");
	}*/
	
	/**
	 * Method to test the equals() method in the Card class
	 */
	/*@Test
	public void testEquals()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		Card testCard2 = new Card(Card.HEARTS,Card.ACE);
		Card testCard3 = new Card(Card.DIAMONDS,Card.KING);
		assertTrue(testCard.equals(testCard2) == true, "Equals");
		assertTrue(testCard.equals(testCard3) == false, "Does not equal");
	}*/
	
	/**
	 * Method to test the hashcode() method in the Card class
	 */
	/*@Test
	public void testHashcode()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue(testCard.hashcode() == Card.ACE * (Card.HEARTS * Card.HEARTS), "Hashcode");
		
		Card testCard2 = new Card(Card.SPADES,6);
		assertTrue(testCard2.hashcode() == 6 * (Card.SPADES * Card.SPADES), "Hashcode");
	}*/
	
	/**
	 * Method to test the toString() method in the Card class
	 * Tests for each possible suit and value type
	 */
	/*@Test
	public void testToString()
	{
		Card testCard = new Card(Card.HEARTS,Card.ACE);
		assertTrue (testCard.toString().equals("Ace of ♥"), "To String");
		
		Card testCard2 = new Card(Card.SPADES,Card.JACK);
		assertTrue (testCard2.toString().equals("Jack of ♠"), "To String");
		
		Card testCard3 = new Card(Card.CLUBS,Card.QUEEN);
		assertTrue (testCard3.toString().equals("Queen of ♣"), "To String");
		
		Card testCard4 = new Card(Card.DIAMONDS,Card.KING);
		assertTrue (testCard4.toString().equals("King of ♦"), "To String");
		
		Card testCard5 = new Card(Card.SPADES,6);
		assertTrue (testCard5.toString().equals("6 of ♠"), "To String");
		
	}*/

}
