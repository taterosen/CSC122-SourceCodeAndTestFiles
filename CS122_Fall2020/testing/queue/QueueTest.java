package queue;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest 
{
	/**
	 * Tests an empty Queue
	 */
	@Test
	void testConstructor() 
	{
		Queue<String> q = new Queue<String>();
		assertTrue(q.isEmpty());
		assertTrue(q.getSize() == 0);
	}
	
	/**
	 * Tests that enqueue for one Queue does
	 * not affect another Queue (i.e. that the
	 * instance variables are not static)
	 */
	@Test
	void testStatic()
	{
		Queue<String> q = new Queue<String>();
		assertTrue(q.isEmpty());
		assertTrue(q.getSize() == 0);
		assertTrue(q.equals(q));
		
		Queue<String> q2 = new Queue<String>();
		assertTrue (q2.isEmpty());
		assertTrue (q2.getSize() == 0);
		
		q2.enqueue("1");   
		q2.enqueue("2");
		
		assertTrue(q.isEmpty());
		assertTrue(q.getSize() == 0);
	}
	
	/**
	 * Tests the enqueue() method in the Queue Class
	 */
	@Test
	void testEnqueue()
	{
		Queue<String> q = new Queue<String>();
		assertTrue(q.getSize() == 0);
		
		q.enqueue("1");
		assertFalse(q.isEmpty());
		assertTrue(q.getSize() == 1);
		
		q.enqueue("2");
		assertTrue(q.getSize() == 2);
		
		//test for adding null
		assertTrue(q.getSize() == 2);
		q.enqueue(null);
		assertTrue(q.getSize() == 2);
		
		System.out.println(q);
	}
	
	/**
	 * Test that Queue expands when a lot
	 * of Elements are enqueued
	 */
	@Test 
	void testEnqueueManyElements()
	{
		Queue<String> q = new Queue<String>();
		for(int i = 0; i < 250; i++)
		{
			q.enqueue("" + i);
		}
		assertTrue(q.getSize() == 250);
		System.out.println(q);
	}
	
	/**
	 * Tests the peek() method in the Queue Class
	 */
	@Test 
	void testPeek() 
	{
		Queue<String> q = new Queue<String>();
		
		assertThrows(IllegalStateException.class,
				() -> q.peek());
		
		q.enqueue("1");
		assertTrue(q.getSize() == 1);
		assertTrue(q.peek() == "1");
		assertTrue(q.getSize() == 1);
		
		q.enqueue("2");
		String s = q.peek();
		assertTrue(s == "1");
		assertFalse(s == "2");
		assertTrue(q.getSize() == 2);
		
	}
	
	/**
	 * Tests the dequeue() method in the Queue Class
	 */
	@Test 
	void testDequeue()
	{
		Queue<String> q = new Queue<String>();
		
		assertThrows(IllegalStateException.class,
				() -> q.dequeue());
		
		q.enqueue("1");
		q.enqueue("2");
		
		assertTrue(q.dequeue() == "1");
		assertTrue(q.dequeue() == "2");
		
		assertTrue(q.isEmpty());
		
		for (int i = 0; i < 100; i++) 
		{
			q.enqueue("Hello");
			assertTrue(q.dequeue() == "Hello");
		}
	}	

}
