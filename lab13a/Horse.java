
/**
 * Write a description of class Horse here.
 * 
 * @author (Daniel Jordan) 
 * @version (4/20/16)
 */
public class Horse extends Animal
{
    // instance variables 
    protected String type;
    
    /**
     * Constructor for objects of class Horse
     */
    public Horse(String _name, String _type)
    {
        super(_name, "hay", "nay");
        type = _type;
    }
}
