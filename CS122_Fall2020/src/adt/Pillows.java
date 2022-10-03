package adt;

public class Pillows {

	public static void main(String[] args) throws StackOperationException 
	{
		
		Stack s = new Stack();
		
		System.out.println(s.isEmpty());
		System.out.println();
		
		System.out.println(s);
		System.out.println();
		
		s.push("Pillow1");
		s.push("Pillow2");
		s.push("Pillow1");
		s.push("Pillow2");
		s.push("Pillow1");
		s.push("Pillow2");
		s.push("Pillow1");
		s.push("Pillow2");
		s.push("Pillow1");
		s.push("Pillow");
		
		System.out.println(s.isEmpty());
		System.out.println();
		
		System.out.println(s);
		System.out.println();
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println();
		
		System.out.println(s.getSize());
		System.out.println();
		
		System.out.println(s.toString());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Stack s2 = new Stack(2);
		
		System.out.println(s2.isEmpty());
		System.out.println();
		
		s2.push("Pillow1");
		s2.push("Pillow2");
		
		System.out.println(s2.isEmpty());
		System.out.println();
		
		System.out.println(s2);
		System.out.println();
		
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.peek());
		System.out.println();
		
		System.out.println(s2.getSize());
		System.out.println();
		
		System.out.println(s2.toString());	
		
		
		
		
		
		
	}

}
