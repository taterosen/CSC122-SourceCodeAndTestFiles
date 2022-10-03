package battleship;
/**
 * Basic GridPoint class
 * @author taterosen & allenclark
 * 10/08/2020
 */

public class GridPoint 
{
	private Coordinate coordinate;
	private GridType type;
	private double cost;
	private boolean visited = false;
	
	private final static double DEFAULT_COST = 1.0;
	
	/**
	 * Enumerated type to handle many values
	 */
	public enum GridType
	{
		Boat('B','B'), Start('S','S'), Mine('M','M'), Open('.','-');
		
		public final char displayChar;
		public final char fileChar;
		
		GridType(char fc, char dc)
		{
			this.displayChar = dc;
			this.fileChar = fc;
		}
		
		public static GridType typeForChar(char c) {
			GridType gtype = GridType.Open;
			for(GridType g: GridType.values())
			{
				if(g.fileChar == c)
					return g;
			}
			return gtype;
		}
	}
	
	/**
	 * Constructor with coordinate & type, without cost
	 * @param coor
	 * @param ty
	 */
	public GridPoint(Coordinate coor, GridType ty)
	{
		this(coor, ty, DEFAULT_COST);
	}
	
	/**
	 * Full constructor including cost, coordinate, & type
	 * @param coor
	 * @param ty
	 * @param cos
	 */
	public GridPoint(Coordinate coor, GridType ty, double cos)
	{
		this.coordinate = coor;
		this.type = ty;
		this.cost = cos;
		if(this.type.equals(GridType.Boat))
				visited = true;
	}
	
	/**
	 * @return true if visited boolean is true; false otherwise
	 */
	public boolean hasBeenVisited()
	{
		return visited;
	}
	
	/**
	 * Change visited to true to show the GridPoint has 
	 * been visited
	 */
	public void visit()
	{
		visited = true;
	}
	

	/**
	 * 
	 * @return the coordinate for this GridPoint
	 */
	public Coordinate getCoordinate()
	{
		return this.coordinate;
	}
	
	/**
	 * 
	 * @return the type for this GridPoint
	 */
	public GridType getType()
	{
		return this.type;
	}
	
	/**
	 * @return a String representation of the GridPoint
	 */
	@Override
	public String toString()
	{
		return "" + type.displayChar;
	}

	
}
