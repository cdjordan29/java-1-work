/**
  *Merch.java takes in input from the user and determines what articles of 
  clothing will be selected for purchasing
  *
  * @author		<Daniel Jordan>
  * @version	<2/05/16>
  */
import java.util.Scanner;
public class Merch
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String answer, sizeAnswer, styleAnswer, colorAnswer, sockAnswer, sockStyle;
		int shirtPrice=0, sockPrice=0, totalPrice=0;
		
		
		System.out.print("\n");
		System.out.print("Would you like a Sockrockers T-shirt today? (Y or N) : ");
		answer=scan.next();
		
		if(answer.equalsIgnoreCase("Y"))
		{
			System.out.print("Small, medium, or large? (S, M or L) : ");
			sizeAnswer=scan.next().toUpperCase();
			
			switch(sizeAnswer)
			{
				case "S":
					sizeAnswer="Small";
					break;
				case "M":
					sizeAnswer="Medium";
					break;
				case "L":
					sizeAnswer="Large";
					break;	
			}
			
			System.out.println("There are 4 styles:");
			System.out.println("\t"+"T : tank");
			System.out.println("\t"+"S : short sleeve");
			System.out.println("\t"+"L : long sleeve");
			System.out.println("\t"+"H : hoodie");
			System.out.print("Which style would you like? : ");
			styleAnswer=scan.next().toUpperCase();
			
			switch(styleAnswer)
			{
				case "T":	
					styleAnswer="tank";
					shirtPrice=12;
					break;
				case "S":
					styleAnswer="short-sleeve";
					shirtPrice=15;
					break;
				case "L":
					styleAnswer="long-sleeve";
					shirtPrice=20;
					break;
				case "H":
					styleAnswer="hoodie";
					shirtPrice=22;
					break;
			}
			
			System.out.println("There are 3 colors:");
			System.out.println("\t"+"W : white");
			System.out.println("\t"+"B : black");
			System.out.println("\t"+"O : orange");
			System.out.print("Which color would you like? : ");
			colorAnswer=scan.next().toUpperCase();
			
			switch(colorAnswer)
			{
				case "W":
					colorAnswer="white";
					break;
				case "B":
					colorAnswer="black";
					break;
				case "O":
					colorAnswer="orange";
					break;
			}
			
			System.out.print("Would you like Sockrockers socks today? (Y or N) : ");
			sockAnswer=scan.next();
			
			if(sockAnswer.equalsIgnoreCase("Y"))
			{
				System.out.println("There are three kinds of socks: ");	
				System.out.println("\t"+"C : Children's socks");
				System.out.println("\t"+"W : Adult's white gym socks");
				System.out.println("\t"+"O : Adult's 10th anniversary orange socks");
				System.out.print("Which kind would you like? : ");
				sockStyle=scan.next().toUpperCase();
				
				switch(sockStyle)
				{
					case "C":
						sockStyle="Children's socks";
						sockPrice=6;
						break;
					case "W":
						sockStyle="Adult's socks";
						sockPrice=8;
						break;
					case "O":
						sockStyle="10th anniversary socks";
						sockPrice=10;
						break;
				}
			
				System.out.print("\n");
				System.out.println("Here's your order:");
				totalPrice=shirtPrice+sockPrice;
				System.out.println(sizeAnswer+" "+styleAnswer+" "+colorAnswer+
							" T-shirt for $"+shirtPrice);
				System.out.println(sockStyle+" for $"+sockPrice);
				System.out.println("Your total is $"+totalPrice);
			}
				
			if(sockAnswer.equalsIgnoreCase("N"))
			{
				System.out.print("\n");
				System.out.println("Here's your order:");
				totalPrice=shirtPrice;
				System.out.println(sizeAnswer+" "+styleAnswer+" "+colorAnswer+
							" T-shirt for $"+shirtPrice);
				System.out.println("Your total is $"+totalPrice);
			}
		}
		else
			System.out.print("Thanks for choosing Sockrockers, have a nice day!");
	}
	
}