/**
  *Count.java - outputs numbers based on the range given by the user
  *
  * @author		<Daniel Jordan>
  * @version	<2/10/16>
  */

import java.util.Scanner;
public class Count
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, numSave1, numSave2, sum = 0;
		
		System.out.print("Enter a starting number: ");
		num1 = scan.nextInt();
		numSave1 = num1;
		System.out.print("Enter an ending number: ");
		num2 = scan.nextInt();
		numSave2 = num2;
		System.out.print("\n");
			
		if(numSave1 == numSave2)
		{
			sum += num1;
			System.out.print("The sum of the numbers from "	+ numSave1 + " to " + numSave2
							+ " is " + sum);
		}
		
		if(numSave1 < numSave2)
		{
			while(num1 <= num2)
			{
				System.out.println(num1);
				sum += num1;
				num1++;	
			}
			
			System.out.print("The sum of the numbers from " + numSave1 + " to " + numSave2 
							+ " is " + sum);
		}
		
		if(numSave1 > numSave2)
		{
			while(num1 >= num2)
			{
				System.out.println(num1);
				sum += num1;
				num1--;
			}
			
			System.out.print("The sum of the numbers from " + numSave1 + " to " + numSave2 
							+ " is " + sum);
		}
		
		
	}
}