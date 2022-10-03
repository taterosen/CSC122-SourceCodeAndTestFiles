package heap;

/**
 * MinHeap - Complete Binary Search
 * @author taterosen
 * 11/02/2020
 */

public class Heap <T extends Comparable <T>>
{
	private T[] myheap;
	private int size; 
	public static final int HEAP_SIZE = 110;
	public static final int ROOT = 1;
	
	/**
	 * Basic Heap constructor
	 */
	public Heap()
	{
		size = 0;
		myheap = (T[]) new Comparable[HEAP_SIZE];
	}
	
	/**
	 * Adds an item to the Heap and percolates it up as necessary
	 * @param item
	 */
	public void add(T item)
	{
		size++; 
		myheap[size] = item;
		
		int perc = size;
		while(perc > 1 && myheap[perc].compareTo(myheap[perc/2]) < 0)
		{
			T temp = myheap[perc];
			myheap[perc] = myheap[perc/2];
			myheap[perc/2] = temp;
			perc = perc/2;
		}
		
	}
	
	/**
	 * Removes the minimum item from the heap, then
	 * moves the last item to the root and percolates
	 * down as necessary
	 * @return the removed item
	 */
	public T remove()
	{
		T minItem = myheap[ROOT];
		myheap[ROOT] = myheap[size];
		myheap[size] = null; 
		size--;
		
		percolateDown(ROOT);
		return minItem;
		
	}
	
	/**
	 * Recursive algorithm to percolate down
	 * when using the remove method
	 * @param n
	 */
	public void percolateDown(int n)
	{
		int x = 2 * n;
		if(size >= x)
		{
			if(size > 2 * n && myheap[(2 * n) + 1].compareTo(myheap[x]) < 0)
				x += 1;
			
			if(myheap[n].compareTo(myheap[x]) > 0)
			{
				T temp = myheap[n];
				myheap[n] = myheap[x];
				myheap[x] = temp;
				percolateDown(x);
			}
		}
	}
	
	/**
	 * 
	 * @return the root of the Heap (the minimum value)
	 */
	public T peek()
	{
		if(this.size > 0) 
			return myheap[1];
		else return null;
	}
	
	/**
	 * 
	 * @return true if the Heap is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	 * 
	 * @return the number of items in the Heap
	 */
	public int size()
	{
		return size;
	}
	
	/**
	 * @return a string representation of the Heap
	 */
	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder(":");
		for(int i = 1; i <= size; i++)
		{
			s.append(myheap[i] + " ");
		}
		
		return s.toString();
	}

}
