package textbookPrograms;

/**
 * Chapter 1 Program Exercise 1.10: Write a program that calculates and displays
 * 			a runner's speed in miles per hour from kilometers.
 * @author taterosen
 * Date: 08/23/2020
 */

public class AverageSpeed 
{
	final static int SECONDS_PER_MINUTE = 60;
	final static int MINUTES_PER_HOUR = 60;
	final static double KILOMETERS_PER_MILE = 1.6;

	/** Method that calculates the number of miles from an input value in kilometers and returns it as a double. */
	public static double numberOfMiles(double kilometers)
	{
		double miles = kilometers/KILOMETERS_PER_MILE;
		return miles;
	}

	/** Method that calculates the number of hours from input values in hours, minutes, and seconds and returns it as a double. */
	public static double numberOfHours(double hours, int minutes, int seconds)
	{
		int totalSeconds = seconds + (minutes * SECONDS_PER_MINUTE);
		double timeInHours = (double) totalSeconds / SECONDS_PER_MINUTE / MINUTES_PER_HOUR;
		return timeInHours;
	}

	/** Method that calculates the average speed in mph from input values in miles and hours and returns it as a double. */
	public static double averageMPH (double miles, double hours)
	{
		double avgMPH = miles / hours;
		return avgMPH; 
	}



	public static void main(String[] args) 
	{
		double totalKilometers = 14.0;
		double totalHours = 0.0;
		int totalMinutes = 45;
		int totalSeconds = 30;

		//Calculate the values in miles and hours needed to use the averageMPH method from the original values.
		double totalMiles = numberOfMiles(totalKilometers);
		totalHours = numberOfHours(totalHours, totalMinutes, totalSeconds);

		//Calculate the average speed in mph.
		double avgSpeedInMilesPerHour = (int) (averageMPH(totalMiles, totalHours) * 100) / 100.0;

		System.out.println ("The runner's average speed in miles per hour was " + avgSpeedInMilesPerHour);
	}

}