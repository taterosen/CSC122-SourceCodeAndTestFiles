package linkedList;

public class LListMain 
{
	public static void main(String[] args) 
	{
		LList<Integer> list = new LList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(2,3);
		
		list.remove(900);
		//list.remove(-3);
		//list.remove(300);
		
		System.out.println(list);
		System.out.println(list.get(-1000));
		System.out.println(list.get(1));
		System.out.println(list.get(30));
		System.out.println(list.remove(-200));
		System.out.println(list.remove(-200));
		
		System.out.println(list);
		
		//LList<Integer> list2 = new LList<Integer>();
		//System.out.println(list2.remove(0));
		
		
		/*List<String> myList = new LList<String>();
		assertTrue (myList.size() == 0);
		myList.clear();
		assertTrue (myList.size() == 0);
			
		for (int i=0; i<10; i++) {
			myList.add(" "+i);
		}
		
		String ts = myList.toString();
		System.out.println(ts);*/

	}

}
