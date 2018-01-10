/**************************************************
/
/   Daniel Jordan
/	3/16/16
/
**************************************************/
public class HW5Srv 
{

//
//  takes an int array and formats it nicely as a String
//
	public String makeString(int[] arr) 
	{
		String word = "";
		
		for(int i = 0; i < arr.length; i++)
		{
			word = word + arr[i] + ", ";	
		}
		
		return word;
	}

//
//  takes a char array and formats it nicely as a String
//
	public String makeString(char[] arr) 
	{
		String word = "";
		
		for(int i = 0; i < arr.length; i++)
		{
			word = word + arr[i] + ", ";	
		}
		
		return word;
	}

//
//  takes a String and encodes each character in it as an int
//  and returns the int array
//
	public int[] encode(String str) 
	{
		int[] stringToNums = new int [str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			stringToNums[i] = str.charAt(i);	
		}
		
		return stringToNums;
	}

//
//  undoes what encode does - takes the encoded int array and returns a String 
//
	public String decode(int[] arr) 
	{
		String stringSoFar = "";
		String letter;
		
		for(int i = 0; i < arr.length; i++)
		{
			stringSoFar += (char)arr[i];	
		}
		
		return stringSoFar;
	}

//
//  takes an array of boolean and an array of char, which are the same length
//  returns an array that contains every char that is in the same position 
//  as every true boolean in the mask array
//
	public char[] filter(boolean[] mask, char[] message) 
	{
		int count = 0;
		int countSub = 0;
		
		for(int i = 0; i < mask.length; i++)
		{
			if(mask[i] == true)
			{
				count++;
			}
		}
		
		char[] trueLetters = new char [count];
		
		for(int i = 0; i < mask.length; i++)
		{
			
			if(mask[i] == true)
			{
				trueLetters[countSub] = message[i];
				countSub++;
			}
		}

		return trueLetters;
	}

//
//  takes an array of ints, msg, and array of chars, letters 
//  each int in the msg array is the position of a character in the letters array
//  returns a String of all those letters
//
	public String indexMessage(int[] msg, char[] letters) 
	{
		String stringSoFar = "";
		int count = 0;
		
		for(int i = 0; i < msg.length; i++)
		{
			count = msg[i];
			stringSoFar += letters[count];
		}
		
		return stringSoFar;
	}

//
//  takes an array of Strings, words
//  returns a String which consists of the first letter of every word in words that 
//  is longer than 3 letters, in order, and the return String is all caps
//
	public String acronymize(String[] words) 
	{
		String examine = "";
		String stringSoFar = "";
		
		for(int i = 0; i < words.length; i++)
		{
			examine = words[i];
			
			if(examine.length() > 3)
			{
				stringSoFar += examine.charAt(0);
			}
		}
		
		return stringSoFar.toUpperCase();
	}

//
//  takes a String, and returns an array of ints that represent a count of the 
//  occurences of each letter in the text.  the count of all as (both upper and 
//  lowercase) will be stored in the 0th postion of the returned array.
//
	public int[] letterCount(String text) 
	{
		int[] lettersInNums = new int [26];
		int letterValue = 0;
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
			{
				letterValue = (int)text.charAt(i) - 'a';	
				lettersInNums[letterValue]++;
			}
		}

		return lettersInNums;
	}

//
//  takes an array of lettercounts like the one returned by the above method
//  returns the letter with the highest count.  This method always returns a lowercase char.
//  In case of tie, it returns first letter with that count (closest to 'a').
//
	public char highestLetterCount(int[] letterCount) 
	{
		int maxNum = 0;
		int index = 0;
		char maxChar;
		
		for(int i = 0; i < letterCount.length; i++)
		{
			if(letterCount[i] > maxNum)
			{
				maxNum = letterCount[i];
				index = i;
			}
		}
		
		maxChar = (char)(index + 'a');
		
		return maxChar;
	}
	
}
