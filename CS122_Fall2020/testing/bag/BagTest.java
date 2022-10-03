package bag;

/**
 * JUnit Test class for the Bag class
 * @author taterosen
 * 09/17/2020
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BagTest {

	@Test
	void testBasic() {
		Bag<Item> b = new Bag<Item>();
		assertTrue (b.isEmpty());
		assertTrue (b.getCurrentSize() == 0);
		assertTrue (b.equals(b));
	}
	
	
	@Test
	void testAddingItem() {
		Bag<Item> b = new Bag<Item>();
		Jar glassJar = new Jar(true);
		Box box = new Box(400,5);
		
		b.add(glassJar);
		assertFalse (b.isEmpty());

		assertTrue (b.getCurrentSize() == 1);
		b.add(box);
		assertTrue (b.getCurrentSize() == 2);
		
		//after implementing, remove the comments from the lines below
		assertTrue (b.contains(glassJar));
		assertTrue (b.contains(box));    //contains exact match
		Box box1 = new Box(400,5);         //duplicate, but separate object
		assertTrue (b.contains(box1));
		
		Box box2 = new Box(600,12);        //different box attributes
		assertFalse (b.contains(box2));  
		
		b.add(null);    //unspecified action, but shouldn't do anything
	}
	
	@Test
	/**
	 * test remove items for consistency
	 */
	void testRemoveItem() {
		Jar glassJar = new Jar(true);
		Box box = new Box(400,5);
		Box box2 = new Box(600,10);
		
		Bag<Item> b = new Bag<Item>();
		Item temp = b.remove();
		assertTrue (temp == null);
		
		b.add(glassJar);
		b.add(box);
		b.add(box2);
		assertTrue  (b.remove(box));  //box should exist, so remove it
		assertFalse (b.remove(box)); //box NOW should NOT exist
		
		assertTrue (b.remove(glassJar)); // should exist, so remove it
		assertTrue (b.remove(box2));  // should exist, so remove it
		
		assertTrue (b.isEmpty());
		
		assertFalse (b.remove(null));   //this removal should return false
	}
	
	@Test
	void testRemoveAnyItem()
	{
		Box box = new Box(400,5);
		Jar glassJar = new Jar(true);
		Bag<Item> b = new Bag<Item>();
		
		Item temp = b.remove();
		assertTrue(temp == null);
		
		b.add(glassJar);
		Item removed = b.remove();
		assertTrue(removed.equals(glassJar));
		assertFalse(b.contains(glassJar));
		
		for(int i = 0; i < 50; i++)
		{
			b.add(box);
			removed = b.remove();
			assertTrue(removed.equals(box));
			assertFalse(b.contains(box));
		}
	}
	
	@Test
	/**
	 * test many items
	 */
	void testManyItem() {
		Box box1 = new Box(400,5);
		
		Bag<Item> b = new Bag<Item>();
		for (int i=0; i<50; i++) {
			b.add(box1);
		}
		assertFalse (b.isEmpty());
		
		int maxSize = b.getCurrentSize();
//after implementing, remove the comments from the lines below
		int count = b.getFrequencyOf (box1);
		assertTrue (count == maxSize);
		
		for (int i=0; i<maxSize; i++) {
			b.remove();
		}
		assertTrue (b.isEmpty());
	}

}