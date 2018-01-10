/**
  *Vowel.java takes in string input from the user and makes a new string 
  completely out of the vowels of the previous string
  *
  * @author		<Daniel Jordan>
  * @version	<2/14/16>
  */
import java.util.Scanner;
public class Vowel
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String sentence, vowelSentence = " ";
		int position = 0;
		boolean done = false;
		
		while(done == false)
		{
			System.out.print("\n");
			System.out.println("Welcome to the vowel counter.");
			System.out.print("Enter a sentence or (type Quit to quit) : ");
			sentence = scan.nextLine();	
			
			if(sentence.equalsIgnoreCase("quit"))
			{
				done = true;
			}
			
			if(done == false)
			{
				while(position < sentence.length())
				{
				char character = sentence.charAt(position);
			
				if(character == 'a' || character == 'A')
				{
					vowelSentence = vowelSentence + character;	
				}
			
				if(character == 'e' || character == 'E')
				{
					vowelSentence = vowelSentence + character;	
				}
			
				if(character == 'i' || character == 'I')
				{
					vowelSentence = vowelSentence + character;	
				}
			
				if(character == 'o' || character == 'O')
				{
					vowelSentence = vowelSentence + character;	
				}
			
				if(character == 'u' || character == 'U')
				{
					vowelSentence = vowelSentence + character;	
				}
			
				position++;
				}
			
				int numVowel = vowelSentence.length()-1;
				System.out.println("There are " + numVowel + " vowels in the sentence");
				System.out.println("\"" + sentence + "\"");
				System.out.println("They are: " + vowelSentence);
				vowelSentence = " ";
				position = 0;
				
			}
		}
			System.out.println("Thanks for using the vowel counter");
	
		
	}
	
}