package lab08c;


/**
 * Write a description of class TreasureTest here.
 * 
 * @author (Daniel Jordan) 
 * @version (3/18/16)
 */
public class TreasureTest
{
    public static void main (String[] args)
    {
        Treasure t1 = new Treasure("Ring", "Platinum Ring", 2.5, 80);
        
        t1.setName("Keyblade");
        t1.setDescription("Little Mermaid");
        t1.setWeight(50);
        t1.setValue(9000);
     
        System.out.println(t1.toString());
        
    }
}
