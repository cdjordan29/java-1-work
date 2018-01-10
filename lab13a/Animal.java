
/**
 * Write a description of class Animal here.
 * 
 * @author (Daniel Jordan) 
 * @version (4/20/16)
 */
public class Animal
{
    // instance variables
    protected String name;
    protected String food;
    protected String sound;
    
    /**
     * Constructor for objects of class Animal
     */
    public Animal(String _name, String _food, String _sound)
    {
        name = _name;
        food = _food;
        sound = _sound;
    }
    public String speak()
    {
        return this.sound;
    }
    public String eat(String[] arr1)
    {
        String output = this.name + " ate nothing.";
        
        for(int i = 0; i < arr1.length; i++)
        {
            if(this.food == arr1[i])
            {
                output = this.name + " ate " + arr1[i];
                arr1[i] = " ";
            }
        }
        
        return output;
    }
    public String toString()
    {
        String output = this.name + " eats " + this.food + " says " + this.sound;
        return output;
    }
}
