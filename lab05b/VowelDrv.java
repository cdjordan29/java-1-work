/**
  VowelDrv.java uses the VowelSrv service class to breakdown vowels from 
  sentences.
  *
  * @author		<Daniel Jordan>
  * @version	<2/20/16>
  */
  
import java.util.Scanner;
public class VowelDrv
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String s, vowelSentence;
		int vowelLength;
		
		System.out.print("Please enter a word/ sentence : ");
		s = scan.nextLine();
		
		VowelSrv vowelObj = new VowelSrv();
		
		vowelLength = vowelObj.vowelCount(s);
		vowelSentence = vowelObj.vowelString(s);
		
		if(vowelSentence == "not listed")
		{
			System.out.print("You did not enter a word. Please try again.");	
		}
		else
		{
			System.out.println("You entered the word " + s + " it contains "
						+ vowelLength + " vowel(s) which are " + vowelSentence);
		}
	}
	
}