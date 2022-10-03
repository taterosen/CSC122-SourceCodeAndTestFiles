package textbookPrograms;

/**
 * Chapter 3 Program Exercise 3.6: Revise Listing 3.4 to allow user to enter
 * 						weight, feet, and inches.
 * @author taterosen
 *
 */

import java.util.*;

public class ComputeAndInterpretBMI 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		final double INCHES_PER_FOOT = 12;  //Constant
		final double KILOGRAMS_PER_POUND = 0.45359237;  // Constant
		final double METERS_PER_INCH = 0.0254;  // Constant

		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		// Prompt the user to enter height in feet and inches
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		// Calculate height in inches
		inches += feet * INCHES_PER_FOOT;

		//Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = inches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		//Display Result
		System.out.printf("BMI is %6.4f \n", bmi);
		if (bmi < 18.5)
		{
			System.out.println("Underweight");
		}
		else if (bmi < 25)
		{
			System.out.println("Normal");
		}
		else if (bmi < 30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}

	}

}