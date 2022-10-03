package linkedList;

public class ClassLList <T> implements List<T>
{
	@SuppressWarnings("rawtypes")
	Node head;
	int entries;
	
	public ClassLList()
	{
		head = null;
		entries = 0;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void add(int pos, T item)
	{
		if(item != null) 
		{
			if(head == null || pos <= 0)  
				head = new Node(item, head);
			else rAdd(item, pos - 1, head);          //uses recursive add
			/*else                                   //Non recursive add
			{
				Node nxt = head;
				int i = 1;
				while(nxt.next != null && i != pos)
				{
					nxt = nxt.next;
					i++;
				}
				Node n = new Node(item, nxt.next);
				nxt.next = n;
			}*/
			entries++;	
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void rAdd(T item, int pos, Node ptr)
	{
		if(ptr.next == null || pos == 0)
			ptr.next = new Node(item, ptr.next);
		else if(pos < 0)
			rAdd(item, pos - 1, ptr.next);
	}
	
	@Override
	public void add(T item) 
	{
		add(entries, item);
	}
	
	public int find(T item)
	{
		return rFind(item, head, 0);
	}
	
	@SuppressWarnings("rawtypes")
	private int rFind(T item, Node ptr, int pos)
	{
		if(ptr == null) return -1;
		if(ptr.data.equals(item)) return pos;
		return rFind(item, ptr.next, pos + 1);
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int pos) 								//uses recursive remove
	{
		T value = null;
		if(head == null) return value;
		if(pos <= 0 || entries == 1)
			value = (T) head.data;
			head = head.next;
		value = rRemove(pos,head);
		entries--;
		return value;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private T rRemove(int pos, Node ptr)
	{
		T value = null;
		if(ptr.next == null || pos <= 0)
		{
			value = (T) ptr.data;
			ptr = ptr.next;
			return value;
		}
		else return rRemove(pos - 1, ptr.next);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings({ "rawtypes", "hiding" })
	private class Node <T>
	{
		T data;
		Node next;
		Node(T data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}


}
