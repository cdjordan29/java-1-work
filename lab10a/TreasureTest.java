
/**
 * Write a description of class TreasureTest here.
 * 
 * @author (Daniel Jordan) 
 * @version (3/30/16)
 */
public class TreasureTest
{
    public static void main (String[] args)
    {
        Treasure t1 = new Treasure("Ring", "Platinum Ring", 2.5, 80);
        Treasure t10 = new Treasure("Ring", "Platinum Ring", 2.5, 80);
        Treasure t11 = new Treasure("Ring", "The One Ring", 100, 10000);
        Treasure t12 = new Treasure("Jar", "Jar of Dirt", 25, 0);
        Treasure t13 = new Treasure("Jewel", "Diamond", 5, 5000);
        Treasure t14 = new Treasure("Amulet", "Old Necklace", 0.5, 0);
        
        Room happyField = new Room("Happy Field", "Filled with unicorns", t11);
        
        Explorer Dora1 = new Explorer("Dora1", happyField, t1, t1);
        Explorer Dora2 = new Explorer("Dora2", happyField, t12, t11);
        Explorer Dora3 = new Explorer("Dora3", happyField, t11, t11);
        Explorer Dora4 = new Explorer("Dora4", happyField, t13, t14);
        Explorer Dora5 = new Explorer("Dora5", happyField, t12, t14);
        Explorer Dora6 = new Explorer("Dora6", happyField, t10, t12);
        Explorer Dora7 = new Explorer("Dora7", happyField, t10, t11);
        //comparing the with equals Treasures
        
        System.out.println("\tComparing the Treasures");
        
        System.out.println((t1 == t1) ? "1. Pass" : "1. Fail");//should pass
        System.out.println((t1 == t10) ? "2. Pass" : "2. Fail");//should fail
        System.out.println((t1 == t11) ? "3. Pass" : "3. Fail");//should fail
        System.out.println((t1.equals(t1)) ? "4. Pass" : "4. Fail");//should pass
        System.out.println((t1.equals(t11)) ? "5. Pass" : "5. Fail");//should fail
        System.out.println((t1.equals(t12)) ? "6. Pass" : "6. Fail");//should fail
        System.out.println((t1.equals(t13)) ? "7. Pass" : "7. Fail");//should fail
        System.out.println((t1.equals(t14)) ? "8. Pass" : "8. Fail");//should fail
        System.out.println((t1.equals(t10)) ? "9. Pass" : "9. Fail");//should pass
        //comparing the Treasures with compareTo
        int diff1 = t1.compareTo(t1);
        if(diff1 == 0) 
            System.out.println("10. Treasures have same value");
        else if (diff1 > 0)
            System.out.println("10. The left pocket is more valuable");
        else 
            System.out.println("10. The right pocket is more valuable");
        //comparing the Treasures with compareTo
        int diff2 = t1.compareTo(t10);
        if(diff2 == 0) 
            System.out.println("11. Treasures have same value");
        else if (diff2 > 0)
            System.out.println("11. The left pocket is more valuable");
        else 
            System.out.println("11. The right pocket is more valuable");
        //comparing the Treasures with compareTo
        int diff3 = t11.compareTo(t12);
        if(diff3 == 0) 
            System.out.println("12. Treasures have same value");
        else if (diff3 > 0)
            System.out.println("12. The left pocket is more valuable");
        else 
            System.out.println("12. The right pocket is more valuable");
        //comparing the Treasures with compareTo
        int diff4 = t1.compareTo(t11);
        if(diff4 == 0) 
            System.out.println("13. Treasures have same value");
        else if (diff4 > 0)
            System.out.println("13. The left pocket is more valuable");
        else 
            System.out.println("13. The right pocket is more valuable");
            
        System.out.println("\n\tComparing Explorer's pockets");
            
        //Comparing the Explorer's pockets with equals
        System.out.println((Dora1.getLeftPocket() == Dora1.getRightPocket()) ? "1. Pass" : "1. Fail");
        System.out.println((Dora2.getLeftPocket() != Dora2.getRightPocket()) ? "2. Pass" : "2. Fail");
        System.out.println((Dora3.getLeftPocket().equals(Dora3.getRightPocket())) ? "3. Pass" : "3. Fail");
        System.out.println((Dora4.getLeftPocket().equals(Dora4.getRightPocket())) ? "4. Pass" : "4. Fail");
        //Comparing the Explorer's pockets with compareTo
        int explorDiff1 = (Dora5.getLeftPocket().compareTo(Dora5.getRightPocket()));
        if(explorDiff1 == 0)
            System.out.println("5. Left and Right pockets have the same Treasure");
        else if(explorDiff1 > 0)
            System.out.println("5. Left pocket has more valuable Treasure");
        else    
            System.out.println("5. Right pocket has more valuable Treasure");
        //Comparing the Explorer's pockets with compareTo
         int explorDiff2 = (Dora6.getLeftPocket().compareTo(Dora6.getRightPocket()));
        if(explorDiff2 == 0)
            System.out.println("6. Left and Right pockets have the same Treasure");
        else if(explorDiff2 > 0)
            System.out.println("6. Left pocket has more valuable Treasure");
        else    
            System.out.println("6. Right pocket has more valuable Treasure");
        //Comparing the Explorer's pockets with compareTo
         int explorDiff3 = (Dora7.getLeftPocket().compareTo(Dora7.getRightPocket()));
        if(explorDiff3 == 0)
            System.out.println("7. Left and Right pockets have the same Treasure");
        else if(explorDiff3 > 0)
            System.out.println("7. Left pocket has more valuable Treasure");
        else    
            System.out.println("7. Right pocket has more valuable Treasure");
    }
}
