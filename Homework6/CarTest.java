
/**
 * Generates Car objects, uses the setters, and prints out the Car objects 
 * 
 * @author (Daniel Jordan) 
 * @version (3/25/16)
 */
public class CarTest
{
    public static void main (String [] args)
    {
        Car usedCar = new Car("Toyota", "Tacoma", "Red", 2002, 11500, 120200);
        Car newCar = new Car("Ford", "Fusion", "Peral White", 25000);
        Car newCar2017 = new Car("GMC", "Sierra", "Titanium Blue", 2017, 65000, 100);
        Car goldenOldie = new Car("Dodge", "Charger", "Black", 1969, 90000, 1500);
        Car jennasCar = new Car("Toyota", "Corolla", "White", 1997, 3500, 120000);
        Car momsCar = new Car("Nissan", "Xtera", "Blue", 2010, 21000, 110000);
        
        newCar.setColor("Candy Apple Red");
        goldenOldie.setColor("General Lee Paintscheme");
        newCar2017.addMiles(25);
        newCar2017.addMiles(27);
        newCar2017.addMiles(-69);
        
        System.out.println(usedCar.toString());
        System.out.println(newCar.toString());
        System.out.println(newCar2017.toString());
        System.out.println(goldenOldie.toString());
        System.out.println(jennasCar.toString());
        System.out.println(momsCar.toString());
    }
}
