
/**
 * Does things with arrays of objects
 * 
 * @author (Daniel Jordan) 
 * @version (4/1/16)
 */
public class TreasureArraySrv
{
    //looks for the min value of the Treasure array
    public Treasure min(Treasure[] tsureArray)
    {
        Treasure min = tsureArray[0];
        int minValue = min.getValue();
        
        for(int i = 0; i < tsureArray.length; i++)
        {
            if(tsureArray[i].getValue() < minValue)
            {
                minValue = tsureArray[i].getValue();
                min = tsureArray[i];
            }
        }
        
        return min;
    }
    //looks for the max value of the Treasure array
    public Treasure max(Treasure[] tsureArray)
    {
        Treasure max = tsureArray[0];
        int maxValue = max.getValue();
        
        for(int i = 0; i < tsureArray.length; i++)
        {
            if(tsureArray[i].getValue() > maxValue)
            {
                maxValue = tsureArray[i].getValue();
                max = tsureArray[i];
            }
        }
        
        return max;
    }
    //looks to see if the given value is found in the array
    public boolean isFound(Treasure[] tsureArray, Treasure treasure)
    {
        boolean found = false;
        
        for(int i = 0; i < tsureArray.length; i++)
        {
            if(tsureArray[i].equals(treasure))
            {
                found = true;
            }
        }
        
        return found;
    }
    //looks to see how many times given value is found in the array
    public int timesFound(Treasure[] tsureArray, Treasure treasure)
    {
        int count = 0;
        
        for(int i = 0; i < tsureArray.length; i++)
        {
            if(tsureArray[i].equals(treasure))
            {
                count++;
            }
        }
        
        return count;        
    }
    //looks to see if the given treasure has the same value as the array
    public boolean searchVal(Treasure[] tsureArray, Treasure treasure)
    {
        boolean found = false;
        int value;
        
        for(int i = 0; i < tsureArray.length; i++)
        {
            value = tsureArray[i].compareTo(treasure);
            
            if(value == 0)
                found = true;          
        }
        
        return found;        
    }
}

