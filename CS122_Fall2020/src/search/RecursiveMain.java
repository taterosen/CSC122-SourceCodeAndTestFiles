package search;

import card.Card;
import card.Card.CardSuit;

public class RecursiveMain {

	public static void main(String[] args) 
	{
		Card[] c = new Card[10];
		
		c[0] = new Card(CardSuit.Spades, 1);
		c[1] = new Card(CardSuit.Spades, 8);
		c[2] = new Card(CardSuit.Spades, 11);
		c[3] = new Card(CardSuit.Hearts, 2);
		c[4] = new Card(CardSuit.Hearts, 12);
		c[5] = new Card(CardSuit.Clubs, 3);
		c[6] = new Card(CardSuit.Clubs, 9);
		c[7] = new Card(CardSuit.Diamonds, 1);
		c[8] = new Card(CardSuit.Diamonds, 5);
		c[9] = new Card(CardSuit.Diamonds, 13);
		
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
			System.out.println(c[i].getRank() + (c[i].getSuit().ordinal() * 13));
			
		}
		
		System.out.println();
		System.out.println(c[0].compareTo(c[1]));
		System.out.println(c[1].compareTo(c[0]));
		System.out.println(c[0].compareTo(c[0]));
		System.out.println();
		
		System.out.println(c[6].compareTo(c[9]));
		System.out.println(c[9].compareTo(c[4]));
		System.out.println(c[8].compareTo(c[8]));
		
		
		
		
		
		//System.out.println(binSearch(c, new Card(CardSuit.Spades, 1)));

	}

}
