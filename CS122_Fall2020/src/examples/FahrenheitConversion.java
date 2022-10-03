package examples;

/**
 * 	Program to convert temperature from Fahrenheit to Celcius
 * @author trosen
 * Date: 08/19/2020
 */ 
	

public class FahrenheitConversion 
{
	//Creates a method that is static so it can be shared throughout the program. 
	//This method exists even without any object and belongs to a class.
	public static double fahrenheitToCelcius (double temp)				//creates a method to convert a double
	{ 
		//Do a Fahrenheit to Celcius conversion:
		double tempC = (temp - 32) * (5.0/9);
		
		//Return new value so it can be used in other methods:
		return tempC; 
	}
	
	
	public static void main(String[] args) 
	{
		//State the initial temp value:
		double tempF = 75.0; 
		
		//Induce conversion through double method:
		int tempAsInteger = (int) fahrenheitToCelcius(tempF);
		
		//Print the conversion result:
		System.out.println ("Result is: " + tempAsInteger);      
		
		
	}

}