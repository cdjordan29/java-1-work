/**
  DensityDriver.java prompts user for inputs to calculate density
  *
  * @author		<Daniel Jordan>
  * @version	<2/15/16>
  */
  import java.util.Scanner;
  public class DensityDriver
  {
  	  public static void main (String[] args)
  	  {
  	  	  Scanner scan = new Scanner(System.in);
  	  	  double mass, length, width, height;
  	  	  
  	  	  System.out.print("Please enter the mass of an object : ");
  	  	  mass = scan.nextDouble();
  	  	  System.out.print("Please enter the length of an object  : ");
  	  	  length = scan.nextDouble();
  	  	  System.out.print("Please enter the width of an object : ");
  	  	  width = scan.nextDouble();
  	  	  System.out.print("Please enter the height of an object : ");
  	  	  height = scan.nextDouble();
  	  	  
  	  	  Geometry geomObj = new Geometry();
  	  	  
  	  	  double density = geomObj.density(mass, length, width, height);
  	  	  System.out.println("The density of an object with mass "
  	  	  	  				+ mass + " length " + length + " width "
  	  	  	  				+ width + " and height " + height 
  	  	  	  				+ " is " + density);
  			
  	  	  
  	  }
  	  
  }