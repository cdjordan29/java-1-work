
/**
 * Write a description of class ExplorerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplorerTest
{
   public static void main (String [] args)
   {
       Treasure treasure1 = new Treasure("lint", "piece of dust", 0.0, 0);
       Treasure treasure2 = new Treasure("key", "golden key", 5.0, 25);
       Room startRoom = new Room("Start Room", "Cold, dark, and damp", treasure2);
       Explorer explorer1 = new Explorer("Dora", startRoom, treasure1, treasure1);
       
       System.out.println(explorer1.toString());
       
   }
}
