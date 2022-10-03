package lab00;

/*
 * Lab 1: Chapter 2 Program 2.4
 * 		--> "2.4: (Convert square meter into ping) Write a program that converts square meter into ping.
 *					The program prompts the user to enter a number in square meter, converts it to ping,
 * 					and displays the result. One square meter is 0.3025 ping."
 */


import java.util.Scanner;

public class ComputeAreaWithConstant 
{
	public static void main(String[] args) 
	{
		final double PI = 3.14159; // Declare a constant
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		// Compute area
		double area = radius * radius * PI;

		// Display result
		System.out.println("The area for the circle of radius " +
				radius + " is " + area);
	}
}
