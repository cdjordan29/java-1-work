
/**
 * Write a description of class TreasureArrayDrv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureArrayDrv
{
    public static void main(String[] args)
    {
        TreasureArraySrv srvObj = new TreasureArraySrv();
        
        Treasure[] tsureArray = 
        {
            new Treasure("Ring", "Platinum Ring", 2.5, 80),
            new Treasure("Ring", "Platinum Ring", 2.5, 80),
            new Treasure("Ring", "The One Ring", 100, 10000),
            new Treasure("Jar", "Jar of Dirt", 25, 0),
            new Treasure("Jar", "Jar of Dirt", 25, 0),
            new Treasure("Jar", "Jar of Dirt", 25, 0),
            new Treasure("Jar", "Jar of Dirt", 25, 0),
            new Treasure("Jewel", "Diamond", 5, 5000),
            new Treasure("Amulet", "Old Necklace", 0.5, 0)
        };
        Treasure t12 = new Treasure("Jar", "Jar of Dirt", 25, 0);
        Treasure t10 = new Treasure("Card", "3 of clube", 0.1, 10);
        
        System.out.println("\tmin:\n" + srvObj.min(tsureArray));
        System.out.println("\tmax:\n" + srvObj.max(tsureArray));
        System.out.println("\tisFound 1:\n" + srvObj.isFound(tsureArray, t12));
        System.out.println("\tisFound 2:\n" + srvObj.isFound(tsureArray, t10));
        System.out.println("\ttimesFound 1:\n" + srvObj.timesFound(tsureArray, t12));
        System.out.println("\ttimesFound 2:\n" + srvObj.timesFound(tsureArray, t10));
        System.out.println("\tsearchVal 1:\n" + srvObj.searchVal(tsureArray, t12));
        System.out.println("\tsearchVal 2:\n" + srvObj.searchVal(tsureArray, t10));
    }
}
