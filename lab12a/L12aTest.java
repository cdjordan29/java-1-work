import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;
public class L12aTest
{
    public static void main(String[] args) throws IOException 
    {
        //reading the files from the quiz_scores.csv
        FileReader fr1 = new FileReader("quiz_scores.csv");
        String lineFr1, studentNames = " ";
        Scanner scanFr1 = new Scanner("quiz_scores.csv"); 
        System.out.println("Name\tHigh\tLow\tAverage");
        while(fr1.hasNext())
        {
            int max = 0;
            int min = 100;
            int count = 0;
            int score = 0;
            double average = 0;
            lineFr1 = fr1.nextLine();
            scanFr1 = new Scanner(lineFr1);
            scanFr1.useDelimiter(",");
            studentNames = scanFr1.next();
            System.out.print(studentNames + "\t");
            while(scanFr1.hasNextInt())
            {   
                ++count;
                score = scanFr1.nextInt();
                average += score;
                if(max < score)
                {
                    max = score; 
                }
                if(score < min)
                {
                    min = score;
                }
            }
            average = average / count;
            System.out.print(max + "\t" + min + "\t" + average + "\n");
        }
        
        System.out.println("\n");
        
        FileReader fr2 = new FileReader("treasures.csv");
        String lineFr2, tresName = " ", tresDesc = " ", str1 = " ";
        int tresWeight = 0, tresValue = 0, tresArrayIndex = 0, num1 = 0;
        Scanner scanFr2 = new Scanner("treasures.csv");
        Treasure t1 = new Treasure(tresName, tresDesc, tresWeight, tresValue);
        while(fr2.hasNext())
        {
            lineFr2 = fr2.nextLine();
            scanFr2 = new Scanner(lineFr2);
            scanFr2.useDelimiter(",");
            int count0 = 0, count1 = 0, count2 = 0;
            tresName = scanFr2.next();
            tresDesc = scanFr2.next();     
            while(scanFr2.hasNextInt())
            {
                num1 = scanFr2.nextInt();
                if(count0 == 0)
                {
                    tresWeight = num1;
                    count1++;
                    count2++;
                }
                if(count1 == 1)
                {
                    tresValue = num1;
                    count2++;
                }
                if(count2 == 2)
                {
                    tresArrayIndex = num1;
                }
            }
        }
        
        //reading the files from the rooms.csv
        FileReader fr3 = new FileReader("rooms.csv");
        String lineFr3, roomName = " ", roomDesc = " ", str2 = " ";
        int count1 = 0, count2 = 0, countNum = 0, numRooms = 0;
        Scanner scanFr3 = new Scanner("rooms.csv");
        Room[] rooms = new Room[numRooms];
        while(fr3.hasNext())
        {
            lineFr3 = fr3.nextLine();
            scanFr3 = new Scanner(lineFr3);
            scanFr3.useDelimiter(",");
            if(countNum == 0)
            {
                numRooms = scanFr3.nextInt();
                ++countNum;
            }
            while(scanFr3.hasNext())
            {
                ++count1;//determines order of data taken from file
                count2++;//determines iff the toString prints for the rooms
                str2 = scanFr3.next();
                if(count1 % 2 != 0)
                {
                    roomName = str2;
                }
                if(count1 % 2 == 0)
                {
                    roomDesc = str2;
                }
            }
            if(count2 / 2 == 1)
            {
                Room r1 = new Room(roomName, roomDesc, t1);
                System.out.println(numRooms);
                System.out.println(r1.toString());
                count2 = 0;
                
                //Room[] rooms = new Room[numRooms];
                for(int i = 0; i < rooms.length; i++)
                {
                    if(rooms[i] == null)
                    {
                        rooms[i] = r1;
                    }
                }
            }
        }
    }
}
