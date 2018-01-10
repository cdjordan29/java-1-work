
/**
 *Creates multiple car objects and methods involving cars.
 * 
 * @author (Daniel Jordan) 
 * @version (3/25/16)
 */
import java.lang.Math;
import java.util.Calendar;
public class Car
{
    // instance variables - replace the example below with your own
    private String make;
    private String model;
    private String color;
    private int yearManufactured;
    private double purchasePrice;
    private double odometerMiles;
    
    public Car(String _make, String _model, String _color, int _yearManufactured, 
               double _purchasePrice, double _odometerMiles)
    {
        make = _make;
        model = _model;
        color = _color;
        yearManufactured = _yearManufactured;
        purchasePrice = _purchasePrice;
        odometerMiles = _odometerMiles;     
    }
    
    public Car(String _make, String _model, String _color, double _purchasePrice)
    {
        Calendar year = Calendar.getInstance();
        make = _make;
        model = _model;
        color = _color;
        yearManufactured = year.get(Calendar.YEAR);
        purchasePrice = _purchasePrice;
        odometerMiles = 0;        
    }
    //toString 
    public String toString()
    {
        String output = "\t" + "Car/Truck" + "\n"
                      + "Make: "+ this.make + "\n"
                      + "Model: " + this.model + "\n"
                      + "Color: " + this.color + "\n"
                      + "Year Manufactured: " + this.yearManufactured + "\n"
                      + "Purchase Price: $" + this.purchasePrice + "\n"
                      + "Odometer: " + this.odometerMiles + " miles" + "\n"
                      + "Antique: " + isAntique() + "\n"
                      + "Current Value: $" + this.currentValue(this.yearManufactured, this.purchasePrice, this.odometerMiles) + "\n";
        return output;
    }
    //currentValue method
    public double currentValue(int _yearManufactured, double _purchasePrice, double _odometerMiles)
    {
        Calendar year = Calendar.getInstance();
        
        final int CURRENT_YEAR = year.get(Calendar.YEAR);
        final int DEPRECIATION_AFTER_PURCHASE = 1000;
        double mileagePerYear = 0;      
        double currentValue = _purchasePrice;
 	
 	  if(_yearManufactured == CURRENT_YEAR)
 	 {
 	 	currentValue = currentValue - DEPRECIATION_AFTER_PURCHASE;	 
 	 }
 	 
 	 if(_yearManufactured == CURRENT_YEAR + 1)
 	 {
 	     currentValue = currentValue - DEPRECIATION_AFTER_PURCHASE;
 	 }
 	 
 	 else if(_yearManufactured < CURRENT_YEAR)
 	 {
 	 	 currentValue = currentValue - DEPRECIATION_AFTER_PURCHASE;
 	 	 mileagePerYear = (_odometerMiles * 1.0) / (CURRENT_YEAR - _yearManufactured);
 	 
 	 	 if(mileagePerYear >= 10000 && mileagePerYear <= 12000)//normal mileage
 	 	 {
 	 	 	 currentValue = currentValue - (1400 * (CURRENT_YEAR - _yearManufactured));	 
 	 	 }
 	 
 	 	 if(mileagePerYear > 12000)//high mileage
 	 	 {
 	 	 	 currentValue = currentValue - (1550 * (CURRENT_YEAR - _yearManufactured));	 
 	 	 }
 	 
 	 	 if(mileagePerYear < 10000)//low mileage
 	 	 {
 	 	 	 currentValue = currentValue - (1300 * (CURRENT_YEAR - _yearManufactured));	 
 	 	 }
 	 	 
 	 	 if(currentValue <= 0)
 	 	 {
 	 	     currentValue = 0;
 	 	 }
 	 }

    return currentValue;
    }
    //isAntique method
    public boolean isAntique()
    {
        final int CURRENT_YEAR = 2016;
        final int ANTIQUE = 45;
        boolean isAntique = false;
        if((CURRENT_YEAR - this.yearManufactured) >= ANTIQUE)
        {
            isAntique = true;
        }
        
        return isAntique;
    }
    //addMiles method
    public void addMiles(double _odometerMiles)
    {
        odometerMiles += Math.max(0,_odometerMiles);
    }
    //setter
    public void setColor(String _color)
    {
        color = _color;
    }
    //getter
    public String getMake()
    {
        return this.make;
    }
    //getter
    public String getModel()
    {
        return this.model;
    }
    //getter
    public String getColor()
    {
        return this.color;
    }
    //getter
    public int getYearManufactured()
    {
        return this.yearManufactured;
    }
    //getter
    public double getPurchasePrice()
    {
        return this.purchasePrice;
    }
    //getter
    public double getOdometerMiles()
    {
        return this.odometerMiles;
    }
}
