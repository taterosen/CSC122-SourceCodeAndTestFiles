package miscellaneous;

import java.util.Scanner;

public class CustomNecklace 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Which type of bead?");
		String bead = keyboard.nextLine();
		
		System.out.println("How many beads?");
		int number = keyboard.nextInt();
		
		System.out.println(createNecklace(bead, number));
	}
	
	public static String createNecklace(String bead, int number)
	{
		String necklace = "";
		if (bead.equals("square"))
		{
			for(int i = 1; i <= number; i++)
			{
				necklace += "[ ]";
			}
		}
		else if (bead.equals("circle"))
		{
			for(int i = 1; i <= number; i++)
			{
				necklace += "( )";
			}
		}
		
		return necklace;
	}

}
