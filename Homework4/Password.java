/**
  Password.java validates passwords from user input.
  *
  * @author		<Daniel Jordan>
  * @version	<2/20/16>
  */
  
import java.util.Scanner;
public class Password
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String password = " ";
		int position = 0, charCondition = 0, upCondition = 0, lowCondition = 0;
		int speCondition = 0, digCondition = 0; 
		boolean done = false;
		
		while(done == false)
		{
			System.out.print("\n");
			System.out.print("Please enter password : ");
			password = scan.nextLine();
			System.out.print("\n");
			
			if(password.length() >= 8 && password.length() <= 16)
			{
				charCondition++;
			}
			if(password.length() < 8)
			{
				System.out.println("Password must be at least 8 characters. ");
			}
			if(password.length() > 16)
			{
				System.out.println("Password is too long. Limit is 16 characters.");	
			}
		
			if(done == false)
			{
				while(position < password.length())
				{
					char character = password.charAt(position);
			
					if(character >= 'A' && character <= 'Z')
					{
						upCondition++;
					}
					if(character >= 'a' && character <= 'z')
					{
						lowCondition++;
					}
					if(character >= '!' && character <= ')')
					{
						speCondition++;
					}
					if(character >= '0' && character <= '9')
					{
						digCondition++;
					}
					position++;
				}
			}
			
			position = 0;
			
			if(upCondition < 1)	
			{
				System.out.println("You need at least one uppercase character.");
			}
			if(lowCondition < 1)
			{
				System.out.println("You need at least one lowercase character.");
			}
			if(speCondition < 1)
			{
				System.out.println("You need at least one special character.");
			}
			if(digCondition < 1)
			{
				System.out.println("You need at least one digit.");
			}
			if(charCondition > 0 && upCondition > 0 && lowCondition > 0 && digCondition > 0 && speCondition > 0)
			{
				done = true;	
			}
	
		}
		System.out.print("Password good");
	}
}
	

