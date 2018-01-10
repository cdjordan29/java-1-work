/**
  *BloodPressure.java takes in input from the user to determine various categories
  of blood pressure.
  *
  * @author		<Daniel Jordan>
  * @version	<2/14/16>
  */
import java.util.Scanner;
public class BloodPressure
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sys, dia;
		String reading = " ";
		
		System.out.print("Please enter Systolic: ");
		sys = scan.nextInt();
		System.out.print("Please enter Diastolic: ");
		dia = scan.nextInt();
		
		if((sys < 90) || (dia < 60))
		{
			reading = "Low";	
		}
		if((sys >= 90 && sys <= 120) && (dia >= 60 && dia <= 80))
		{
			reading = "Normal blood pressure";	
		}
		if((sys > 120 && sys < 140) || (dia > 80 && dia < 90))
		{
			reading = "Prehypertension";	
		}
		if((sys >= 140 && sys < 160) || (dia >= 90 && dia < 100))
		{
			reading = "Stage 1 hypertension";	
		}
		if((sys >= 160) || (dia >= 100))
		{
			reading = "Stage 2 hypertension";
		}
		if((sys >= 300) || (dia >= 300))
		{
			reading = "Error";
		}
		if((sys < 0) || (dia < 0))
		{
			reading = "Error";	
		}
		
		System.out.print("Your Blood Pressure reading of " + sys + "/" + dia
						+ " : " + reading);
		
		
	}
	
}