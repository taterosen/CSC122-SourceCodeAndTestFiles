package bag;

/**
 * Basic generic Set class
 * @author taterosen & marissapatel
 *
 * @param <Element>
 */

public class Set <Element> extends Bag <Element>
{
	/**
	 * Adds an entry to the Set if that entry is not
	 * already present in the Set
	 */
	@Override
	public void add (Element anEntry)
	{
		if(!this.contains(anEntry))
		{
			super.add(anEntry);
		}
	}
	
	/**
	 * Throws an exception if the getFrequencyOf() is used
	 * because a set has a frequency of 1 for every item
	 */
	@Override
	public int getFrequencyOf(Element anEntry)
	{
		throw new UnsupportedOperationException ("Set has no use for this method.");
	}

}
