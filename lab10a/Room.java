
/**
 * Creates a Room object and puts a Treasure object inside
 * 
 * @author (Daniel Jordan) 
 * @version (3/30/16)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private Treasure treasure;
            
    //Constructor
    public Room(String _name, String _description, Treasure _treasure)
    {
        // initialise instance variables
       name = _name;
       description = _description;
       treasure = _treasure;
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
    public void setTreasure(Treasure _treasure)
    {
        treasure = _treasure;
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
    public Treasure getTreasure()
    {
        return this.treasure;
    }
    
    public String toString()
    {
        String output = "Room: " + this.name + "\n"
                      + "Description: " + this.description + "\n"
                      + "Treasure: " + this.treasure.getName() + "\n";
                      
        return output;
    }
    
}
