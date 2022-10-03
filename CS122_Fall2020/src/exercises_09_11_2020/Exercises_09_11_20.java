package exercises_09_11_2020;

/**
 * Take Home Exercises for weekend of 09/11/2020
 * @author taterosen
 * 09/11/2020
 */

import java.util.*;












//REMEMBER TO DELETE STUFF BEFORE TURN IN

import card.Card;
import card.Card.CardSuit;

public class Exercises_09_11_20 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] arr = {1,4,2,8,4,6,8,5,21};
		
		int inp = 1;
		
		/*while(inp != 0) 					//TEST findKey method
		{
			System.out.print("Enter a key you want to find; to quit, enter 0: ");
			inp = input.nextInt();
			
			boolean v = findKey(inp, arr);
			
			System.out.println("Is the key in the array?: " + v);
			
		}*/
		
		/*System.out.println(findMax(arr));					//TEST findMax Method
		boolean x = false;
		System.out.print("Enter a max you want to find: ");
		inp = input.nextInt();
		if (findMax(arr) == inp)
		{
			x = true;
		}
		System.out.println("The max is " + inp + "? " + x);*/
		
		/*System.out.print("Enter a key you want to find: ");		//TEST frequencyOf method
		inp = input.nextInt();
		System.out.println("Number of times: " + frequencyOf(inp, arr));*/
		
		/*System.out.print("Enter a key you want to find: ");		//TEST numGreaterThan method
		inp = input.nextInt();
		System.out.println("Number of times greater than " + inp + ": " + numGreaterThan(inp,arr));*/
		
		/*System.out.print("Enter three numbers: ");		//TEST max method
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		System.out.println("Max is: " + max(n1, n2, n3));*/
		
		Card[] hand = { new Card(CardSuit.Clubs, 8), 
						new Card(CardSuit.Diamonds, 10)};
		System.out.println(sumOf(hand));
		
		
		
		
		
		
	}
	
	/**
	 * 
	 * @param key
	 * @param array
	 * @return a boolean that states whether a key is located in an array of integers
	 */
	/*public static boolean findKey(int key, int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)
			{
				return true;
			}
		}
		return false;
	}*/
	
	/**
	 * 
	 * @param array
	 * @return the maximum value in an array of integers
	 */
	public static int findMax(int[] array)
	{
		int max = 0; 
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
			
		return max;
	}
	
	/**
	 * 
	 * @param key
	 * @param array
	 * @return the number of times a given integer is found in an array of integers
	 */
	public static int frequencyOf(int num, int[] array)
	{
		int count = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == num)
			{
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * 
	 * @param num
	 * @param array
	 * @return number of times an array of integers has a value greater than a given integer
	 */
	public static int numGreaterThan(int num, int[] array)
	{
		int count = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] > num)
			{
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return largest integer of three given integers
	 */
	public static int max(int n1, int n2, int n3)
	{
		int max = 0;
		
		if (n1 > n2 && n1 > n3)
		{
			max = n1;
		}
		else if (n2 > n1 && n2 > n3)
		{
			max = n2;
		}
		else
		{
			max = n3;
		}
		
		return max;
	}
	
	public static int sumOf(Card[] hand)
	{
		int sum = 0;
		
		for (int i = 0; i < hand.length; i++)
		{
			sum += hand[i].getFaceValue();
		}
		
		return sum;
	}
	
	public static boolean findKey(int key, int[] sortedArray)
	{
		return false;
	}

}
