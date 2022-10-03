package bag;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordReader {

	public static void main(String[] args) 
	{
		//file input:
		Set<String> s = new Set<String>();
		Scanner sc = null;
		try {
			sc = new Scanner (new File("CollectionOfWords.txt"));   // Switch "input.txt" for any desired file
			while(sc.hasNext())
			{
				String line = sc.next();
				if(line.length() > 3)
				{
					s.add(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		System.out.println("Questions:");
		System.out.println();
		
		System.out.println("1.What is the number of unique tokens found?");
		System.out.println(s.getCurrentSize());
		System.out.println();
		
		System.out.println("2.Does the word \"foreign\" exist in the text?");
		System.out.println(s.contains("foreign"));
		System.out.println("What about \"safety\"?");
		System.out.println(s.contains("safety"));
		System.out.println();
		
		System.out.println("\"afternoon\"?");
		System.out.println(s.contains("afternoon"));
		System.out.println();
		
		System.out.println("\"gumbo\"?");
		System.out.println(s.contains("gumbo"));
		System.out.println();

		System.out.println("Asking for the frequency of a word should produce an error:");
		System.out.println(s.getFrequencyOf("When"));

	}

}
