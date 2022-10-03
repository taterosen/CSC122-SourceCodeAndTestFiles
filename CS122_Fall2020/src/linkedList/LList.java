package linkedList;

/**
 * Linked List Class
 * @author taterosen
 * 10/23/2020
 * @param <E>
 */

public class LList<E> implements List<E>
{
	@SuppressWarnings("rawtypes")
	private Node head;
	private int numberOfEntries;

	/**
	 * Create a Linked List
	 */
	public LList()
	{
		head = null;
		numberOfEntries = 0;
	}

	/**
	 * Add an item to the end of the List
	 * @param item
	 */
	@Override
	public void add(E item)
	{
		this.add(numberOfEntries, item);
	}

	/**
	 * Add an item to a specific position in the List
	 * Add to the beginning if position <= 0
	 * Add to the end if position > number of entries
	 * @param pos
	 * @param item
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void add(int pos, E item) 
	{
		if(item != null)
		{
			if(head == null || pos <= 0)      //add to front
			{
				head = new Node(item, head);
			}
			else                              //add anywhere else
			{
				Node nxt = head;
				int i = 1;
				while(nxt.next != null && i < pos)    //gets you from start of list to just before pos
				{
					nxt = nxt.next;
					i++;
				}
				Node n = new Node(item, nxt.next);
				nxt.next = n;
			}
			numberOfEntries++;
		}

	}

	/**
	 * @param item
	 * @return true if the List contains an item; false otherwise
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public boolean contains(E item) 
	{
		boolean contains = false;
		Node ptr = head;
		while(!contains && ptr != null)
		{
			if(ptr.data.equals(item))
			{
				contains = true;
			}
			ptr = ptr.next;
		}
		return contains;
	}

	/**
	 * @return the number of items in the List
	 */
	@Override
	public int size() 
	{
		return numberOfEntries;
	}

	/**
	 * @return true if there are no items in the List; false otherwise
	 */
	@Override
	public boolean isEmpty() 
	{
		return numberOfEntries == 0;
	}

	/**
	 * @param pos
	 * @return the item at a certain position in the List
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public E get(int pos) 
	{
		Node ptr = head;
		if(numberOfEntries == 0)
			return null;
		else if(pos <= 0)
		{
			return (E) ptr.data;
		}
		else
		{
			int i = 0;
			while(i < numberOfEntries - 1 && i < pos)
			{
				ptr = ptr.next;
				i++;
			}
			return (E) ptr.data;
		}
	}

	/**
	 * Remove an item at a certain position in the list
	 * @param pos
	 * @return the item removed; null if empty
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public E remove(int pos) 
	{
		Node temp;
		if(numberOfEntries == 0)
			return null;
		else if(pos <= 0 || numberOfEntries == 1)
		{
			temp = head;
			head = head.next;
			numberOfEntries--;
			return (E) temp.data;
		}
		else
		{
			Node ptr = head;
			int i = 1;
			while(i < numberOfEntries - 1 && i < pos)
			{
				ptr = ptr.next;
				i++;
			}
			temp = ptr.next;
			ptr.next = temp.next;
			numberOfEntries--;
			return (E) temp.data;
		}
	}

	/**
	 * Remove all items from the List
	 */
	@Override
	public void clear() 
	{
		head = null;
		numberOfEntries = 0;
	}

	/**
	 * 
	 * @param item
	 * @return the last index of a certain item in the List; null if empty
	 */
	@SuppressWarnings("rawtypes")
	public int findLastIndexOf(E item)
	{
		int index = -1;
		Node ptr = head;
		int i = 0;
		while(ptr != null)
		{
			if(ptr.data.equals(item))
			{
				index = i;
			}
			ptr = ptr.next;
			i++;
		}
		return index;
	}

	/**
	 * @return a string representation of the List
	 */
	@SuppressWarnings("rawtypes")
	@Override 
	public String toString()
	{

		StringBuilder s = new StringBuilder("LList:");
		Node ptr = head;
		while(ptr != null)
		{
			s.append(ptr.data + ";");
			ptr = ptr.next;
		}
		return s.toString();
	}

	/**
	 * Private Node class for use in Linked List class
	 * @author taterosen
	 * 
	 * @param <E>
	 */
	@SuppressWarnings({ "rawtypes", "hiding" })
	private class Node <E>
	{
		E data;
		Node next;
		Node(E data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}

}
