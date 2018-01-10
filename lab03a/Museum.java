/**
  *Museum.java takes in input from the user and decides what to charge them 
  for entry to the museum
  *
  * @author		<Daniel Jordan>
  * @version	<2/3/16>
  */
import java.util.Scanner;
public class Museum
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String answer, becomeMember;
		int age;
		final int memberFeeNoID = 75;
		final int memberFeeYesID = 40;
		final int adult = 20;
		final int senior = 18;
		final int student = 14;
		final int child = 0;
		
	
		System.out.print("\n");
		System.out.println("Welcome to the Radford Museum of Fine Art!");
		System.out.print("Are you a member? (Y or N) : ");
		answer = scan.next();
		
		if(answer.equalsIgnoreCase("Y"))
		{
			System.out.print("Enjoy your day at the Radford Museum of Fine Art!");
		}
		else
		{	
			System.out.print("Would you like to become a member today? (Y or N) : ");
		
			becomeMember = scan.next();
		
			if(becomeMember.equalsIgnoreCase("Y"))
			{
				System.out.print("Are you a student (with a valid ID)? (Y or N) : ");
				answer = scan.next();
			
				if(answer.equalsIgnoreCase("Y"))
				{
					System.out.print("Your admission today will be $"+memberFeeYesID
									+", good for a whole year.");
				}
				else
					System.out.print("Your admission today will be $"+memberFeeNoID
									+", good for a whole year.");
			}
		
			if(becomeMember.equalsIgnoreCase("N"))
			{
				System.out.print("Are you a student (with a valid ID)? (Y or N) : ");
				answer = scan.next();
				
				if(answer.equalsIgnoreCase("Y"))
				{
					System.out.println("Your admission today will be $"+student+".");
					System.out.println("Enjoy your day at the Radford Museum of " +
										"Fine Art!");
				}
				else
				{
					
					System.out.print("What is your age? : ");
					age = scan.nextInt();
				
					if(age <= 12)
					{
						System.out.println("Your admission today will be $"+child+".");
						System.out.println("Enjoy your day at the Radford Museum of " +
											"Fine Art!");
					}
					if(age > 12 && age < 65)
					{
						System.out.println("Your admission today will be $"+adult+".");
						System.out.println("Enjoy your day at the Radford Museum of " +
											"Fine Art!");
					}	
					if(age >= 65)
					{
						System.out.println("Your admission today will be $"+senior+".");
						System.out.println("Enjoy your day at the Radford Museum of " +
											"Fine Art!");
					}
				}
			}
		}
	}
}