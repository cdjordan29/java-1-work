
/**
 * Write a description of class Producer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producer extends Animal
{
    // instance variables - replace the example below with your own
    protected String gives;

    /**
     * Constructor for objects of class Producer
     */
    public Producer(String _name, String _food, String _sound, String _gives)
    {
        super(_name, _food, _sound);
        gives = _gives;
    }
    @Override
    public String toString()
    {
        String output = super.name + " eats " + super.food + " says " + super.sound + 
                        " gives " + gives;
        return output;
    }
}
