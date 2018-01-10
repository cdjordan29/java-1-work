package lab08c;


/**
 * Write a description of class Treasure here.
 * 
 * @author (Daniel Jordan) 
 * @version (3/18/16)
 */
public class Treasure
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private double weight;
    private int value; 
    //constructor
    public Treasure(String _name, String _description, double _weight, int _value)
    {
        name = _name;
        description = _description;
        weight = _weight;
        value = _value;
    }
    
    public String toString()
    {
        String output = "Name: " + this.name + "\n" + "Description: " +
                        this.description + "\n" + "Weight: " + this.weight +
                        "  Value: " + this.value; 
        return output;
    }
    //setter
    public void setName(String _name)
    {
        name = _name;
    }
    //setter
    public void setDescription(String _description)
    {
        description = _description;
    }
    //setter
    public void setWeight(double _weight)
    {
        weight = _weight;
    }
    //setter
    public void setValue(int _value)
    {
        value = _value;
    }
    //getter
    public String getName()
    {
        return this.name;
    }
    //getter
    public String getDescription()
    {
        return this.description;
    }
    //getter
    public double getWeight()
    {
        return this.weight;
    }
    //getter
    public int getValue()
    {
        return this.value;
    }
}
