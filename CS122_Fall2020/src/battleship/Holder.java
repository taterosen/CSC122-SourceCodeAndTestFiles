package battleship;

public interface Holder<T>
{
	public void add(T item);
	
	public T remove() throws IllegalAccessException;
	
	public boolean isEmpty();

}
