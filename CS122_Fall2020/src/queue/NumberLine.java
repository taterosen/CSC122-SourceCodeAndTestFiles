package queue;

public class NumberLine {

	public static void main(String[] args) 
	{
		Queue<String> line = new Queue<String>();
		
		System.out.println(line.isEmpty());
		System.out.println(line.getSize());
		System.out.println(line);
		System.out.println();
		
		line.enqueue("1");
		line.enqueue("2");
		
		System.out.println(line.isEmpty());
		System.out.println(line.getSize());
		System.out.println(line);
		System.out.println();
		
		System.out.println(line.peek());
		System.out.println(line.dequeue());
		System.out.println(line.peek());
		System.out.println(line.dequeue());
		System.out.println();
		
		for(int i = 0; i < 50; i++)
		{
			line.enqueue("" + i);
		}
		
		System.out.println(line.isEmpty());
		System.out.println(line.getSize());
		System.out.println(line);
		
		

	}

}
