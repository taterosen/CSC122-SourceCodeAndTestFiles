package lab01;

/**
 * Die class to create a die object - to accompany the class Craps
 * @author taterosen & willharris
 * Date: 08/27/2020
 */

public class Die 
{
	// Defines constants for the number of sides and the side facing up.
	private final int numberOfSides;
	private int faceValue = 1;

	// Defines constants for the minimum, maximum, and default number of sides the die can have.
	public static final int MINIMUM_NUMBER_OF_SIDES = 2;
	public static final int MAXIMUM_NUMBER_OF_SIDES = 32;
	private static final int DEFAULT_NUMBER_OF_SIDES = 6;

	/**
	 * A default constructor to create a die with six sides.
	 */
	public Die()
	{
		this(DEFAULT_NUMBER_OF_SIDES);
	}

	/**
	 * A constructor to create a die with a given number of sides.
	 * If the input is outside the minimum and maximum, it defaults to six sides.
	 * @param sides
	 */
	public Die(int sides)
	{
		if (sides >= MINIMUM_NUMBER_OF_SIDES && sides <= MAXIMUM_NUMBER_OF_SIDES)
		{
			numberOfSides = sides;
		}
		else
		{ 
			numberOfSides = DEFAULT_NUMBER_OF_SIDES;
		} 
	}

	/**
	 * A method to 'roll' the die and randomly change the side facing up.
	 */
	public void roll()
	{
		faceValue = (int)(Math.random() * numberOfSides) + 1;
	}
	
	/**
	 * 
	 * @return the number of sides on the Die
	 */
	public int getNumberOfSides()
	{
		return numberOfSides;
	}


	/**
	 * 
	 * @return the value of the side facing up
	 */
	public int getValue()
	{
		return faceValue;
	}

	/**
	 * @return a String representation of the Die object.
	 */
	@Override
	public String toString()
	{
		return("A " + numberOfSides + "-sided die; value " + faceValue);
	}

	/**
	 * Checks for object equality between two dice
	 * @return true if numberOfSides and faceValue are identical; false otherwise
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Die)
		{
			return numberOfSides == ((Die)obj).numberOfSides && faceValue == ((Die)obj).faceValue;
		}
		else
		{
			return false;
		}
	}

	/**
	 * 
	 * @return a hashcode value
	 */
	public int hashcode() 
	{
		return this.faceValue * (numberOfSides * numberOfSides);
	}


}
