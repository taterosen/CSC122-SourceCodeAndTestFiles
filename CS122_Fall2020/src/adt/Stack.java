package adt;

/**
 * Simple Stack class
 * @author taterosen & keatonhubbard
 * 09/24/2020
 */

public class Stack 
{
	private static final int DEFAULT_NUMBER_OF_SPACES = 10;
	public static final int ITEMS_PER_ROW = 4;
	
	private String[] myStack;
	int top = 0;
	
	/**
	 * Create a default Stack object with 10 spaces
	 */
	public Stack() 
	{
		this(DEFAULT_NUMBER_OF_SPACES);
	}
	
	/**
	 * Create a Stack object with a given number of spaces
	 * @param n
	 */
	public Stack(int n)
	{
		myStack = new String[n];
	}
	
	/**
	 * Push a given string onto the Stack
	 * Throws an exception if the Stack is full
	 * @param s
	 * @throws StackOperationException 
	 */
	public void push(String s) throws StackOperationException
	{
		if(top == myStack.length)
		{
			throw new StackOperationException("Stack is full.");
		}
		myStack[top] = s;
		top++;
	}
	
	/**
	 * Throws an exception if the Stack is empty
	 * @return the String at the top of the Stack
	 * @throws StackOperationException 
	 */
	public String peek() throws StackOperationException
	{
		if(isEmpty())
		{
			throw new StackOperationException("Stack is empty.");
		}
		return myStack[top - 1];
	}
	
	/**
	 * Removes the String on the top of the Stack
	 * Throws an exception if the Stack is empty
	 * @return the String that was removed
	 * @throws StackOperationException
	 */
	public String pop() throws StackOperationException
	{
		if(isEmpty())
		{
			throw new StackOperationException("Stack is empty.");
		}
		top--;
		String temp = myStack[top];
		myStack[top] = null;
		return temp;
	}
	
	/**
	 * 
	 * @return the current number of Strings in the Stack
	 */
	public int getSize()
	{
		return top;
	}
	
	/**
	 * 
	 * @return true if the Stack is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		return this.getSize() == 0;
	}
	
	/**
	 * Creates a string representation of the Stack
	 */
	@Override
	public String toString()
	{
		String stackString = "A Stack with these Strings: \n";
		if(this.isEmpty())
		{
			stackString += "No Strings in Stack.";
		}
		else
		{
			int count = 0;
			for(int i = this.getSize() - 1; i >= 0; i--)
			{
				if(count < ITEMS_PER_ROW)
				{
					stackString += myStack[i] + ", ";
					count++;
				}
				else
				{
					stackString += myStack[i] + " \n \n";
					count = 0;
				}
			}
		}
		return stackString;
	}
	
}
