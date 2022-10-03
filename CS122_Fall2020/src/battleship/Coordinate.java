package battleship;
/**
 * Basic Coordinate Class
 * @author taterosen & allenclark
 * 10/08/2020
 */

public class Coordinate 
{
	public final int row;
	public final int column;
	
	public Coordinate(int r, int c)
	{
		this.row = r;
		this.column = c;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Coordinate)
		{
			return row == ((Coordinate)obj).row && column == ((Coordinate)obj).column;
		}
		else
			return false;
	}
	
	@Override
	public String toString()
	{
		return row + ", " + column;
	}

}
