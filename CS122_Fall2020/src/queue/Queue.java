package queue;

import battleship.Holder;

public class Queue <Element> implements Holder<Element>
{
	public final static int DEFAULT_LENGTH = 10;
	
	private Element[] queue;
	int counter = 0;
	
	int head = 0;
	int tail = 0;
	
	/**
	 * Create a default Queue
	 */
	@SuppressWarnings("unchecked")
	public Queue()
	{
		queue = (Element[]) new Object[DEFAULT_LENGTH];
	}
	
	/**
	 * 
	 * @return how many Elements are currently in Queue
	 */
	public int getSize()
	{
		return ((tail + queue.length) - head) % queue.length;
	}
	
	/**
	 * 
	 * @return true if there are no Elements in Queue; false otherwise
	 */
	public boolean isEmpty()
	{
		return tail == head;
	}
	
	/**
	 * Add an Element onto the end of the Queue
	 * @param anEntry
	 */
	public void enqueue(Element anEntry)
	{
		if(anEntry != null)
		{
			queue[tail] = anEntry;
			tail = (tail + 1) % queue.length;
			counter++;
			
			if(tail == head)
			{
				@SuppressWarnings("unchecked")
				Element[] tempQueue = (Element[]) new Object[queue.length * 2];
				for(int i = 0; i < queue.length; i++)
				{
					int k = (head + i) % queue.length;
					tempQueue[i] = queue[k];
				}
				tail = queue.length;
				head = 0;
				queue = tempQueue;
			}
		}
	}
	
	/**
	 * Throws exception if Queue is empty
	 * @return the first Element in Queue
	 */
	public Element peek() throws IllegalStateException
	{	
		if(this.isEmpty())
		{
			throw new IllegalStateException("The queue is empty.");
		}
		return queue[head];
	}
	
	/**
	 * Removes the first Element in Queue
	 * Throws exception if Queue is empty
	 * @return the Element that was removed
	 */
	public Element dequeue() throws IllegalStateException
	{
		if(this.isEmpty())
		{
			throw new IllegalStateException("The queue is empty.");
		}

		int index = (head + queue.length) % queue.length;
		Element temp = queue[index];
		queue[index] = null;
		head++; 
		counter--;
		if (head == queue.length)
			head = 0;
		return temp;
	}
	
	/**
	 * @return a string representation of the Queue
	 */
	@Override
	public String toString()
	{
		StringBuilder queueString = new StringBuilder("Queue: \n");
		for(int i = 0; i < this.getSize(); i++)
		{
			int index = (head + i) % queue.length;
			queueString.append(queue[index] + "\n");
		}
		return queueString.toString();
	}

	@Override
	public void add(Element item) 
	{
		this.enqueue(item);
		
	}

	@Override
	public Element remove() throws IllegalAccessException 
	{
		return this.dequeue();
	}
	

}
