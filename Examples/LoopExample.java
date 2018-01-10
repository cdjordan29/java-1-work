import java.util.Scanner;
public class LoopExample
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int n;
		int sumE = 0;
		int sumO = 0;
		
		System.out.print("input : ");
		n = scan.nextInt();
		
		while (n > 0) 
		{
			if (n % 2 == 0)
				sumE += n;
			else
				sumO += n;
			n = scan.nextInt();
		}
		
		System.out.println(sumE + " " + sumO);
		
	}
	
}