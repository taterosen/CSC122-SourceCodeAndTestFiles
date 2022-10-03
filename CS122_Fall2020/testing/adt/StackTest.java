package adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest 
{

	@Test
	void testDefaultConstructor() 
	{
		Stack s = new Stack();
		//assertTrue()
		
		
	}
	
	@Test
	void testPush() throws StackOperationException
	{
		Stack s = new Stack();
		s.push("Hello");
		assertTrue(s.getSize() == 1);
		assertTrue(s.peek() == "Hello");
		
	}
	
	@Test
	void testPeek() throws StackOperationException
	{
		Stack s = new Stack();
		
		s.push("Hello");
	}

}
