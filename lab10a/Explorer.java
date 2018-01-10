
/**
 * Creates a Explorer object 
 * 
 * @author (Daniel Jordan) 
 * @version (3/30/16)
 */
public class Explorer
{
    // instance variables - replace the example below with your own
    private String name;
    private Room room;
    private Treasure leftPocket;
    private Treasure rightPocket;
    

    //Constructor
    public Explorer(String _name, Room _room, Treasure _leftPocket, Treasure _rightPocket)
    {
        // initialise instance variables
        name = _name;
        room = _room;
        leftPocket = _leftPocket;
        rightPocket = _rightPocket;
    }
    //setter
    public void setName(String _name)
    {
        name = _name;
    }
    //setter
    public void setRoom(Room _room)
    {
        room = _room;
    }
    //setter
    public void setLeftPocket(Treasure _leftPocket)
    {
        leftPocket = _leftPocket;
    }
    //setter
    public void setRightPocket(Treasure _rightPocket)
    {
        rightPocket = _rightPocket;
    }
    //getter
    public String getName()
    {
        return this.name;
    }
    //getter
    public Room getRoom()
    {
        return this.room;
    }
    //getter
    public Treasure getLeftPocket()
    {
        return this.leftPocket;
    }
    //getter
    public Treasure getRightPocket()
    {
        return this.rightPocket;
    }
    
    public String toString()
    {
        String output = "Explorer: " + this.name + "\n"
                      + "Left Pocket: " + this.leftPocket.getName() + "\n"
                      + "Right Pocket: " + this.rightPocket.getName() + "\n"
                      + "Room: " + this.room.getName();
       return output;
    }
}
