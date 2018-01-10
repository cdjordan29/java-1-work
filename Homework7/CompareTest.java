/***********************
 *
 *   CompareTest - tests .equals and .compareTo methods for Car objects and PiggyBank objects 
 *
 *   Author:   Shawn Brenneman
 *   Date:     2016-Mar 30
 *
 ***********************/
public class CompareTest {

public static void main(String[] args) {

    Car mustang = new Car("Ford", "Mustang", "white", 1964, 60000, 95432);
    Car wagon = new Car("Ford", "Country Squire", "blue/paneled", 30000);
    Car tesla = new Car("Tesla", "Model S", "silver", 2017, 75000, 0);
    Car oldCar = new Car("Toyota", "Corolla", "red", 1987, 9200, 230000);
    Car bug = new Car("Volkswagon", "Beetle", "yellow", 2005, 24200, 26000); 
    Car anotherBug = new Car("Volkswagon", "Beetle", "yellow", 2005, 24500, 120000); 
    Car mini = new Car("MINI", "Cooper", "blue", 2011, 20400, 48000); 
    Car truck = new Car("Ford", "F150", "green", 2010, 22300, 68000);
    Car momsCar = new Car("Nissan", "Xtera", "blue", 2010, 21000, 110000);
    
    PiggyBank piggyDan = new PiggyBank("Daniel");
    PiggyBank piggyJen = new PiggyBank("Jenna");
    PiggyBank piggyRuth = new PiggyBank("Ruthie");
    PiggyBank piggyTim = new PiggyBank("Tim");
    PiggyBank piggyLori = new PiggyBank("Lori");
    PiggyBank piggyMom = new PiggyBank("Mom");
    addCoins(piggyDan, 231, 430, 322, 598);
    addCoins(piggyJen, 231, 430, 322, 598);
    addCoins(piggyRuth, 5, 5, 5, 5);
    addCoins(piggyTim, 450, 800, 500, 1000);
    addCoins(piggyLori, 231, 430, 322, 598);
    addCoins(piggyMom, 999, 9999, 99999, 999999);
    
    System.out.println("\nTesting Car .equals\n");

    System.out.println("tesla.equals(anotherBug) --> " + tesla.equals(anotherBug) + "\t : " + (tesla.equals(anotherBug) ? "-FAIL" : "Pass")) ;
    System.out.println("mustang.equals(wagon) --> " + mustang.equals(wagon) + "\t\t : " + (mustang.equals(wagon) ? "-FAIL" : "Pass")) ;
    System.out.println("mustang.equals(oldCar) --> " + mustang.equals(oldCar) + "\t : " + (mustang.equals(oldCar) ? "-FAIL" : "Pass")) ;
    System.out.println("bug.equals(anotherBug) --> " + bug.equals(anotherBug) + "\t\t : " + (bug.equals(anotherBug) ? "Pass" : "-FAIL")) ;


    System.out.println("\nTesting Car .compareTo\n");

    System.out.println("tesla.compareTo(anotherBug) --> " + tesla.compareTo(anotherBug) + "\t : " + (tesla.compareTo(anotherBug) > 0 ? "Pass" : "-FAIL")) ;
    System.out.println("mustang.compareTo(oldCar) --> " + mustang.compareTo(oldCar) + "\t\t : " + (mustang.compareTo(oldCar) == 0 ? "Pass" : "-FAIL")) ;
    System.out.println("anotherBug.compareTo(bug) --> " + anotherBug.compareTo(bug) + "\t : " + (anotherBug.compareTo(bug) < 0 ? "Pass" : "-FAIL")) ;
    System.out.println("truck.compareTo(mini) --> " + truck.compareTo(mini) + "\t\t : " + (truck.compareTo(mini) == 0 ? "Pass" : "-FAIL")) ;

    System.out.println();
    
    System.out.println("\nTesting PiggyBank .equals\n");
    
    System.out.println("piggyDan.equals(piggyJen) --> " + piggyDan.equals(piggyJen) + "\t : " + (piggyDan.equals(piggyJen) ? "Pass" : "-FAIL")) ;
    System.out.println("piggyDan.equals(piggyRuth) --> " + piggyDan.equals(piggyRuth) + "\t : " + (piggyDan.equals(piggyRuth) ? "-FAIL" : "Pass")) ;
    System.out.println("piggyDan.equals(piggyTim) --> " + piggyDan.equals(piggyTim) + "\t : " + (piggyDan.equals(piggyTim) ? "-FAIL" : "Pass")) ;
    System.out.println("piggyLori.equals(piggyDan) --> " + piggyLori.equals(piggyDan) + "\t : " + (piggyLori.equals(piggyDan) ? "Pass" : "-FAIL")) ;
    System.out.println("piggyDan.equals(piggyMom) --> " + piggyDan.equals(piggyMom) + "\t : " + (piggyDan.equals(piggyMom) ? "-FAIL" : "Pass"));
    
    System.out.println("\nTesting PiggyBank .compareTo\n");
    
    System.out.println("piggyDan.compareTo(piggyJen) --> " + piggyDan.compareTo(piggyJen) + "\t\t : " + (piggyDan.compareTo(piggyJen) == 0 ? "Pass" : "-FAIL")) ;
    System.out.println("piggyDan.compareTo(piggyRuth) --> " + piggyDan.compareTo(piggyRuth) + "\t : " + (piggyDan.compareTo(piggyRuth) > 0 ? "Pass" : "-FAIL")) ;
    System.out.println("piggyDan.compareTo(piggyTim) --> " + piggyDan.compareTo(piggyTim) + "\t : " + (piggyDan.compareTo(piggyTim) < 0 ? "Pass" : "-FAIL")) ;
    System.out.println("piggyLori.compareTo(piggyDan) --> " + piggyLori.compareTo(piggyDan) + "\t\t : " + (piggyLori.compareTo(piggyDan) == 0 ? "Pass" : "-FAIL")) ;
    System.out.println("piggyMom.compareTo(piggyDan) --> " + piggyMom.compareTo(piggyDan) + "\t : " + (piggyMom.compareTo(piggyDan) > 0 ? "Pass" : "-FAIL"));

}

//--------------------------------------------
//
//  method to make it easy to add a bunch of coins to a PiggyBank.
//
//--------------------------------------------
public static void addCoins(PiggyBank bank, int qs, int ds, int ns, int ps)
{
    for (int i=0; i<qs; i++)
        bank.addQuarter();
    for (int i=0; i<ds; i++)
        bank.addDime();
    for (int i=0; i<ns; i++)
        bank.addNickel();
    for (int i=0; i<ps; i++)
        bank.addPenny();
}
}
