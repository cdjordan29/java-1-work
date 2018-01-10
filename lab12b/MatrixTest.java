import java.util.Arrays;
/**
 * Tests some of the methods from MatrixSrv
 * 
 * @author (Daniel Jordan) 
 * @version (4/13/16)
 */
public class MatrixTest
{
   public static boolean testMax(int[][] matrix, int expectedIntOutput)
   {
       MatrixSrv matrixSrv = new MatrixSrv();
       boolean testPassed = true;
       int methodOutput = matrixSrv.max(matrix);
       String outputString = "max (" + Arrays.deepToString(matrix) + ") returns "+ methodOutput;
       if(methodOutput == expectedIntOutput)
       {
         System.out.println("     " + outputString);
       }
       else
       {
         System.out.println("FAIL: " + outputString + " (expected " + expectedIntOutput + ")");
         testPassed = false;                     
       }
       return testPassed;
   }
   public static boolean testRange(int[][] matrix, int expectedIntOutput)
   {
       MatrixSrv matrixSrv = new MatrixSrv();
       boolean testPassed = true;
       int methodOutput = matrixSrv.range(matrix);
       String outputString = "range (" + Arrays.deepToString(matrix) + ") returns " + methodOutput;
       if(methodOutput == expectedIntOutput)
       {
           System.out.println("     " + outputString);
       }
       else
       {
           System.out.println("FAIL: " + outputString + " (expected " + expectedIntOutput + ")");
           testPassed = false;
       }
       return testPassed;
   }
   public static boolean testIsFound(int[][] matrix, int num, boolean expectedBoolOutput)
   {
       MatrixSrv matrixSrv = new MatrixSrv();
       boolean testPassed = true;
       boolean methodOutput = matrixSrv.isFound(matrix, num);
       String outputString = "isFound (" + Arrays.deepToString(matrix) + ") returns " + methodOutput;
       if(methodOutput == expectedBoolOutput)
       {
           System.out.println("     " + outputString);
       }
       else
       {
           System.out.println("FAIL: " + outputString + " (expected " + expectedBoolOutput + ")");
           testPassed = false;
       }
       return testPassed;
   }
   
