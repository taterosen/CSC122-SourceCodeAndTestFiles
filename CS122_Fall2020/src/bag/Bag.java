package bag;

/**
 * Basic generic Bag class
 * @author taterosen
 * 09/17/2020
 */

public class Bag <Element> 
{
	public static final int DEFAULT_SIZE = 20;
	public static final int ITEMS_PER_ROW = 4; // how many items on a row in the toString() method

	private Element[] bag;

	/**
	 * Create a single default bag
	 */
	@SuppressWarnings("unchecked")
	public Bag()
	{
		bag = (Element[]) new Object[DEFAULT_SIZE];

	}

	/**
	 * 
	 * @return how many items are currently able to fit in the bag
	 */
	public int getBagSize()
	{
		return bag.length;
	}

	/**
	 * 
	 * @return the number of items currently in the bag
	 */
	public int getCurrentSize()
	{
		int count = 0;
		for(int i = 0; i < bag.length; i++)
		{
			if(bag[i] != null)
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @return true if the Bag is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		boolean isEmpty = true;
		int count = 0;
		while(isEmpty && count < bag.length)
		{
			if(bag[count] != null)
			{
				isEmpty = false;
			}
			count++;
		}
		return isEmpty;
	}


	/**
	 * Adds a given Item to the first empty space in the Bag
	 * If Bag is full, auto-expands Bag and adds item
	 * @param anEntry
	 */
	public void add(Element anEntry)
	{
		if(anEntry != null)
		{
			if(this.getCurrentSize() == bag.length)
			{
				@SuppressWarnings("unchecked")
				Element[] tempBag = (Element[])new Object[bag.length * 2];
				for(int i = 0; i < bag.length; i++)
				{
					tempBag[i] = bag[i];
				}
				bag = tempBag;
			}

			boolean add = false;
			int count = 0;
			while(!add && count < bag.length)
			{
				if(bag[count] == null)
				{
					bag[count] = anEntry;
					add = true;
				}
				count++;
			}
		}
	}

	/**
	 * 
	 * @param anEntry
	 * @return how many of a given Item are in the Bag
	 */
	public int getFrequencyOf(Element anEntry)
	{
		int count = 0;
		if (anEntry != null)
		{
			for(int i = 0; i < bag.length; i++)
			{
				if(anEntry.equals(bag[i]))
				{
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * 
	 * @return true if the Bag contains a given Item; false otherwise
	 */
	public boolean contains(Element anEntry)
	{
		boolean contains = false;
		int count = 0;
		while (!contains && count < bag.length && anEntry != null)
		{
			if(anEntry.equals(bag[count]))
			{
				contains = true;
			}
			count++;
		}
		return contains;
	}

	/**
	 * Remove an Item from the Bag
	 * @return the removed Item; null if Bag is empty
	 */
	public Element remove()
	{
		Element removedItem = null;
		int count = 0;
		if(isEmpty())
		{
			return removedItem;
		}
		else {
			while(count < bag.length && bag[count] == null)
			{
				count++;
			}
			removedItem = bag[count];
			bag[count] = null;
		}
		return removedItem;
	}

	/**
	 * removes one instance of an item equal to anEntry if it exists
	 * @param anEntry
	 * @return true if returned successfully; false if no entry matched or Bag is empty
	 */
	public boolean remove(Element anEntry)
	{
		boolean isRemoved = false;
		if(!this.isEmpty())
		{
			int count = 0;
			while(count < bag.length && !isRemoved)
			{
				if(bag[count] != null && bag[count].equals(anEntry))
				{
					isRemoved = true;
				}
				else
				{
					count++;
				}
			}
			if(isRemoved)
			{
				bag[count] = null;
			}
		}
		return isRemoved;
	}

	/**
	 * @return a string representation of the Bag
	 */
	@Override
	public String toString()
	{
		String bagString = "A bag containing: \n";
		if(this.isEmpty())
		{
			bagString += "Nothing in bag.";
		}
		else if(!this.isEmpty()) 
		{
			int count = 0;
			for(int i = 0; i < bag.length; i++)
			{
				if(count < ITEMS_PER_ROW && bag[i] != null)
				{
					bagString += bag[i].toString() + ", ";
					count++;
				}
				else if (bag[i] != null)
				{
					bagString += bag[i].toString() + " \n \n";
					count = 0;
				}
			}
		}
		return bagString;
	}

	/**
	 * Removes all items from the Bag
	 */
	public void clear()
	{
		if(!this.isEmpty())
		{
			for(int i = 0; i < bag.length; i++)
			{
				bag[i] = null;
			}
		}
	}

	/**
	 * 
	 * @return the percent of the Bag that is currently full
	 */
	public double percentFull()
	{
		double percentFull = ((double)this.getCurrentSize()/bag.length);

		return ((int)(percentFull * 100)) / 100.0;
	}

}

