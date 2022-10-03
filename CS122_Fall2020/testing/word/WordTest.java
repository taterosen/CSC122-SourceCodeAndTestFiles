package word;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test suite for Word syllable count program
 * and debugging lab
 * @author taterosen & claytoncoulter
 * Fall 2019
 */
public class WordTest {

	/**
	 * Method to test monosyllabic words.
	 */
	@Test
	public void testOneSyllable() {
		Word w = new Word("Cat");
		int count = w.countSyllables();
		assertTrue ("Cat :", count == 1 );
		
		w = new Word("Ape");
		count = w.countSyllables();
		assertTrue ("Ape :", count == 1 );
	}
	
	/**
	 * Method to test two syllable words.
	 */
	@Test
	public void testTwoSyllables() {
		Word w = new Word("Human");
		int count = w.countSyllables();
		assertTrue ("Human :" + count, count == 2 );
		
		Word w2 = new Word("Bookish");
		int count2 = w2.countSyllables();
		assertTrue ("Bookish :" + count2, count2 == 2 );
		
		Word w3 = new Word("Crouton");
		int count3 = w3.countSyllables();
		assertTrue ("Crouton :" + count3, count3 == 2 );
		
		//Fails because Word class computes "ea" as one syllable
		Word w4 = new Word("React");
		int count4 = w4.countSyllables();
		assertTrue ("React :" + count4, count4 == 2 );
		
	}
	
	/**
	 * Method to test three words.
	 */
	@Test
	public void testThreeSyllable() {
		Word w = new Word("Regular");
		int count = w.countSyllables();
		//Fails because Word class computes "oa" as one syllable
		assertTrue ("Regular :", count == 3 ); 
		
		Word w2 = new Word("Croatia");
		int count2 = w2.countSyllables();
		//Fails because Word class computes "oa" as one syllable
		assertTrue ("Croatia :", count2 == 3 );  
		
		Word w3 = new Word("Hawaii");
		int count3 = w3.countSyllables();
		//Fails because Word class computes "aii" as one syllable
		assertTrue ("Hawaii :", count3 == 3 );  
		
	}
	
	/**
	 * Method to test challenging words.
	 */
	@Test 
	public void difficultWord()
	{
		//Fails because Word class computes "ia" as one syllable
		Word w = new Word("Supercalifragilisticexpialidocious");
		int count = w.countSyllables();
		//Fails because Word class sees "oa" as one syllable
		assertTrue ("Supercalifragilisticexpialidocious :", count == 14 ); 
		
		Word w2 = new Word("Handkerchief");
		int count2 = w2.countSyllables();
		assertTrue ("Handkerchief :", count2 == 3 ); 
		
		
	}

}