
/**
 * Write a description of class PiggyBank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PiggyBank
{
    // instance variables - replace the example below with your own
    private String ownerName;
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    /**
     * Constructor for objects of class PiggyBank
     */
    public PiggyBank(String _ownerName)
    {
        // initialise instance variables
        ownerName = _ownerName;
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
    }
    public String toString()
    {
        String output = "\t" + "Piggy Bank" + "\n"
                      + "Quarters: " + this.quarters + "\n"
                      + "Dimes: " + this.dimes + "\n"
                      + "Nickels: " + this.nickels + "\n"
                      + "Pennies: " + this.pennies + "\n"
                      + "Total : $" + this.contains();
        return output;
    }
    public double empty()
    {
        double quarterTotal = 0;
        double dimeTotal = 0;
        double nickelTotal = 0;
        double pennyTotal = 0;
        double moneyTotal = 0;
        double totalBeforeEmpty = 0;
        quarterTotal = this.quarters * 0.25;
        dimeTotal = this.dimes * 0.10;
        nickelTotal = this.nickels * 0.05;
        pennyTotal = this.pennies * 0.01;
        
        moneyTotal = quarterTotal + dimeTotal + nickelTotal + pennyTotal;
        totalBeforeEmpty = moneyTotal;
        this.quarters = 0;
        this.dimes = 0;
        this.nickels = 0;
        this.pennies = 0;
        return totalBeforeEmpty;
    }
    public double contains()
    {
        double quarterTotal = 0;
        double dimeTotal = 0;
        double nickelTotal = 0;
        double pennyTotal = 0;
        double moneyTotal = 0;
        
        quarterTotal = this.quarters * 0.25;
        dimeTotal = this.dimes * 0.10;
        nickelTotal = this.nickels * 0.05;
        pennyTotal = this.pennies * 0.01;
        
        moneyTotal = quarterTotal + dimeTotal + nickelTotal + pennyTotal;
        return moneyTotal;
    }
    public void addQuarter()
    {
        this.quarters += 1;
    }
    public void addDime()
    {
        this.dimes += 1;
    }
    public void addNickel()
    {
        this.nickels += 1;
    }
    public void addPenny()
    {
        this.pennies += 1;
    }
    //getter
    public String getName()
    {
        return this.ownerName;
    }
    //getter
    public int getQuarterCnt()
    {
        return this.quarters;
    }
    //getter
    public int getDimeCnt()
    {
        return this.dimes;
    }
    //getter
    public int getNickelCnt()
    {
        return this.nickels;
    }
    //getter
    public int getPennyCnt()
    {
        return this.pennies;
    }
}
