package textbookPrograms;

/**
 * Chapter 2 Program Exercise 2.5: Write a program that calculates gratuity when the 
 * 						the user inputs a total and gratuity rate and then prints
 * 						the gratuity and the total.
 * @author taterosen
 * Date: 08/23/2020
 */

import java.util.*;

public class CalculateGratuity
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		//Have user provide the subtotal and the gratuity rate.
		System.out.print("Enter the subtotal and the gratuity rate separated by a space: ");

		double subtotal = input.nextDouble();
		int gratuityRate = input.nextInt();

		//Calculate the gratuity and total values based on the input from user.
		double gratuity = subtotal * (gratuityRate / 100.0);

		double total = subtotal + gratuity;

		System.out.printf("The gratuity is $%4.2f and total is $%4.2f", gratuity, total);


	}

}