package boat;

/**
 * Basic Boat class to be used in battleship game
 * @author taterosen
 * Date: 09/01/2020
 */

public class Boat 
{
	
	public final String name;
	private int health;
	private int xPosition;
	private int yPosition;
	private char orientation;
	public final int length;
	public final int[][] position;
	
	public static final int CARRIER_LENGTH = 5;
	public static final int BATTLESHIP_LENGTH = 4;
	public static final int CRUISER_SUBMARINE_LENGTH = 3;
	public static final int DESTROYER_LENGTH = 2;
	public static final int BOAT_WIDTH = 1;
	
	public static final int FULL_SPACE = 1;
	public static final int EMPTY_SPACE = 0;
	
	public static final int BOW = 0;
	public static final int BOARD_LENGTH = 10;
	
	public static final int CHAR_A_AS_INT = 65;
	
	public static final char NORTH = 'N';
	public static final char SOUTH = 'S';
	public static final char EAST = 'E';
	public static final char WEST = 'W';
	
	/**
	 * Constructor to create a single valid Boat
	 * Improper valued parameters will be forced to valid
	 * @param name
	 * @param xPosition
	 * @param yPosition
	 * @param orientation
	 */
	public Boat (String name, int xPosition, int yPosition, char orientation)
	{
		//TODO Add if statements to make sure values are within limits and don't overlap
		this.name = name.toLowerCase();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.orientation = orientation;
		this.health = this.initialHealth();
		this.length = this.getLength();
		this.position = this.getPosition();
	}
	
	/**
	 * 
	 * @return the length of the boat in board spaces
	 */
	public int getLength()
	{
		switch ( name ) 
		{
		case "carrier" :   return CARRIER_LENGTH;
		case "battleship" :   return BATTLESHIP_LENGTH;
		case "cruiser" :
		case "submarine" : return CRUISER_SUBMARINE_LENGTH; 
		case "destroyer" :    return DESTROYER_LENGTH;
		}
		return -1;  //should never get here
	}
	
	/**
	 * 
	 * @return the initial health of the boat
	 */
	public int initialHealth()
	{
		return this.getLength();
	}
	
	/**
	 * 
	 * @return the current health of the boat
	 */
	public int getHealth()
	{
		return this.health;
	}
	
	/**
	 * 
	 * @return the row the boat is in as a char
	 */
	public char rowAsChar()
	{
		/*char row = ' ';
		for (int i = 0; i < BOARD_LENGTH; i++)
		{
			if (i + BOAT_WIDTH == this.yPosition)
			{
				row = (char)(i + CHAR_A_AS_INT);
			}
		}*/
		return (char)(this.yPosition - BOAT_WIDTH + CHAR_A_AS_INT);
	}
	
	/**
	 * 
	 * @return the boat position as a defined array
	 */
	public int[][] getPosition()
	{
		//TODO is code too repetitive for each orientation? how can I write in condensed way I can reuse?
		
		int[][] pos;// = new int[this.length][BOAT_WIDTH];            
		int count = BOW;											
		if (this.orientation == NORTH ) //|| this.orientation == WEST)
		{
			pos = new int[this.length][BOAT_WIDTH]; 
			for(int row = 0; row < pos.length; row++)     
			{
					pos[row][0] = this.xPosition + count;    
					count++;
			}
			return pos;
		}
		
		if (this.orientation == SOUTH) //|| this.orientation == EAST)
		{
			pos = new int[this.length][BOAT_WIDTH];
			for(int column = 0; column < pos.length; column++)   
			{
					pos[column][0] = this.xPosition - count;    
					count++;
			}
			return pos;
		}
		
		if (this.orientation == EAST)
		{
			pos = new int[BOAT_WIDTH][this.length];                    
			for(int column = 0; column < pos[0].length; column++)    
			{
					pos[0][column] = this.xPosition - count;    
					count++;
			}
			return pos;
		}
		
		if (this.orientation == WEST)
		{
			pos = new int[BOAT_WIDTH][this.length];
			for(int column = 0; column < pos[0].length; column++)   
			{
					pos[0][column] = this.xPosition + count;    
					count++;
			}
			return pos;
		}
		
		return null;  //should never get here
	}
	
	/**
	 * 
	 * @return a string representation of the position array of the Boat
	 */
	public String stringPosition()
	{
		String posArrayString = "";
		//if(this.position[0].length > 1)
			//return this.position[0][2] + "";
		
		if(this.orientation == NORTH || this.orientation == SOUTH)
		{
			for (int row = 0; row < this.position.length; row++)
			{
				posArrayString += (char)(this.position[row][0] + CHAR_A_AS_INT) + " ";
			}
			return "The " + this.name + " is located in spaces " + posArrayString
				+ "in column " + this.xPosition + " facing the orientation " + this.orientation;
		}
		else if(this.orientation == EAST || this.orientation == WEST)
		{
			for (int column = 0; column < this.position[0].length; column++)
			{
				posArrayString += this.position[0][column] + " ";
			}
			return "The " + this.name + " is located in spaces " + posArrayString
				+ "in row " + this.rowAsChar() + " facing the orientation " + this.orientation;
		}
		return "";   //should never get here
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return true if the Boat is hit; false otherwise
	 */
	public boolean strike (int x, int y)         // (x = 2, y = 5)
	{
		//TODO make strikes return true for Boats w/orientation E or W
		//why does this code only return true when Boats w/orientation N or S are hit?
		//TODO also figure out if there's a way to shorten all this??
		int boatLength = 0;
		int boatWidth = 0;
		
		switch (orientation)
		{
		case NORTH:
		case SOUTH: boatLength = y;     
		case EAST:
		case WEST: boatWidth = x;      
		
		}
		
		switch (orientation)
		{
		case NORTH:
		case SOUTH: boatWidth = x;     
		case EAST:
		case WEST: boatLength = y;      
		
		}
		
		if (this.orientation == NORTH || this.orientation == SOUTH)   
		{
			for (int i = 0; i < this.position.length; i++) 
			{
				if(this.position[i][0] == boatLength && this.yPosition == boatWidth)  
				{
					this.health -= BOAT_WIDTH;
					return true;
				}
			}
		}
		
		if (this.orientation == EAST || this.orientation == WEST)      
		{
			for (int i = 0; i < this.position[0].length; i++)
			{
				if(this.position[0][i] == boatWidth && this.yPosition == boatLength)
				{
					this.health -= BOAT_WIDTH;
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	/**
	 * 
	 * @return true if Boat is sunk; false otherwise
	 */
	public boolean isSunk()
	{
		return this.health == 0;
	}
	
	/**
	 * @return a string representation
	 */
	@Override
	public String toString() 
	{	
		return "A " + this.name + " with initial health " + this.length 
				+ " and current health " + this.health +
				" at row " + this.rowAsChar() + " and column " +
				xPosition + " and orientation " + orientation;
	}


}
