/**
  *Money.java - prints correct bill amounts for total monitary values
  *
  * @author		<Daniel Jordan>
  * @version	<1/25/16>
  */
public class Money
{
	public static void main (String[] args)
	{
		int totalDollars = 57;
		int totalCents = 49;
		
		int twentyDollars = 20;
		int tenDollars = 10;
		int fiveDollars = 5;
		int oneDollars = 1;
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		twentyDollars = totalDollars / twentyDollars;
		totalDollars = totalDollars - (twentyDollars * 20);
		tenDollars = totalDollars / tenDollars;
		totalDollars = totalDollars - (tenDollars * 10);
		fiveDollars = totalDollars / fiveDollars;
		totalDollars = totalDollars - (fiveDollars * 5);
		oneDollars = totalDollars / oneDollars;
		totalDollars = totalDollars - (oneDollars * 1);
		
		quarter = totalCents / quarter;
		totalCents = totalCents - (quarter * 25);
		dime = totalCents / dime;
		totalCents = totalCents - (dime * 10);
		nickel = totalCents / nickel;
		totalCents = totalCents - (nickel * 5);
		penny = totalCents / penny;
		totalCents = totalCents - (penny * 1);
		
		System.out.println(" ");
		System.out.println("57 dollars and 49 cents is:");
		System.out.println("\t" + twentyDollars + " twenty dollar bills");
		System.out.println("\t" + tenDollars + " ten dollar bills");
		System.out.println("\t" + fiveDollars + " five dollar bills");
		System.out.println("\t" + oneDollars + " one dollar bills");
		System.out.println("\t" + quarter + " quarters");
		System.out.println("\t" + dime + " dimes");
		System.out.println("\t" + nickel + " nickels");
		System.out.println("\t" + penny + " pennies");
		
		
	}
	
	
	
	
	
	
}