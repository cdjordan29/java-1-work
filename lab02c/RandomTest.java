/**
  *RandomTest.java - takes in a range input from the user and generates 
  					 20 random numbers from the range
  *
  * @author		<Daniel Jordan>
  * @version	<1/29/16>
  */

import java.util.Random;
import java.util.Scanner;
public class RandomTest
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int min, max, num1;
		int num2, num3, num4, num5, num6, num7, num8, num9, num10;
		int num11, num12, num13, num14, num15, num16, num17, num18, num19, num20;
		
		
		System.out.print("\n");
		System.out.print("Please enter a minimum number: ");
		min = scan.nextInt();
		System.out.print("Please enter a maximum number: ");
		max = scan.nextInt();
		
		System.out.println("Generating 20 numbers in the range [" +
							min + "," + max + "]");
		num1 = generator.nextInt(max) + min;
		num2 = generator.nextInt(max) + min;
		num3 = generator.nextInt(max) + min;
		num4 = generator.nextInt(max) + min;
		num5 = generator.nextInt(max) + min;
		num6 = generator.nextInt(max) + min;
		num7 = generator.nextInt(max) + min;
		num8 = generator.nextInt(max) + min;
		num9 = generator.nextInt(max) + min;
		num10 = generator.nextInt(max) + min;
		num11 = generator.nextInt(max) + min;
		num12 = generator.nextInt(max) + min;
		num13 = generator.nextInt(max) + min;
		num14 = generator.nextInt(max) + min;
		num15 = generator.nextInt(max) + min;
		num16 = generator.nextInt(max) + min;
		num17 = generator.nextInt(max) + min;
		num18 = generator.nextInt(max) + min;
		num19 = generator.nextInt(max) + min;
		num20 = generator.nextInt(max) + min;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		System.out.println(num11);
		System.out.println(num12);
		System.out.println(num13);
		System.out.println(num14);
		System.out.println(num15);
		System.out.println(num16);
		System.out.println(num17);
		System.out.println(num18);
		System.out.println(num19);
		System.out.println(num20);
		
		
	}
	
	
	
	
	
}