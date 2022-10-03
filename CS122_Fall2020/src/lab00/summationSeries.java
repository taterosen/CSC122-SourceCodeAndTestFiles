package lab00;

/*
 * Lab 1: Chapter 1 Program 1.6
 * 		--> "1.6: (Summation of a series) Write a program that displays the result of
 * 								1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10."
 *  @author Tate Rosen
 *  Date: 08/20/2020
 */

public class summationSeries 
{


	public static void main(String[] args) 
	{
		int greatestValue = 10;

		int seriesTotal = 0; 

		//Adds the numbers until the value of the input integer 'greatestValue' is reached.
		for(int i = 0; i < greatestValue; i++)
		{ 
			seriesTotal = seriesTotal + (i + 1);
		}

		System.out.println("The summation of all the values between 0 and " + greatestValue + " is: " + seriesTotal);


	}

}