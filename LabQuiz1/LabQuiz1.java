/**
  *LabQuiz1.java - makes a guessing game
  *
  * @author		<Daniel Jordan>
  * @version	<2/8/16>
  */

import java.util.Random;
import java.util.Scanner;
public class LabQuiz1
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		final int MAX=5;
		final int MIN=9;
		int num1;
		int num2;
		int guess;
		
		System.out.println("Generating a number between [9,13]");
		num1 = generator.nextInt(MAX) + MIN; 
		
		if(num1 % 2 != 0)
		{
			System.out.print("Please guess a number in the range [9,13] : ");
			guess = scan.nextInt();
			
			if(guess > num1)
			{
				System.out.println("Your guess was too high, the number was "+num1);	
			}
			if(guess < num1)
			{
				System.out.println("Your guess was too low, the number was " +num1);
			}
			if(guess == num1)
			{
				System.out.println("You guessed correctly: the number was "+num1);	
			}
		}
		
		if(num1 % 2 == 0)
		{
			num2 = generator.nextInt(MAX) + MIN;
			
			System.out.println("The first random number, " + num1 + ", is even." +
							" The second random number is " + num2 + ".");
			
			if(num2 == num1)
			{
				System.out.println("The two numbers are the same!");
			}
			if(num1 > num2)
			{
				System.out.println("The first number is greater than the second.");	
			}
			if(num1 < num2)
			{
				System.out.println("The second number is greater than the first.");	
			}
		}
	}
	
	
}