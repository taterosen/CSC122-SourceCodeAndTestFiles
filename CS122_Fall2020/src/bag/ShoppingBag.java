package bag;

import card.Card;
import card.Card.CardSuit;

public class ShoppingBag {

	public static void main(String[] args) 
	{
		Bag<Integer> b = new Bag<Integer>();
		
		System.out.println(b);
		System.out.println();
		System.out.println(b.isEmpty());
		System.out.println();
		
		b.add(1);
		b.add(2);
		b.add(3);
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.isEmpty());
		System.out.println();
		
		System.out.println(b.getFrequencyOf(1));
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		System.out.println(b.contains(2));
		System.out.println();
		System.out.println(b.contains(4));
		System.out.println();
		
		System.out.println(b);
		System.out.println();
		
		b.remove();
		
		System.out.println(b);
		System.out.println();
		
		b.remove(3);
		
		System.out.println(b);
		System.out.println();
		
		b.add(4);
		b.add(5);
		b.add(6);
		
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.getFrequencyOf(4));
		System.out.println();
		System.out.println(b.getFrequencyOf(3));
		System.out.println();
		
		b.clear();
		
		System.out.println(b);
		System.out.println();
		
		for(int i = 0; i < b.getBagSize(); i++)
		{
			b.add(7);
		}
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println(b.percentFull());
		System.out.println();
		
		
		
		for(int i = 0; i <= 40; i++)
		{
			b.add(8);
		}
		
		b.add(9);
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b.percentFull());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		
		
		
		for(int i = 0; i <= 100; i++)
		{
			b.add(100);
		}
		
		//b.add(new Box(400,5));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*Bag<Card> b = new Bag<Card>();
		
		System.out.println(b);
		System.out.println();
		
		b.add(new Card(CardSuit.Spades, 2));
		b.add(new Card(CardSuit.Hearts, 12));
		b.add(new Card(CardSuit.Clubs, 10));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		
		System.out.println(b.getFrequencyOf(new Card(CardSuit.Spades, 2)));
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		System.out.println(b.contains(new Card(CardSuit.Hearts, 12)));
		System.out.println();
		System.out.println(b.contains(new Card(CardSuit.Hearts, 13)));
		System.out.println();
		
		System.out.println(b);
		System.out.println();
		
		b.remove();
		
		System.out.println(b);
		System.out.println();
		
		b.remove(new Card(CardSuit.Hearts, 12));
		
		System.out.println(b);
		System.out.println();
		
		b.add(new Card(CardSuit.Diamonds, 13));
		b.add(new Card(CardSuit.Diamonds, 13));
		b.add(new Card(CardSuit.Diamonds, 13));
		
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.getFrequencyOf(new Card(CardSuit.Diamonds, 13)));
		System.out.println();
		System.out.println(b.getFrequencyOf(new Card(CardSuit.Hearts, 12)));
		System.out.println();
		
		b.clear();
		
		System.out.println(b);
		System.out.println();
		
		for(int i = 0; i < b.getBagSize(); i++)
		{
			b.add(new Card(CardSuit.Clubs, 6));
		}
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		
		
		for(int i = 0; i <= 40; i++)
		{
			b.add(new Card(CardSuit.Spades, 1));
		}
		
		b.add(new Card(CardSuit.Hearts, 3));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		
		
		
		for(int i = 0; i <= 100; i++)
		{
			b.add(new Card(CardSuit.Spades, 8));
		}
		
		//b.add(new Box(400,5));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Bag<String> b = new Bag<String>();
		
		System.out.println(b);
		System.out.println();
		
		b.add("One");
		b.add("Two");
		b.add("Three");
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		
		System.out.println(b.getFrequencyOf("One"));
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		System.out.println(b.contains("One"));
		System.out.println();
		System.out.println(b.contains("On"));
		System.out.println();
		
		System.out.println(b);
		System.out.println();
		
		b.remove();
		
		System.out.println(b);
		System.out.println();
		
		b.remove("Three");
		
		System.out.println(b);
		System.out.println();
		
		b.add("Four");
		b.add("Five");
		b.add("Six");
		
		System.out.println(b);
		System.out.println();
		
		System.out.println("One");
		System.out.println();
		System.out.println("Six");
		System.out.println();
		
		b.clear();
		
		System.out.println(b);
		System.out.println();
		
		for(int i = 0; i < b.getBagSize(); i++)
		{
			b.add("Seven");
		}
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		
		
		for(int i = 0; i <= 40; i++)
		{
			b.add("Fifty");
		}
		
		b.add("One Hundred");
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		
		
		
		for(int i = 0; i <= 100; i++)
		{
			b.add("Hello");
		}
		
		//b.add(new Box(400,5));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Bag<Item> b = new Bag<Item>();
		
		System.out.println(b);
		System.out.println();
		
		b.add(new Can(4,5));
		b.add(new Box(4,5));
		b.add(new Jar(true));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		
		System.out.println(b.getFrequencyOf(new Can(4,5)));
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		System.out.println(b.contains(new Can(4,5)));
		System.out.println();
		System.out.println(b.contains(new Can(10,5)));
		System.out.println();
		
		System.out.println(b);
		System.out.println();
		
		b.remove();
		
		System.out.println(b);
		System.out.println();
		
		b.remove(new Box(4,5));
		
		System.out.println(b);
		System.out.println();
		
		b.add(new Can(4,5));
		b.add(new Box(4,5));
		b.add(new Jar(true));
		
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.getFrequencyOf(new Can(4,5)));
		System.out.println();
		System.out.println(b.getFrequencyOf(new Jar(true)));
		System.out.println();
		
		b.clear();
		
		System.out.println(b);
		System.out.println();
		
		for(int i = 0; i < b.getBagSize(); i++)
		{
			b.add(new Jar(true));
		}
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();
		
		
		
		for(int i = 0; i <= 40; i++)
		{
			b.add(new Jar(true));
		}
		
		b.add(new Box(400,5));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		
		
		
		for(int i = 0; i <= 100; i++)
		{
			b.add(new Jar(true));
		}
		
		//b.add(new Box(400,5));
		
		System.out.println(b.getCurrentSize());
		System.out.println();
		System.out.println(b.getBagSize());
		System.out.println();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.percentFull());
		System.out.println();*/
		
	}

}
