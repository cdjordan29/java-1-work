
/**
 * Write a description of class BankIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BankIO
{
   public static void readFile(String filename, Bank bank) throws FileNotFoundException {
    try{
           Scanner scanFile = new Scanner(new File(filename));
           while(scanFile.hasNext()){
               readAccount(scanFile);
            }
    }
    catch(FileNotFoundException exception){
        System.out.println("\n*****ERROR*****: " + "No file!\n"); 
    }
}
    
   public static BankAccount readAccount(Scanner in){
       in.useDelimiter(",");
       int accNum = in.nextInt();
       double balance = in.nextDouble();
       
       BankAccount bank = new BankAccount(balance, accNum);
      
       return bank;
    }
}
