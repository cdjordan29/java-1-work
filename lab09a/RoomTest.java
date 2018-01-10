
/**
 * Runs the Room and Treasure classes 
 * 
 * @author (Daniel Jordan) 
 * @version (3/21/16)
 */
public class RoomTest
{
    public static void main (String[] args)
    {
        Treasure treasure1 = new Treasure("lint", "piece of dust", 0.0, 0);
        Treasure treasure2 = new Treasure("key", "golden key", 5.0, 25);
        Room startRoom = new Room("Start Room", "Cold, dark, and damp", treasure2);
        Room secondRoom = new Room("Davis 225", "Computer lab", treasure1);
        
        System.out.println(startRoom.toString());
        System.out.println(secondRoom.toString());
    }
   
}
