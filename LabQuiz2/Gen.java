/**
  *Gen.java lab quiz #2
  *
  * @author		<Daniel Jordan>
  * @version	<2/17/16>
  */
import java.util.Random;
import java.util.Scanner;
public class Gen
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		final int RANGE = 100;
		int num1, num2 = 0, count = 0;
		boolean done = false;
		
		
		num1 = generator.nextInt(RANGE);
		System.out.println("Generated the number: " + num1);
		
		while(done == false)
		{
			num2 = generator.nextInt(RANGE);
			
			count++;
			
			if(num1 == num2)
			{
				done = true;	
			}
			
		}
		
		System.out.println("Generated that number again in " + count + " times.");
	}
	
	
}