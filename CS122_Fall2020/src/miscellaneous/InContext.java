package miscellaneous;

 /** 
*  Write a program InContext that will find the location of
*  a given word in a phrase and print the 
*  letter before and the letter after.  
5 *  If the word is at the very front or very end of the phrase, 
6 *   treat as a space before or after
7 *  This should be case-insensitive
8 *
9 *  You may use only these methods from the String class: 
10 *    substring, indexOf, toUpperCase, toLowerCase, trim, length, charAt
11 * 
12 *  Read data from a data file incontext.dat
13 *  The first line is the number of lines
14 *  Each line is a single word followed by a phrase with multiple words
15 *
16 *  input file
17 *
 5
 cat  I can't catch cats
 no   Let it snow
 now  Let it snow
 no   nothing
 day  I love Gump Day
 
 *
26 *  output 
27 *   c
28 *  sw
29 *  s 
30 *   t
31 *     //space before and after!
32 *
33 */
 import java.util.Scanner;
 import java.io.File;
import java.io.FileNotFoundException;
 public class InContext
 {
    public static void main(String[] args) throws FileNotFoundException{
       Scanner urface = new Scanner(new File("incontext.dat"));
       int numLines = urface.nextInt();
       urface.nextLine();
       for (int i=0; i<numLines; i++){
          String word = urface.next();								
          String line = urface.nextLine().trim().toLowerCase();		
          
          int pos = line.indexOf(word);
          String first = " ";
          String last = " ";
          
          if(line.indexOf(line.charAt(pos)) != 0)
        	  first = line.substring(pos-1, pos);
          
          if(line.indexOf(line.charAt(pos)) + word.length() != line.length())
        	  last = line.substring(pos + word.length(), pos + word.length() + 1);
          
          System.out.println(first + last);
       }
    }
 }