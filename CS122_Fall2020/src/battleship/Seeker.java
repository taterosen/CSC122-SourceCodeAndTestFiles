package battleship;

/**
 * Seeker class to capture the flag
 * @author taterosen
 * 10/21/2020
 */

import battleship.Ocean.CompassDir;
import queue.Queue;

public class Seeker 
{
	static Holder<GridPoint> options = new Queue<GridPoint>();
	
	/**
	 * Method to add visitable neighbors of a point to the queue
	 * @param grid
	 * @param currentPosition
	 */
	private static void addNeighborsTo(Ocean grid, GridPoint currentPosition)
	{
		for(CompassDir dir: CompassDir.values())
		{
			GridPoint gp = grid.visitableNeighborTo(currentPosition, dir);
			if(gp != null)
			{
				options.add(gp);
			}
		}
	}
	
	/**
	 * main method that uses a file and searches for a mine 
	 * @param args
	 * @throws IllegalAccessException
	 */
	public static void main(String args[]) throws IllegalAccessException
	{
		Ocean o = new Ocean("oceanFile.txt");
		GridPoint currentPosition = o.getStartingPosition();
		currentPosition.visit();
		
		addNeighborsTo(o, currentPosition);
		
		while(!options.isEmpty() && !o.atEnd(currentPosition))
		{
			currentPosition = options.remove();
			currentPosition.visit();
			System.out.println("Visiting Coordinate: " + currentPosition);
			addNeighborsTo(o, currentPosition);
		}
		if(o.atEnd(currentPosition))
			System.out.println("BOOM");
		else
			System.out.println("No luck.");
		
		System.out.println(o);
	}
	
}
