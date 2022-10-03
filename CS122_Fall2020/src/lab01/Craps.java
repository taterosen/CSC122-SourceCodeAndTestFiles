package lab01;

/**
 *  Game of craps - although, honestly, I don't know how to play
 * @author bcatron
 * Date: August, 2020
 */
public class Craps 
{

	public static void main(String[] args) 
	{
		Die d1 = new Die();
		Die d2 = new Die(6);

		//Roll twice and see the results
		d1.roll();
		System.out.println ("Dice 1 is:" + d1.getValue());

		d2.roll();
		System.out.println ("Dice 2 is:" + d2.getValue());

		if (d1.getValue() + d2.getValue() == 7) {
			System.out.println ("Craps! You win");
		}

		System.out.println (d1);
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashcode());

	}

}