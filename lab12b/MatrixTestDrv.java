import java.util.Arrays;

public class MatrixTestDrv {

    public static boolean testSum(int[][] matrix, int expectedIntOutput) {
        MatrixSrv matrixSrv = new MatrixSrv();
        boolean testPassed = true;
        int methodOutput = matrixSrv.sum(matrix);
        String outputString = " sum(" + Arrays.deepToString(matrix) + ") returns " + methodOutput;
        if (methodOutput == expectedIntOutput) {
            System.out.println("     " + outputString);
        } else {
            System.out.println("FAIL:" + outputString + " (expected " + expectedIntOutput + ")");
            testPassed = false;
        }
        return testPassed;
    }

    public static boolean testMin(int[][] matrix, int expectedIntOutput) {
        MatrixSrv matrixSrv = new MatrixSrv();
        boolean testPassed = true;
        int methodOutput = matrixSrv.min(matrix);
        String outputString = " min(" + Arrays.deepToString(matrix) + ") returns " + methodOutput;
        if (methodOutput == expectedIntOutput) {
            System.out.println("     " + outputString);
        } else {
            System.out.println("FAIL:" + outputString + " (expected " + expectedIntOutput + ")");
            testPassed = false;
        }
        return testPassed;
    }

    public static boolean testSumRows(int[][] matrix, int[] expectedArrOutput) {
        MatrixSrv matrixSrv = new MatrixSrv();
        boolean testPassed = true;
        int[] methodOutput = matrixSrv.sumRows(matrix);
        String outputString = " sumRows(" + Arrays.deepToString(matrix) + ") returns " + Arrays.toString(methodOutput);
        if (methodOutput.length != expectedArrOutput.length){
            testPassed = false;
        }
        for (int ii = 0; ii < methodOutput.length; ii++) {
            if (ii >= expectedArrOutput.length || methodOutput[ii] != expectedArrOutput[ii]) {
                testPassed = false;
            }
        }
        if (testPassed) {
            System.out.println("     " + outputString);
        } else {
            System.out.println("FAIL:" + outputString + " (expected " + Arrays.toString(expectedArrOutput) + ")");
        }
        return testPassed;
    }

