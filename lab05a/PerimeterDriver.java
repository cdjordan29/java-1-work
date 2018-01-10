/**
  PerimeterDriver.java prompts user from inputs of height and width of rectangle.
  *
  * @author		<Daniel Jordan>
  * @version	<2/15/16>
  */
  import java.util.Scanner;
  public class PerimeterDriver
  {
  	  public static void main (String[] args)
  	  {
  	  	  Scanner scan = new Scanner(System.in);
  	  	  double height, width;
  		
  	  	  System.out.print("Please enter the height of a rectangle : ");
  	  	  height = scan.nextLine();
  	  	  System.out.print("Please enter the width of a rectangle : ");
  	  	  width = scan.nextLine();
  	  	  
  	  	  Geometry geomObj = new Geometry();
  	  	  
  	  	  double perimRec = geomObj.perimeter(height, width);
  	  	  System.out.println("The perimeter of a rectangle with height "
  	  	  	  				+ height + " and width " + width
  	  	  	  				+ " is " + perimRec);
  	  	
  	  }
  	  
  }