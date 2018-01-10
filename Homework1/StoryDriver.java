/**
  *StoryDriver.java - takes in input from user and prints out a Wacky Tale
  *
  * @author		<Daniel Jordan>
  * @version	<1/29/16>
  */
import java.util.Scanner;
public class StoryDriver
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String adjective1, time, food, friend, pluralNoun1, verbEndIng1, dessert;
		String city, celebrity, animal, movie, number, pluralNoun2, presentVerb;
		String verbEndIng2, adjective2;
		
		System.out.print("\n");
		System.out.println("Please enter a word to fit each description." + "\n");
		System.out.print("Adjective : ");
		adjective1 = scan.nextLine();
		System.out.print("Time : ");
		time = scan.nextLine();
		System.out.print("Favorite Food (plural) : ");
		food = scan.nextLine();
		System.out.print("Friend : ");
		friend = scan.nextLine();
		System.out.print("Plural Noun : ");
		pluralNoun1 = scan.nextLine();
		System.out.print("Verb ending with -ing : ");
		verbEndIng1 = scan.nextLine();
		System.out.print("Dessert : ");
		dessert = scan.nextLine();
		System.out.print("City : ");
		city = scan.nextLine();
		System.out.print("Celebrity : ");
		celebrity = scan.nextLine();
		System.out.print("Animal (singular) : ");
		animal = scan.nextLine();
		System.out.print("Favorite Movie : ");
		movie = scan.nextLine();
		System.out.print("Number : ");
		number = scan.nextLine();
		System.out.print("Plural Noun : ");
		pluralNoun2 = scan.nextLine();
		System.out.print("Present Tense Verb : ");
		presentVerb = scan.nextLine();
		System.out.print("Verb ending with -ing : ");
		verbEndIng2 = scan.nextLine();
		System.out.print("Adjective : ");
		adjective2 = scan.nextLine();
		
	System.out.print("\n");	
	System.out.print("\n" + "This is going to be the most " + adjective1 + " summer ever."
					+ " I am going to sleep until " + time + "." + " Then I am "
					+ "going to have " + food + " for breakfast.");
	System.out.print("\n");
	System.out.print("\n" + "After breakfast, " + friend + " and I will go to the "
					+ "beach and build sand " + pluralNoun1 + " all morning." +
					" If we get bored, we will go down to the park and go roller "
					+ verbEndIng1 + "." + " For lunch we will have " + dessert +
					" sandwiches.");
	System.out.print("\n" + "Later in the summer, I may take a trip to " + city
					+ " to visit " + celebrity + "." + " Or maybe I will go to "
					+ "camp and learn " + animal + "-back riding. I definitely "
					+ "want to watch " + movie + " " + number + " times.");
	System.out.print("\n");
	System.out.print("\n" + "Last week, my parents were talking about having me "
					+ "clean the " + pluralNoun2 + " out of the garage. They "
					+ "also want me to " + presentVerb + " the lawn every week."
					+ " And I think they said something about " + verbEndIng2 +
					" in the garden. I hope they won't be too " + adjective2 +
					" when they find out I already have plans!");
	System.out.print("\n");
	}
}