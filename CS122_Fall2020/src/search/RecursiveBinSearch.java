package search;

/**
 * Recursive Binary Search
 * @author taterosen
 * 10/21/2020
 */

import card.Card;
import card.Card.CardSuit;

public class RecursiveBinSearch<Element extends Comparable<Element>>
{
	/**
	 * Conducts a binary search for a given key integer.
	 * @param arr
	 * @param key
	 * @return the index of the key; -1 if not found
	 */
	public int binSearch(Element[] arr, Element key)
	{
		return binSearch(arr, key, 0, arr.length - 1);
	}
	
	/**
	 * Recursive binary search method.
	 * @param a
	 * @param k
	 * @param left
	 * @param right
	 * @return the index of a given key; -1 if not found
	 */
	public int binSearch(Element[] a, Element k, int left, int right)
	{
		if(left > right) return -1;
		
		int mid = (left + right) / 2;
		if(a[mid].equals(k)) return mid;
		
		else if(a[mid].compareTo(k) < 0)
			return binSearch(a, k, mid+1, right);
		
		else
			return binSearch(a, k, left, mid-1);
	}
	
	/**
	 * Main method to test recursive binary search with Cards.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		RecursiveBinSearch<Card> rbs = new RecursiveBinSearch<Card>();
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
		}
		
		System.out.println();
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Spades, 1)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Spades, 8)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Spades, 11)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Hearts, 2)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Hearts, 12)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Clubs, 3)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Clubs, 9)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Diamonds, 1)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Diamonds, 5)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Diamonds, 13)));
		
		
		System.out.println();
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Clubs, 11)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Hearts, 4)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Spades, -12)));
		System.out.println(rbs.binSearch(c, new Card(CardSuit.Hearts, 122)));
		
	}
}