   public static void main(String[] args)
   {
       //----max-------------------------------------------------------------------
       System.out.println("---testing max method ------------------------------------------------\n");
       int maxMethodTestsFailed = 0;
       
        int[][] matrix = new int[][]{{42}};
        int expectedIntOutput = 42;
        if (!testMax(matrix, expectedIntOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{3}, {-2}, {-33}, {22}, {333}, {-22}};
        expectedIntOutput = 333;
        if (!testMax(matrix, expectedIntOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{1, 2, 3, 4}, {11, 22, 33, 44}, {21, 22, 23, 24}};
        expectedIntOutput = 44;
        if (!testMax(matrix, expectedIntOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{71, 94, 11, -54}, {31, -54, 18, -22}, {41, 42, 43, 94}};
        expectedIntOutput = 94;
        if (!testMax(matrix, expectedIntOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{4}, {33, 44}, {222, 333, 444, 555, 666}, {1111, 2222, 3333}};
        expectedIntOutput = 3333;
        if (!testMax(matrix, expectedIntOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{-1, -2, -3, -4}, {-11, -22, -33, -44}, {-210, -220, -230, -240}};
        expectedIntOutput = -1;
        if (!testMax(matrix, expectedIntOutput)) {
            maxMethodTestsFailed++;
        }
       
       if(maxMethodTestsFailed == 0)
       {
           System.out.println("\n*** The max method passed all tests!\n");
       }
       else if (maxMethodTestsFailed == 1)
       {
           System.out.println("\n*** The max method passed all but on test.\n");
       }
       else
       {
           System.out.println("\n*** The max method failed " + maxMethodTestsFailed + " tests.\n");
       }
       
       //----range-------------------------------------------------------------------
       System.out.println("---testing range method ------------------------------------------------\n");
       int rangeMethodTestsFailed = 0;
       
        matrix = new int[][]{{42}};
        expectedIntOutput = 0;
        if (!testRange(matrix, expectedIntOutput)) {
            rangeMethodTestsFailed++;
        }

        matrix = new int[][]{{3}, {-2}, {-33}, {22}, {333}, {-22}};
        expectedIntOutput = 366;
        if (!testRange(matrix, expectedIntOutput)) {
            rangeMethodTestsFailed++;
        }

        matrix = new int[][]{{1, 2, 3, 4}, {11, 22, 33, 44}, {21, 22, 23, 24}};
        expectedIntOutput = 43;
        if (!testRange(matrix, expectedIntOutput)) {
            rangeMethodTestsFailed++;
        }

        matrix = new int[][]{{71, 94, 11, -54}, {31, -54, 18, -22}, {41, 42, 43, 94}};
        expectedIntOutput = 148;
        if (!testRange(matrix, expectedIntOutput)) {
            rangeMethodTestsFailed++;
        }

        matrix = new int[][]{{4}, {33, 44}, {222, 333, 444, 555, 666}, {1111, 2222, 3333}};
        expectedIntOutput = 3329;
        if (!testRange(matrix, expectedIntOutput)) {
            rangeMethodTestsFailed++;
        }

        matrix = new int[][]{{-1, -2, -3, -4}, {-11, -22, -33, -44}, {-210, -220, -230, -240}};
        expectedIntOutput = 239;
        if (!testRange(matrix, expectedIntOutput)) {
            rangeMethodTestsFailed++;
        }
       
       if(rangeMethodTestsFailed == 0)
       {
           System.out.println("\n*** The range method passed all tests!\n");
       }
       else if (rangeMethodTestsFailed == 1)
       {
           System.out.println("\n*** The range method passed all but on test.\n");
       }
       else
       {
           System.out.println("\n*** The range method failed " + rangeMethodTestsFailed + " tests.\n");
       }
       
       //----isFound-------------------------------------------------------------------
       System.out.println("---testing isFound method ------------------------------------------------\n");
       int isFoundMethodTestsFailed = 0;
       int num = 0;
       
       matrix = new int[][]{{42}};
       num = 42;
       boolean expectedBoolOutput = true;
        if (!testIsFound(matrix, num, expectedBoolOutput)) {
            isFoundMethodTestsFailed++;
        }

        matrix = new int[][]{{3}, {-2}, {-33}, {22}, {333}, {-22}};
        num = -2;
        expectedBoolOutput = true;
        if (!testIsFound(matrix, num, expectedBoolOutput)) {
            isFoundMethodTestsFailed++;
        }

        matrix = new int[][]{{1, 2, 3, 4}, {11, 22, 33, 44}, {21, 22, 23, 24}};
        num = 33;
        expectedBoolOutput = true;
        if (!testIsFound(matrix, num, expectedBoolOutput)) {
            isFoundMethodTestsFailed++;
        }

        matrix = new int[][]{{71, 94, 11, -54}, {31, -54, 18, -22}, {41, 42, 43, 94}};
        num = -789;
        expectedBoolOutput = false;
        if (!testIsFound(matrix, num, expectedBoolOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{4}, {33, 44}, {222, 333, 444, 555, 666}, {1111, 2222, 3333}};
        num = -1;
        expectedBoolOutput = false;
        if (!testIsFound(matrix, num, expectedBoolOutput)) {
            maxMethodTestsFailed++;
        }

        matrix = new int[][]{{-1, -2, -3, -4}, {-11, -22, -33, -44}, {-210, -220, -230, -240}};
        num = -220;
        expectedBoolOutput = true;
        if (!testIsFound(matrix, num, expectedBoolOutput)) {
            maxMethodTestsFailed++;
        }
       
       if(isFoundMethodTestsFailed == 0)
       {
           System.out.println("\n*** The isFound method passed all tests!\n");
       }
       else if (isFoundMethodTestsFailed == 1)
       {
           System.out.println("\n*** The isFound method passed all but on test.\n");
       }
       else
       {
           System.out.println("\n*** The isFound method failed " + maxMethodTestsFailed + " tests.\n");
       }
   }
}
