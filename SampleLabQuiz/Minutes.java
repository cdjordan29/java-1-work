/**
  *Minutes.java - takes in mintue input from the user and displays it in 
  				increments of days, hours and minutes.
  *
  * @author		<Daniel Jordan>
  * @version	<2/01/16>
  */
 import java.util.Scanner;
public class Minutes
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int min1, min2, minTotal, minDisplay;
		int dayOut, hourOut, minOut;
		
		System.out.print("\n");
		System.out.print("Please enter a time in minutes: ");
		min1 = scan.nextInt();
		System.out.print("Please enter another time in minutes: ");
		min2 = scan.nextInt();
		
		minTotal = min1 + min2;
		minDisplay = minTotal;
		
		dayOut = minTotal / 1440;
		minTotal = minTotal - (dayOut * 1440);
		hourOut = minTotal / 60;
		minOut = minTotal - (hourOut * 60);
		
		
		System.out.print(min1 + " minutes plus " + min2 + " is " + minDisplay +
						" minutes." + "\n" + "which is " + dayOut + " days, "
						+ hourOut + " hours " +
						"and " + minOut + " minutes.");
		
		
	}
	
	
	
}