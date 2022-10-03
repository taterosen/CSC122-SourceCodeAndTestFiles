package adt;

/**
 * Class with method to check parenthesis balance
 * @author taterosen & erikaclimo
 * 09/27/2020
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParenChecker 
{
	/**
	 * 
	 * @param s
	 * @return true if the parentheses in a String are balanced; false otherwise
	 */
	public static boolean isBalanced(String s)
	{
		boolean balanced = true;
		Stack checker = new Stack();
		int count = 0;
		String thisChar;
		
		while(count < s.length() && balanced)
		{
			thisChar = Character.toString(s.charAt(count));
			if(thisChar.equals("("))
			{
				try {
					checker.push(thisChar);
				} catch (StackOperationException e) {
					e.printStackTrace();
					balanced = false;
				}
			}
			else if(thisChar.equals(")"))
			{
				try {
					String peek = checker.peek();
					if(!peek.equals("("))
					{
						balanced = false;
					}
					else
					{
						checker.pop();
					}
				} catch (StackOperationException e) {
					e.printStackTrace();
					balanced = false;
				}
			}
			count++;
		}
		if(!checker.isEmpty())
		{
			balanced = false;
		}
		return balanced;
	}
	
	
	public static void main(String[] args) 
	{
		//file input:
		System.out.println("Test file input:");
		
		Scanner sc = null;
		try {
			sc = new Scanner (new File("input.txt"));   // Switch "input.txt" for any desired file
			while(sc.hasNext())
			{
				String line = sc.nextLine();
				System.out.println(isBalanced(line) + "\n"); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println();
		
		// Basic Test Strings:
		System.out.println("Test some basic Strings:");
		
		String s = "(()())";
		System.out.println(isBalanced(s));
		System.out.println();
		
		String s2 = "( (Hello)) )";
		System.out.println(isBalanced(s2));   // Error expected
		System.out.println();
		
		String s3 = "(";
		System.out.println(isBalanced(s3));
		System.out.println();
		
		String s4 = "((())";
		System.out.println(isBalanced(s4));
		System.out.println();
		
		String s5 = "(()(()(()())())())";
		System.out.println(isBalanced(s5));
		System.out.println();
		
		String s6 = "(((()))))";
		System.out.println(isBalanced(s6));   // Error expected
		System.out.println();
		
		String s7 = "( Hello )";
		System.out.println(isBalanced(s7));
		System.out.println();
		
		String s8 = ")";
		System.out.println(isBalanced(s8));   // Error expected
		System.out.println();
	}

}
