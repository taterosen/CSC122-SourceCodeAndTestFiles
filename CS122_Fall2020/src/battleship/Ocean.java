package battleship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import bag.Bag;
import battleship.GridPoint.GridType;
import battleship.Ocean.CompassDir;

/**
 * Ocean class with main method
 * @author taterosen & allenclark
 * 10/08/2020
 */

public class Ocean 
{
	private GridPoint[][] grid;
	private GridPoint startingPosition;
	private GridPoint endPosition;	
	
	/**
	 * 
	 * Enumerated type for the four cardinal directions
	 */
	public enum CompassDir
	{
		North(-1,0), South(1,0), East(0,1), West(0,-1);
		
		final int offsetX;
		final int offsetY;
		CompassDir(int x, int y)
		{
			offsetX = x;
			offsetY = y;
		}
	}
	
	/**
	 * Ocean constructor using file input
	 * @param filename
	 */
	public Ocean(String filename)
	{
		Scanner sc = null;
		try {
			sc = new Scanner (new File(filename));  

			grid = new GridPoint[sc.nextInt()][sc.nextInt()];
			
			for(int row = 0; row < grid.length; row++)
			{
				for(int column = 0; column < grid[row].length; column++)
				{
					Coordinate coor = new Coordinate(row,column);
					grid[row][column] = new GridPoint(coor, GridType.Open);
				}
			}
			
			while(sc.hasNext())
			{
				int row = sc.nextInt();
				int column = sc.nextInt();
				String s = sc.next();
				char type = s.charAt(0);
				double cost = 1.0;
				GridType g = GridType.typeForChar(type);
				
				if(g.equals(GridType.Open))
					cost = sc.nextDouble();
				grid[row][column] = new GridPoint(new Coordinate(row,column), g, cost);
				
				if(g.equals(GridType.Start))
					startingPosition = grid[row][column];
				if(g.equals(GridType.Mine))
					endPosition = grid[row][column];
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	/**
	 * Check a coordinate on place in the specified direction for visitable-ness
	 * @param gp
	 * @param dir
	 * @return a coordinate if it is visitable; false otherwise
	 */
	public GridPoint visitableNeighborTo(GridPoint gp, CompassDir dir) 
	{
		int neighborX = gp.getCoordinate().row + dir.offsetX;
		int neighborY = gp.getCoordinate().column + dir.offsetY;
		GridPoint n = null;
		if( (neighborX >= 0 && neighborX < grid.length)
			&& (neighborY >= 0 && neighborY < grid[0].length)
			&& !(grid[neighborX][neighborY].hasBeenVisited()))
			//&& !gp.getType().equals(GridType.Boat))
		{
			n = grid[neighborX][neighborY];
		}
		return n;	
	}
	
	/**
	 * 
	 * @return the point with type S
	 */
	public GridPoint getStartingPosition() 
	{
		return startingPosition;
	}
	
	public boolean atEnd(GridPoint currentPosition) 
	{
		return currentPosition.equals(endPosition);
	}
	
	/**
	 * @return String representation of the Ocean
	 */
	@Override
	public String toString()
	{
		StringBuilder ocean = new StringBuilder();
		for(int row = 0; row < grid.length; row++)
		{
			for(int column = 0; column < grid[row].length; column++)
			{
					ocean.append(grid[row][column] + " ");
			}
			ocean.append("\n");
		}
		return ocean.toString();
	}

}
