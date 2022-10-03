package boat;

/**
 * Battleship game to test boat class
 * @author taterosen
 * Date: 09/01/2020
 */

import java.util.*;

public class Battleship 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		Boat cruiser = new Boat("Cruiser", 3, 7, 'E');
		Boat carrier = new Boat("Carrier", 5, 2, 'N');
		Boat battleship = new Boat("Battleship", 8, 6, 'S');
		Boat submarine = new Boat("Submarine", 1, 4, 'W');
		
		System.out.println(cruiser);
		System.out.println(carrier);
		System.out.println(battleship);
		System.out.println(submarine);
		
		System.out.println();
		
		System.out.println("Is our carrier sunk?: " + carrier.isSunk());

		System.out.println();
		
		System.out.println(carrier.stringPosition());
		System.out.println(cruiser.stringPosition());
		System.out.println(battleship.stringPosition());
		System.out.println(submarine.stringPosition());
		
		System.out.println();
		
		System.out.println("Our carrier is located in row " + carrier.rowAsChar());
		
		System.out.println();
		
		System.out.print("Please enter coordinates separated by a space (ex: A 3): ");
		char row = input.next().charAt(0);
		int rowAsInt = ((int)row) - 64;
		int column = input.nextInt();
		
		while ((row < 'A' || row > 'J') || (column < 1 || column > 10))
		{
			System.out.print("Invalid coordinates - please try again: ");
			row = input.next().charAt(0);
			rowAsInt = ((int)row) - 64;
			column = input.nextInt();
		}
		
		System.out.println("The coordinates you entered: " + row + " " + column );
		
		System.out.println(); 
		
		System.out.println("row as int: " + rowAsInt);
		
		System.out.println();
		
		System.out.println("Carrier hit?: " + carrier.strike(rowAsInt, column));
		System.out.println("Cruiser hit?: " + cruiser.strike(rowAsInt, column));
		System.out.println("Battleship hit?: " + battleship.strike(rowAsInt, column));
		System.out.println("Submarine hit?: " + submarine.strike(rowAsInt, column));
		
		System.out.println();
		
		System.out.println("Carrier health: " + carrier.getHealth());
		System.out.println(carrier);
		
		
		
		

	}

}
