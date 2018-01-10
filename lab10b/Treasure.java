
/**
 * Write a description of class Treasure here.
 * 
 * @author (Daniel Jordan) 
 * @version (4/1/16)
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
    //compareTo
    public int compareTo(Treasure otherTreasure)
    {
        return (this.value - otherTreasure.value);
    }
    //equals
    public boolean equals(Treasure otherTreasure)
    {
        return (this.name.equals(otherTreasure.name) &&
                this.description.equals(otherTreasure.description) &&
                this.weight == otherTreasure.weight &&
                this.value == otherTreasure.value);
    }
        //toString
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
