
/**
 * Write a description of class Farm here.
 * 
 * @author (Daniel Jordan) 
 * @version (4/20/16)
 */
public class Farm
{
   public static void main(String [] args)
   {
       String[] food = {"slop", "hay", "clover", "shoes"};
       Animal pig = new Pig("Wilbur");
       Animal horse1 = new Horse("Mr. Ed", "Show horse");
       Animal horse2 = new Horse("Secretariat", "Racing horse");
       Animal cow = new Cow("Bessie");
       Animal sheep = new Sheep("Dolly");
       Animal goat = new Goat("Billie");
       Animal[] pen = new Animal[6];
       
       pen[0] = cow;
       pen[1] = horse1;
       pen[2] = horse2;
       pen[3] = sheep;
       pen[4] = pig;
       pen[5] = goat;
       
       System.out.println("Welcome to the Jordan Farm");
       System.out.println();
       System.out.println("Let me introduce you to the animals:");
       System.out.println();
       for(Animal out : pen)
       {
           System.out.println(out + " ");
       }
       System.out.println();
       System.out.print("Listen to all of the animals: ");
       for(Animal out : pen)
       {
           System.out.print(out.speak() + " ");
       }
       System.out.println();
       System.out.println();
       System.out.println("Let's feed the animals");
       System.out.println();
       for(int i = 0; i < pen.length; i++)
       {
           System.out.println(pen[i].eat(food));
        }
    }
}
