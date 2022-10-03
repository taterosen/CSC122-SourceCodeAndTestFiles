package card;

import bag.Bag;

/**
 * Program to test the Card class in the main method.
 * @author taterosen
 * Date: 08/28/2020
 */

public class CardGame 
{
	public static void main(String[] args) 
	{
		
		Bag b = new Bag();
		System.out.println(b.toString());
		
		Deck d = new Deck();
		Deck d2 = new Deck();	
		
		System.out.println(d.equals(d2));
		
		System.out.println(d.getSize());
		System.out.println(d.remaining());
		
		for(int i = 0; i < d.getSize(); i++)
		{
			System.out.println(d.dealTop());
			System.out.println(d.remaining());
		}
		System.out.println(d.remaining());
		
		System.out.println(d.toString());
		
		d.shuffle();
		System.out.println(d.toString());
		
		System.out.println(d.equals(d2));
		System.out.println(d.hashcode());
		
	
		/*System.out.println("Are the decks equal? " + d.equals(d2));
		System.out.println();
		
		d.shuffle();
		
		System.out.println("Are the decks equal? " + d.equals(d2));
		System.out.println();
		
		System.out.println(d.remaining());
		
		for(int i = 0; i < d.getSize(); i++)
		{
			System.out.println(d.dealTop());
		}
		
		System.out.println(d.remaining());
		
		//System.out.println(d.dealTop());
		System.out.println(d.remaining());

		
		//System.out.println("Are the decks equal? " + d.equals(d2));
		System.out.println();
		
		//d.shuffle();
		System.out.println();
		
		//System.out.println(d);
		System.out.println(d.remaining());
		
		//System.out.println(d.dealTop());
		//System.out.println(d.dealTop());
		System.out.println(d.dealTop());
		
		System.out.println(d.remaining());
		
		
		
		d.shuffle();
		System.out.println();*/
		
		//System.out.println(d);
		
		/*System.out.println(d.remaining());
		System.out.println();
		
		for(int i = 0; i < d.getSize(); i++)
		{
			System.out.println(d.dealTop());
		}
		
		System.out.println();
		System.out.println(d.remaining());
		System.out.println();
		
		d.shuffle();
		
		for(int i = 0; i < d.getSize(); i++)
		{
			System.out.println(d.dealTop());
		}
		
		System.out.println();
		
		for(int i = 0; i < d.getSize(); i++)
		{
			System.out.println(d.dealTop());
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*Card c1 = new Card(CardSuit.Spades, 1);
		Card c2 = new Card (CardSuit.Hearts, 12);
		Card c3 = new Card (CardSuit.Clubs, 8);
		Card c4 = new Card (CardSuit.Spades, 1);
		Card c5 = new Card (CardSuit.Diamonds, 11);
		
		System.out.print(c1.getSuit() + " ");
		//System.out.println(c1.suitAsString() + "\n");
		
		System.out.print(c2.getSuit() + " ");
		//System.out.println(c2.suitAsString() + "\n");
		
		System.out.print(c3.getSuit() + " ");
		//System.out.println(c3.suitAsString() + "\n");
		
		System.out.print(c5.getSuit() + " ");
		//System.out.println(c5.suitAsString() + "\n");
		
		System.out.print(c1.getFaceValue() + " ");
		System.out.println(c1.valueAsString() + "\n");
		
		System.out.print(c2.getFaceValue() + " ");
		System.out.println(c2.valueAsString() + "\n");
		
		System.out.print(c1 + "\n");
		System.out.print(c2 + "\n");
		System.out.print(c3 + "\n");
		System.out.print(c4 + "\n");
		System.out.print(c5 + "\n");
		
		System.out.println();
		
		System.out.println(c1.equals(c4));
		System.out.println(c2.equals(c4));
		
		System.out.println(c1.hashcode());
		System.out.println(c2.hashcode()); */
		
	}

}
