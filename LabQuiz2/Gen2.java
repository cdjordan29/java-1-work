/**
  *Gen2.java lab quiz #2 bonus
  *
  * @author		<Daniel Jordan>
  * @version	<2/17/16>
  */
import java.util.Random;
import java.util.Scanner;
public class Gen2
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		final int RANGE = 100;
		final int TRIALS = 100000;
		
		int num1 = 0, num2 = 0, count1 = 1, count2 = 0;
		double countAverage = 0, average = 0;
		
		num1 = generator.nextInt(RANGE);
		System.out.println("Generated the number: " + num1);
		System.out.println("Running the test 100,000 times:");
		
		while(count1 <= 100000)
		{
			num2 = generator.nextInt(RANGE);
			
			if(num1 == num2)
			{
				count2++;
				countAverage += count1;
			}
			
			count1++;	
		}
		
		average = countAverage / TRIALS;
		
		System.out.println("It took an average of " + average + " times to "
						+ "generate " + num1 + " again.");
		
	}
	
}