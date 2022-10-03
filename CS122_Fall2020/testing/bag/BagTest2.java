package bag;

/*import bag.Item;
import bag.Box;
import bag.Can;
import bag.Jar;*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BagTest2 {

	/*
	 * Simplest test of an empty bag
	 */
	@Test
	void testBasic() {
		Bag<Item> b = new Bag<Item>();
		assertTrue (b.isEmpty());
		assertTrue (b.getCurrentSize() == 0);
	}
	
	/*
	 * adding to one bag should not impact any other bag objects
	 * This would fail if the instance variables were wrongly made 'static'
	 *  ( if static, these values are shared by all objects of type Bag  )
	 */
	@Test
	void testDoubleBagStatic() {
		Bag<Item> b = new Bag<Item>();
		assertTrue (b.isEmpty());
		assertTrue (b.getCurrentSize() == 0);
		assertTrue (b.equals(b));
		
		Bag<Item> another = new Bag<Item>();
		assertTrue (another.isEmpty());
		assertTrue (another.getCurrentSize() == 0);
		
		another.add(new Box(440,5));   
		another.add(new Jar(true));
		
		assertTrue (b.isEmpty());
		assertTrue (b.getCurrentSize() == 0);
		
	}
	
	/*
	 * Adding items should change isEmpty, getCurrentSize, and contains
	 */
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
		
		//add null item - does this cause issues?
		assertTrue (b.getCurrentSize() == 2);
		b.add(null);    //unspecified action, but shouldn't do anything
		assertTrue (b.getCurrentSize() == 2);
		assertTrue (b.contains(box));
		
		System.out.println (b);  //non binding toString check
	}
	
	/*
	 * adding lots of items will test auto-resizing, getFrequencyOf and getCurrentSize
	 */
	@Test
	void testAddingMany() {
		Bag<Item> b = new Bag<Item>();
		//add too many items - to force multiple resize conditions
		for (int i=0; i<200; i++) {
			b.add(new Box(100,22));
		}
		assertTrue (b.getCurrentSize() == 200);
		
		Box box = new Box(100,22);
		assertTrue (b.getFrequencyOf(box)==200);
		
	}

	@Test
	/*
	 * test remove items to determine if they match what was put in
	 * Note: each Item, Jar, Box, and Can has its own equals method
	 */
	void testRemoveAnyItem() {
		Jar glassJar = new Jar(true);
		Box box = new Box(400,5);
		
		Bag<Item> b = new Bag<Item>();
		Item temp = b.remove();
		assertTrue (temp == null);
		
		b.add(glassJar);
		Item removed = b.remove();
		assertTrue (removed.equals(glassJar));
		assertFalse (b.contains(glassJar));
		
		//repeat the test several times
		for (int i=0; i<50; i++) {
			b.add(box);
			removed = b.remove();
			assertTrue(removed.equals(box));
			assertFalse(b.contains(box));
		}
	}

	
	@Test
	/*
	 * test remove specific items and confirm they match what was put in
	 */
	void testRemoveItem() throws Exception {
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
	/*
	 * test many adds, followed by the same number of removes
	 */
	void testManyItem() {
		Box box1 = new Box(400,5);
		
		Bag<Item> b = new Bag<Item>();
		for (int i=0; i<50; i++) {
			b.add(box1);
		}
		assertFalse (b.isEmpty());
		
		int maxSize = b.getCurrentSize();
		int count = b.getFrequencyOf (box1);
		assertTrue (count == maxSize);
		
		for (int i=0; i<maxSize; i++) {
			b.remove();
		}
		assertTrue (b.isEmpty());
	}

	@Test
	void xtraNullTesting () {
		Bag<Item> b = new Bag<Item>();
		b.contains(null);
		b.getFrequencyOf(null);
		b.add(null);
		assertTrue(b.getCurrentSize()==0);
		b.add(new Box(300,2));
		b.remove(null);
		assertTrue(b.getCurrentSize()==1);
	}
}