    public static void main(String[] args) {

        // --- sum ------------------------------------------------------------
        System.out.println("--- testing sum method ------------------------------------------------\n");
        int sumMethodTestsFailed = 0;

        int[][] matrix = new int[][]{{42}};
        int expectedIntOutput = 42;
        if (!testSum(matrix, expectedIntOutput)) {
            sumMethodTestsFailed++;
        }

        matrix = new int[][]{{3}, {-2}, {-33}, {22}, {333}, {-22}};
        expectedIntOutput = 301;
        if (!testSum(matrix, expectedIntOutput)) {
            sumMethodTestsFailed++;
        }

        matrix = new int[][]{{1, 2, 3, 4}, {11, 22, 33, 44}, {21, 22, 23, 24}};
        expectedIntOutput = 210;
        if (!testSum(matrix, expectedIntOutput)) {
            sumMethodTestsFailed++;
        }

        matrix = new int[][]{{71, 94, 11, -54}, {31, -54, 18, -22}, {41, 42, 43, 94}};
        expectedIntOutput = 315;
        if (!testSum(matrix, expectedIntOutput)) {
            sumMethodTestsFailed++;
        }

        matrix = new int[][]{{4}, {33, 44}, {222, 333, 444, 555, 666}, {1111, 2222, 3333}};
        expectedIntOutput = 8967;
        if (!testSum(matrix, expectedIntOutput)) {
            sumMethodTestsFailed++;
        }

        matrix = new int[][]{{-1, -2, -3, -4}, {-11, -22, -33, -44}, {-210, -220, -230, -240}};
        expectedIntOutput = -1020;
        if (!testSum(matrix, expectedIntOutput)) {
            sumMethodTestsFailed++;
        }


        // --- sum summary ----------------------------------------------------
        if (sumMethodTestsFailed == 0) {
            System.out.println("\n*** The sum method passed all tests!\n");
        } else if (sumMethodTestsFailed == 1) {
            System.out.println("\n*** The sum method passed all but one test- getting close!\n");
        } else {
            System.out.println("\n*** The sum method failed " + sumMethodTestsFailed + " tests. More work to do...\n");
        }

        // --- min ------------------------------------------------------------
        System.out.println("--- testing min method ------------------------------------------------\n");
        int minMethodTestsFailed = 0;

        matrix = new int[][]{{42}};
        expectedIntOutput = 42;
        if (!testMin(matrix, expectedIntOutput)) {
            minMethodTestsFailed++;
        }

        matrix = new int[][]{{3}, {-2}, {-33}, {22}, {333}, {-22}};
        expectedIntOutput = -33;
        if (!testMin(matrix, expectedIntOutput)) {
            minMethodTestsFailed++;
        }

        matrix = new int[][]{{1, 2, 3, 4}, {11, 22, 33, 44}, {21, 22, 23, 24}};
        expectedIntOutput = 1;
        if (!testMin(matrix, expectedIntOutput)) {
            minMethodTestsFailed++;
        }

        matrix = new int[][]{{71, 94, 11, -54}, {31, -54, 18, -22}, {41, 42, 43, 94}};
        expectedIntOutput = -54;
        if (!testMin(matrix, expectedIntOutput)) {
            minMethodTestsFailed++;
        }

        matrix = new int[][]{{4}, {33, 44}, {222, 333, 444, 555, 666}, {1111, 2222, 3333}};
        expectedIntOutput = 4;
        if (!testMin(matrix, expectedIntOutput)) {
            minMethodTestsFailed++;
        }

        matrix = new int[][]{{-1, -2, -3, -4}, {-11, -22, -33, -44}, {-210, -220, -230, -240}};
        expectedIntOutput = -240;
        if (!testMin(matrix, expectedIntOutput)) {
            minMethodTestsFailed++;
        }


        // --- min summary ----------------------------------------------------
        if (minMethodTestsFailed == 0) {
            System.out.println("\n*** The min method passed all tests!\n");
        } else if (minMethodTestsFailed == 1) {
            System.out.println("\n*** The min method passed all but one test- getting close!\n");
        } else {
            System.out.println("\n*** The min method failed " + minMethodTestsFailed + " tests. More work to do...\n");
        }

        // --- sumRows --------------------------------------------------------
        System.out.println("--- testing sumRows method --------------------------------------------\n");
        int sumRowsMethodTestsFailed = 0;

        matrix = new int[][]{{42}};
        int[] expectedArrOutput = new int[]{42};
        if (!testSumRows(matrix, expectedArrOutput)) {
            sumRowsMethodTestsFailed++;
        }

        matrix = new int[][]{{3}, {-2}, {-33}, {22}, {333}, {-22}};
        expectedArrOutput = new int[]{ 3, -2, -33, 22, 333, -22};
        if (!testSumRows(matrix, expectedArrOutput)) {
            sumRowsMethodTestsFailed++;
        }

        matrix = new int[][]{{1, 2, 3, 4}, {11, 22, 33, 44}, {21, 22, 23, 24}};
        expectedArrOutput = new int[]{ 10, 110, 90};
        if (!testSumRows(matrix, expectedArrOutput)) {
            sumRowsMethodTestsFailed++;
        }

        matrix = new int[][]{{71, 94, 11, -54}, {31, -54, 18, -22}, {41, 42, 43, 94}};
        expectedArrOutput = new int[]{ 122, -27, 220};
        if (!testSumRows(matrix, expectedArrOutput)) {
            sumRowsMethodTestsFailed++;
        }

        matrix = new int[][]{{4}, {33, 44}, {222, 333, 444, 555, 666}, {1111, 2222, 3333}};
        expectedArrOutput = new int[]{ 4, 77, 2220, 6666};
        if (!testSumRows(matrix, expectedArrOutput)) {
            sumRowsMethodTestsFailed++;
        }

        matrix = new int[][]{{-1, -2, -3, -4}, {-11, -22, -33, -44}, {-210, -220, -230, -240}};
        expectedArrOutput = new int[]{ -10, -110, -900};
        if (!testSumRows(matrix, expectedArrOutput)) {
            sumRowsMethodTestsFailed++;
        }


        // --- sumRows summary ------------------------------------------------
        if (sumRowsMethodTestsFailed == 0) {
            System.out.println("\n*** The sumRows method passed all tests!\n");
        } else if (sumRowsMethodTestsFailed == 1) {
            System.out.println("\n*** The sumRows method passed all but one test- getting close!\n");
        } else {
            System.out.println("\n*** The sumRows method failed " + sumRowsMethodTestsFailed + " tests. More work to do...\n");
        }
    }
}
