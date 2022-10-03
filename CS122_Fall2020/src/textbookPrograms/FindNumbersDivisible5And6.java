package textbookPrograms;

/**
 * Chapter 5 Programming Exercise 5.10: Display the
 * 			numbers from 100 to 1000 that are 
 * 			divisible by 5 and 6.
 * @author taterosen
 * Date: 09/06/2020
 */

public class FindNumbersDivisible5And6 
{
	public static void main(String[] args) 
	{
		final int MIN = 100;
		final int MAX = 1000;
		final int ROW_LENGTH = 10;
		final int DIVISOR1 = 5;
		final int DIVISOR2 = 6;
		
		int count = 0;

		for (int i = MIN; i <= MAX; i++)
		{
			if (i % DIVISOR1 == 0 && i % DIVISOR2 == 0)
			{
				if (count % ROW_LENGTH != 0)
				{
					System.out.print(i + " ");
				}
				else
				{
					System.out.println();
				}
				count++;
			}
		}	

	}

}
