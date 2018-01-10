/**
  *CarCost.java computes the cost of driving a sportscar up the Amalfi coast
  constant values were obtained from GOOGLE
  *
  * @author		<Daniel Jordan>
  * @version	<2/05/16>
  */
import java.util.Scanner;
public class CarCost
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		final double GALLONS_IN_ONE_LITER = 0.264172;
		final double KILO_IN_ONE_MILE = 1.60934;
		
		double exchangeRate, priceGasInLiters, litersBought, kiloDriven;//input variables
		double eurosSpent, dollarsSpent, milesDriven, gallonsBought, totalMPG;//conversion variables
		double priceGasInDollars;
		
		System.out.print("\n");
		System.out.print("What is the current exchange rate to Euro to dollar? : ");
		exchangeRate = scan.nextDouble();
		System.out.print("Enter price of gas per liter (in Euro) : ");
		priceGasInLiters = scan.nextDouble();
		System.out.print("How many liters did you buy for this tank of gas? : ");
		litersBought = scan.nextDouble();
		System.out.print("How many kilometers did you drive on this tank of gas? : ");
		kiloDriven=scan.nextDouble();
		
		eurosSpent = litersBought*priceGasInLiters;//get the total amount of euros spent
		dollarsSpent = eurosSpent*exchangeRate;//convert those into dollars spent
		gallonsBought = litersBought*GALLONS_IN_ONE_LITER;//convert liters bought into gallons
		priceGasInDollars = dollarsSpent/gallonsBought;//get the total price per gallon
		
		milesDriven = kiloDriven/KILO_IN_ONE_MILE;//converting total kilometers driven into miles
		
		totalMPG = milesDriven/gallonsBought;
		
		System.out.print("\n");
		System.out.println("Cost report for driving your European car:");
		System.out.print("\n");
		System.out.println("Price of gas $" + priceGasInDollars + " per gallon.");
		System.out.print("\n");
		System.out.println("You drove " + milesDriven + " miles.");
		System.out.println("on " + gallonsBought + " gallons of gas.");
		System.out.print("\n");
		System.out.println("You got " + totalMPG + " miles per gallon.");
		
		
	}
	
}