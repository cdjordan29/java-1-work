/***********************
 *
 *   CarWorthDrv - driver to test the carWorth method
 *
 *   Author:   Shawn Brenneman
 *   Date:     2016-Feb-28
 *
 ***********************/

 public class CarWorthDrv
 {
 public static void main(String[] args) {

    CarWorthSrv srvObj = new CarWorthSrv();

    System.out.println();
    System.out.print("Testing a 2009 vehicle.  Purchase price: $22,000 with  89,000 miles: ");
    int result = srvObj.carWorth(2009, 22000, 89000); 
    
    if (result == 10150)
        System.out.println("PASS");
    else
    {
        System.out.println("*** FAIL ***");
        System.out.println("should be 10150.  your method returned: " + result + "\n");
    }

    System.out.print("Testing a 2011 vehicle.  Purchase price: $29,000 with  54,500 miles: ");
    result = srvObj.carWorth(2011, 29000, 54500); 
    
    if (result == 21000)
        System.out.println("PASS");
    else
    {
        System.out.println("*** FAIL ***");
        System.out.println("should be 21000.  your method returned: " + result + "\n");
    }


    System.out.print("Testing a 2012 vehicle.  Purchase price: $34,400 with  24,700 miles: ");
    result = srvObj.carWorth(2012, 34400, 24700); 
    
    if (result == 28120)
        System.out.println("PASS");
    else
    {
        System.out.println("*** FAIL ***");
        System.out.println("should be 28120.  your method returned: " + result + "\n");
    }


    System.out.print("Testing a 2013 vehicle.  Purchase price: $32,000 with  30,000 miles: ");
    result = srvObj.carWorth(2013, 32000, 30000); 
    System.out.println( (result == 26800)? "PASS":"*** FAIL ***\nshould be 26800. Your method returned: " + result + "\n");
    
    System.out.print("Testing a 2014 vehicle.  Purchase price: $29,900 with  24,000 miles: ");
    result = srvObj.carWorth(2014, 29900, 24000); 
    System.out.println( (result == 26100)? "PASS":"*** FAIL ***\nshould be 26100. Your method returned: " + result + "\n");
    
    System.out.print("Testing a 2012 vehicle.  Purchase price: $28,900 with  48,002 miles: ");
    result = srvObj.carWorth(2012, 28900, 48002); 
    System.out.println( (result == 21700)? "PASS":"*** FAIL ***\nshould be 21700. Your method returned: " + result + "\n");
    
    System.out.print("Testing a 2016 vehicle.  Purchase price: $35,900 with   1,200 miles: ");
    result = srvObj.carWorth(2016, 35900, 1200); 
    System.out.println( (result == 34900)? "PASS":"*** FAIL ***\nshould be 34900. Your method returned: " + result + "\n");
    
    System.out.print("Testing a 1997 vehicle.  Purchase price: $19,000 with 210,000 miles: ");
    result = srvObj.carWorth(1997, 19000, 210000); 
    System.out.println( (result == 0)? "PASS":"*** FAIL ***\nshould be 0. Your method returned: " + result + "\n");

    System.out.print("Testing a 2002 vehicle.  Purchase price: $19,200 with 130,000 miles: ");
    result = srvObj.carWorth(2002, 19200, 130000); 
    System.out.println( (result == 0)? "PASS":"*** FAIL ***\nshould be 0. Your method returned: " + result + "\n");
    
    
    System.out.println();

 } //main 

 }

