/**
  *GeomTest.java this class will test methods in the Geometry class.
  *
  * @author		<Daniel Jordan>
  * @version	<2/15/16>
  */
  import java.util.Scanner;
  public class GeomTest
  {
  	  public static void main (String[] args)
  	  {
  	  	  Scanner scan = new Scanner(System.in);
  	  	  double height, width;
  	  	  
  	  	  System.out.print("Please enter the height of a rectangle : ");
  	  	  height = scan.nextDouble();
  	  	  System.out.print("Please enter the width of a rectangle : ");
  	  	  width = scan.nextDouble();
  	  	  
  	  	  Geometry geomObj = new Geometry();
  	  	  
  	  	  double recArea = geomObj.area(height, width);
  	  	  System.out.println("The area of a rectangle with height " 
  	  	  	  				+ height + " and width " + width 
  	  	  	  				+ " is " + recArea);
  	  	  
  	  	  
  	  }
  	  
  	  
  	  
  	  
  }