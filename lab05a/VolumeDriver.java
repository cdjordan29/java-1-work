/**
  VolumeDriver.java prompts user for inputs to calculate volume
  *
  * @author		<Daniel Jordan>
  * @version	<2/15/16>
  */
  import java.util.Scanner;
  public class VolumeDriver
  {
  	  public static void main (String[] args)
  	  {
  	  	  Scanner scan = new Scanner(System.in);
  	  	  double length, width, height;
  	  	  
  	  	  System.out.print("Please enter the length of a rectangle : ");
  	  	  length = scan.nextDouble();
  	  	  System.out.print("Please enter the width of a rectangle : ");
  	  	  width = scan.nextDouble();
  	  	  System.out.print("Please enter the height of a rectangle : ");
  	  	  height = scan.nextDouble();
  	  	  
  	  	  Geometry geomObj = new Geometry();
  	  	  
  	  	  double volRec = geomObj.volume(length, width, height);
  	  	  System.out.println("The volume of a rectangle with length "
  	  	  	  				+ length + " width " + width + " and height "
  	  	  	  				+ height + " is " + volRec);
  			
  	  	  
  	  }
  	  
  }