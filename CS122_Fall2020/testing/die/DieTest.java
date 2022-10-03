package die;

/**
 * JUnit Test class for Die class
 * @author taterosen
 * Date: 09/03/2020
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import card.Card;
import card.Card.CardSuit;
import lab01.Die;

class DieTest 
{
	public static final int DEFAULT_SIDES = 6;
	public static final int LOWEST_FACE_VALUE = 1;
	public static final int INVALID_NUMBER_OF_SIDES_MAX = 133;
	public static final int INVALID_NUMBER_OF_SIDES_MIN = -87;
	
	public static final int TESTS = 1000;
	public static final int AVG_ROLLS = 100;
	public static final int ROLL_DEVIATION = 30;
	
	/**
	 * Method to test valid parameter values passed into the Die constructors
	 * Tests for default constructor and constructor with parameter
	 */
	@Test
	public void constructorNormalTest()
	{
		//Default constructor
		Die d1 = new Die();
		assertTrue(d1.getNumberOfSides() == DEFAULT_SIDES, "Make default");
		
		//Other constructors:
		Die d2 = new Die(DEFAULT_SIDES);
		assertTrue(d2.getNumberOfSides() == DEFAULT_SIDES, "Make 6-sided die");
		
		Die d3 = new Die(Die.MINIMUM_NUMBER_OF_SIDES);
		assertTrue(d3.getNumberOfSides() == Die.MINIMUM_NUMBER_OF_SIDES, "Make 2-sided die");
		
		Die d4 = new Die(Die.MAXIMUM_NUMBER_OF_SIDES);
		assertTrue(d4.getNumberOfSides() == Die.MAXIMUM_NUMBER_OF_SIDES, "Make 32-sided die");
	}
	
	/**
	 * Method to test invalid parameter values in the Die constructor
	 */
	public void constructorIllegalTest()
	{
		Die d1 = new Die(INVALID_NUMBER_OF_SIDES_MAX);
		assertTrue(d1.getNumberOfSides() == DEFAULT_SIDES, "Change value over max into default");
		assertTrue(d1.getNumberOfSides() != INVALID_NUMBER_OF_SIDES_MAX, "Invalid value not used");
		
		Die d2 = new Die(INVALID_NUMBER_OF_SIDES_MIN);
		assertTrue(d2.getNumberOfSides() == DEFAULT_SIDES, "Change value under min into default");
		assertTrue(d2.getNumberOfSides() != INVALID_NUMBER_OF_SIDES_MIN, "Invalid value not used");
	}
	
	/**
	 * Method to test the getNumberOfSides() method in the Die class
	 */
	@Test
	public void testGetNumberOfSides()
	{
		Die d1 = new Die();
		assertTrue(d1.getNumberOfSides() == DEFAULT_SIDES, "Get number of sides");
		
		Die d2 = new Die(DEFAULT_SIDES);
		assertTrue(d2.getNumberOfSides() == DEFAULT_SIDES, "Get number of sides");
		
		Die d3 = new Die(Die.MINIMUM_NUMBER_OF_SIDES);
		assertTrue(d3.getNumberOfSides() == Die.MINIMUM_NUMBER_OF_SIDES, "Get number of sides");
		
		Die d4 = new Die(Die.MAXIMUM_NUMBER_OF_SIDES);
		assertTrue(d4.getNumberOfSides() == Die.MAXIMUM_NUMBER_OF_SIDES, "Get number of sides");
		
		Die d5 = new Die(INVALID_NUMBER_OF_SIDES_MAX);
		assertTrue(d5.getNumberOfSides() == DEFAULT_SIDES, "Get number of sides");
		
		Die d6 = new Die(INVALID_NUMBER_OF_SIDES_MIN);
		assertTrue(d6.getNumberOfSides() == DEFAULT_SIDES, "Get number of sides");
	}
	                                                	
	/**
	 * Method to test whether face values are in range
	 */
	@Test
	public void testFaceValueInRange()
	{
		Die d1 = new Die();
		assertTrue(d1.getValue() >= LOWEST_FACE_VALUE && d1.getValue() <= 
				d1.getNumberOfSides(), "Face value in range");
		
		Die d2 = new Die(Die.MAXIMUM_NUMBER_OF_SIDES);
		assertTrue(d2.getValue() >= LOWEST_FACE_VALUE && d2.getValue() <= 
				d2.getNumberOfSides(), "Face value in range");
		
		Die d3 = new Die(Die.MINIMUM_NUMBER_OF_SIDES);
		assertTrue(d3.getValue() >= LOWEST_FACE_VALUE && d3.getValue() <= 
				d3.getNumberOfSides(), "Face value in range");
		
		Die d4 = new Die(INVALID_NUMBER_OF_SIDES_MAX);
		assertTrue(d4.getValue() >= LOWEST_FACE_VALUE && d4.getValue() <= 
				d4.getNumberOfSides(), "Face value in range");
		
		Die d5 = new Die(INVALID_NUMBER_OF_SIDES_MIN);
		assertTrue(d5.getValue() >= LOWEST_FACE_VALUE && d5.getValue() <= 
				d5.getNumberOfSides(), "Face value in range");
	}
	
	/**
	 * Method to test the roll() method in the Die Class using a sum
	 */
	@Test
	public void testRollWithSum()
	{
		Die[] testDice = 
		{ new Die(),
		  new Die(DEFAULT_SIDES),
		  new Die(Die.MINIMUM_NUMBER_OF_SIDES),
		  new Die(Die.MAXIMUM_NUMBER_OF_SIDES),
		  new Die(INVALID_NUMBER_OF_SIDES_MAX),
		  new Die(INVALID_NUMBER_OF_SIDES_MIN) };
		int[] sum = { 0, 0, 0, 0, 0, 0 };
		
		for(int i = 0; i < testDice.length; i++)
		{
			int test = TESTS * testDice[i].getNumberOfSides();
			for (int j = 0; j < test; j++)
			{
				testDice[i].roll();
				sum[i] += testDice[i].getValue();
			}
			assertTrue(sum[i] > (test + ROLL_DEVIATION) 
					|| sum[i] < (test - ROLL_DEVIATION), "Random roll");
		}
	}
	
	/**
	 * Method to test the roll() method in the Die Class using an array
	 */
	@Test
	public void testRollWithArray()
	{
		Die[] testDice = 
			{ new Die(),
			  new Die(DEFAULT_SIDES),
			  new Die(Die.MINIMUM_NUMBER_OF_SIDES),
			  new Die(Die.MAXIMUM_NUMBER_OF_SIDES),
			  new Die(INVALID_NUMBER_OF_SIDES_MAX),
			  new Die(INVALID_NUMBER_OF_SIDES_MIN) };
		int[][] count = new int[testDice.length][];
		
		for(int row = 0; row < count.length; row++)
		{
			count[row] = new int [testDice[row].getNumberOfSides()];
		}
		for (int row = 0; row < count.length; row++)
		{
			for (int column = 0; column < count[row].length; column++)
			{
				count[row][column] = 0;
			}
		}

		int result = 0;
		boolean random = true;
		
		for(int i = 0; i < testDice.length; i++)
		{
			int test = TESTS * testDice[i].getNumberOfSides();          
				for (int j = 0; j < test; j++)
				{
					testDice[i].roll();
					result = testDice[i].getValue() - 1;
					count[i][result] += 1;
				}
				for(int c = 0; c < count[i].length; c++)
				{
					int deviation = ROLL_DEVIATION * testDice[i].getNumberOfSides();
					if(count[i][c] > (TESTS + 100) 
							|| count[i][c] < (TESTS - 100))
					{
						random = false;
					}
				}
			assertTrue(random, "Random roll");
		}
	}
	
	/**
	 * Method to test the toString() method in the Die class
	 */
	@Test
	public void testToString()
	{
		Die d1 = new Die();
		assertTrue (d1.toString().equals("A " + DEFAULT_SIDES +
				"-sided die; value " + d1.getValue()), "To String");
	}
	
	/**
	 * Method to test the equals() method in the Die class
	 */
	@Test
	public void testEquals()
	{
		Die d1 = new Die();
		Die d2 = new Die(DEFAULT_SIDES);
		Die d3 = new Die(Die.MINIMUM_NUMBER_OF_SIDES);
		Card c1 = new Card(CardSuit.Spades, Card.ACE);
		assertTrue(d1.equals(d2) == true, "Equals");
		assertTrue(d1.equals(d3) == false, "Does not equal");
		assertTrue(d1.equals(c1) == false, "Is not Card object");
		assertTrue(d1.equals(null) == false, "Is not null");
	}
	
	/**
	 * Method to test the hashcode() method in the Die class
	 */
	@Test 
	public void testHashcode()
	{
		Die d1 = new Die();
		assertTrue(d1.hashcode() == d1.getValue() * (d1.getNumberOfSides()
				* d1.getNumberOfSides()), "Hashcode");
		
		Die d2 = new Die(DEFAULT_SIDES);
		assertTrue(d2.hashcode() == d2.getValue() * (d2.getNumberOfSides()
				* d2.getNumberOfSides()), "Hashcode");
		
		Die d3 = new Die(Die.MINIMUM_NUMBER_OF_SIDES);
		assertTrue(d3.hashcode() == d3.getValue() * (d3.getNumberOfSides()
				* d3.getNumberOfSides()), "Hashcode");
		
		Die d4 = new Die(Die.MAXIMUM_NUMBER_OF_SIDES);
		assertTrue(d4.hashcode() == d4.getValue() * (d4.getNumberOfSides()
				* d4.getNumberOfSides()), "Hashcode");
		
		Die d5 = new Die(INVALID_NUMBER_OF_SIDES_MAX);
		assertTrue(d5.hashcode() == d5.getValue() * (d5.getNumberOfSides()
				* d5.getNumberOfSides()), "Hashcode");
		
		Die d6 = new Die(INVALID_NUMBER_OF_SIDES_MIN);
		assertTrue(d6.hashcode() == d6.getValue() * (d6.getNumberOfSides()
				* d6.getNumberOfSides()), "Hashcode");	
	}
	
	
}
