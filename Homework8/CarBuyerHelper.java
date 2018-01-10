/***********************
 *
 *   CarBuyerHelper - class that facilitates purchasing a Car using PiggyBanks.
 *
 *   Author:   Shawn Brenneman
 *   Date:     2016-Apr-9
 *
 ***********************/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CarBuyerHelper {

    PiggyBank[] banks;
    Car[] cars;

    public CarBuyerHelper(String banksFilename, String carsFilename) throws FileNotFoundException {
        banks = getPiggyBanks(banksFilename);
        cars = getCars(carsFilename);
    }

    public static PiggyBank[] getPiggyBanks(String filename) throws FileNotFoundException {
        PiggyBank[] banks = new PiggyBank[30];
        int count = 0;
        Scanner scanFile = new Scanner(new File(filename));
        while (scanFile.hasNext()) {
            Scanner scanLine = new Scanner(scanFile.nextLine());
            scanLine.useDelimiter(",");
            String name = scanLine.next();
            int quarters = scanLine.nextInt();
            int dimes = scanLine.nextInt();
            int nickels = scanLine.nextInt();
            int pennies = scanLine.nextInt();
            banks[count] = new PiggyBank(name, quarters, dimes, nickels, pennies);
            // System.out.println("" + count + ": " + banks[count]); // FOR HELP WITH DEBUGGING
            count++;
        }
        return banks;
    }

    // =-=-=-=-= YOU get to write these methods. =-=-=-=-=-=

    public static Car[] getCars(String filename) throws FileNotFoundException {
        Car[] cars = new Car[30];
        int count = 0;
        Scanner scanFile = new Scanner(new File(filename));
        while(scanFile.hasNext()){
            Scanner scanLine = new Scanner(scanFile.nextLine());
            scanLine.useDelimiter(",");
            String make = scanLine.next();
            String model = scanLine.next();
            String color = scanLine.next();
            int year = scanLine.nextInt();
            int price = scanLine.nextInt();
            int odom = scanLine.nextInt();
            cars[count] = new Car(make, model, color, year, price, odom);
            //System.out.println("" + count + ": " + cars[count]; //FOR HELP WITH BUGS
            count++;
        }
        return cars;
    }

    public double getTotalInPiggyBanks() {
        double total = 0.0;
        for(int i = 0; i < banks.length; i++)
        {
            total += banks[i].contains();
        }
        return total;
    }

    public int getNumberOfAffordableCars() {
        int count = 0;
        for(int i = 0; i < cars.length; i++)
        {
            if(cars[i].currentValue() < getTotalInPiggyBanks())
            {
                count++;
            }
        }
        return count;
    }

    public Car[] getAffordableCars() {
        Car[] affordableCars = new Car[getNumberOfAffordableCars()];
        int count = 0;
        for(int i = 0; i < cars.length; i++)
        {
            if(cars[i].currentValue() < getTotalInPiggyBanks())
            {
                affordableCars[count] = cars[i];
                count++;
            }
        }
        return affordableCars;
    }

    public Car getMostExpensiveAffordableCar() {
        Car[] affordable = getAffordableCars();
        Car max = affordable[0];
        
        for(int i = 0; i < affordable.length; i++)
        {
            if(affordable[i].compareTo(max) > 0)
            {
                max = affordable[i];
            }
        }
        
        return max;
    }
}
