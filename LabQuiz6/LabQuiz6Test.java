/**
 * LabQuiz6Test.java - Tests methods of LabQuiz6Srv class.
 *
 * @author Matt Labarge and Shawn Brenneman
 * @version 11/30/2015, modified 4/13/2016
 */
import java.util.*;

public class LabQuiz6Test {

public static final DataPrinter dp = new DataPrinter(6);

public static boolean testIndexOfLargestRowSum(int[][] input, int expectedOutput) {
    boolean testPassed = true;
    dp.print2dIntArray("input", input);
    int output = obj.indexOfLargestRowSum(input);
    if (output == expectedOutput) {
        System.out.println("      indexOfLargestRowSum(input) --> " + output + "\n");
    } else {
        System.out.println("FAIL: indexOfLargestRowSum(input) --> " + output + " (expected " + expectedOutput + ")\n");
        testPassed = false;
    }
    return testPassed;
}

public static boolean testLargestRowSum(int[][] input, int expectedOutput) {
    boolean testPassed = true;
    dp.print2dIntArray("input", input);
    int output = obj.largestRowSum(input);
    if (output == expectedOutput) {
        System.out.println("      largestRowSum(input) --> " + output + "\n");
    } else {
        System.out.println("FAIL: largestRowSum(input) --> " + output + " (expected " + expectedOutput + ")\n");
        testPassed = false;
    }
    return testPassed;
}

public static boolean testAllPos(int[][] input, boolean expectedOutput) {
    boolean testPassed = true;
    dp.print2dIntArray("input", input);
    boolean output = obj.allPos(input);
    if (! output ^ expectedOutput) {
        System.out.println("      allPos(input) --> " + output + "\n");
    } else {
        System.out.println("FAIL: allPos(input) --> " + output + " (expected " + expectedOutput + ")\n");
        testPassed = false;
    }
    return testPassed;
}

public static boolean testAllDigits(char[][] input, boolean expectedOutput) {
    boolean testPassed = true;
    dp.print2dCharArray("input", input);
    boolean output = obj.allDigits(input);
    if (! output ^ expectedOutput) {
        System.out.println("      allDigits(input) --> " + output + "\n");
    } else {
        System.out.println("FAIL: allDigits(input) --> " + output + " (expected " + expectedOutput + ")\n");
        testPassed = false;
    }
    return testPassed;
}

public static boolean testIsJagged(int[][] input, boolean expectedOutput) {
    boolean testPassed = true;
    dp.print2dIntArray("input", input);
    boolean output = obj.isJagged(input);
    if (! output ^ expectedOutput) {
        System.out.println("      isJagged(input) --> " + output + "\n");
    } else {
        System.out.println("FAIL: isJagged(input) --> " + output + " (expected " + expectedOutput + ")\n");
        testPassed = false;
    }
    return testPassed;
}

public static boolean testRows2strings(char[][] input, String[] expectedOutput) {
    boolean testPassed = true;
    dp.print2dCharArray("input", input);
    String[] output = obj.rows2strings(input);
    if (Arrays.equals(output, expectedOutput)) {
        System.out.println("      rows2strings(input) --> " + dp.strArrToString(output) + "\n");
    } else {
        System.out.println("FAIL: rows2strings(input) --> " + dp.strArrToString(output) + " (expected " + dp.strArrToString(expectedOutput) + ")\n");
        testPassed = false;
    }
    return testPassed;
}

public static boolean testIsMirror(char[] input1, char[] input2, boolean expectedOutput) {
    boolean testPassed = true;
    System.out.println("      input1: " + dp.charArrToString(input1));
    System.out.println("      input2: " + dp.charArrToString(input2));
    boolean output = obj.isMirror(input1, input2);
    if (! output ^ expectedOutput) {
        System.out.println("      isMirror(input1, input2) --> " + output + "\n");
    } else {
        System.out.println("FAIL: isMirror(input1, input2) --> " + output + " (expected " + expectedOutput + ")\n");
        testPassed = false;
    }
    return testPassed;
}

private static LabQuiz6Srv obj = new LabQuiz6Srv();

public static void main(String args[]) {
    ArrayList<String> summaries = new ArrayList<String>();

    System.out.println("================================================================================");
    System.out.println("  TESTING isMirror");
    System.out.println("--------------------------------------------------------------------------------");

    int testsFailed = 0;

    char[] charArr1 = new char[] {'A', 'k', 'n', 'o', 'w'};
    char[] charArr2 = new char[] {'w', 'o', 'n', 'k', 'A'};
    boolean outBool = true;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {'e', 'i', 'l', 'l', 'i', 'W'};
    charArr2 = new char[] {'W', 'i', 'l', 'l', 'i', 'e'};
    outBool = true;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {'n', 'e', 'v', 'e', 'r', 'o', 'd', 'd', 'o', 'r', 'e', 'v', 'e', 'n'};
    charArr2 = new char[] {'n', 'e', 'v', 'e', 'r', 'o', 'd', 'd', 'o', 'r', 'e', 'v', 'e', 'n'};
    outBool = true;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {'B', 'a', 'r', 'n', 'e', 'y'};
    charArr2 = new char[] {'Y', 'e', 'n', 'r', 'a', 'b'};
    outBool = false;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {'5', '5', '5'};
    charArr2 = new char[] {'5', '5'};
    outBool = false;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {' ', '1', ' '};
    charArr2 = new char[] {' ', '2', ' '};
    outBool = false;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {'p', 'i', 'p'};
    charArr2 = new char[] {'p', 'o', 'p'};
    outBool = false;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    charArr1 = new char[] {};
    charArr2 = new char[] {};
    outBool = true;
    if (!testIsMirror(charArr1, charArr2, outBool)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    String summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  isMirror: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  isMirror: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  isMirror: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");

    System.out.println("================================================================================");
    System.out.println("  TESTING rows2strings");
    System.out.println("--------------------------------------------------------------------------------");

    testsFailed = 0;

    char[][] inCharArr2d = new char[][] {
        {'L', 'i', 's', 't', 'e', 'n'},
        {'t', 'o', ' ', 'm', 'o', 'r', 'e'},
        {'Z', 'e', 'p', 'p', 'e', 'l', 'i', 'n'}};
    String[] outStrArr = new String[] {"Listen","to more","Zeppelin"};
    if (!testRows2strings(inCharArr2d, outStrArr)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'<', '$', '7', '@', '/', '>'},
        {'<', '*', '-', '5', '+', 'e'}};
    outStrArr = new String[] {"<$7@/>","<*-5+e"};
    if (!testRows2strings(inCharArr2d, outStrArr)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'^'},
        {' '},
        {'|'},
        {' '},
        {'v'}};
    outStrArr = new String[] {"^"," ", "|", " ", "v"};
    if (!testRows2strings(inCharArr2d, outStrArr)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {};
    outStrArr = new String[] {};
    if (!testRows2strings(inCharArr2d, outStrArr)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  rows2strings: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  rows2strings: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  rows2strings: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");

    System.out.println("================================================================================");
    System.out.println("  TESTING isJagged");
    System.out.println("--------------------------------------------------------------------------------");

    testsFailed = 0;

    int[][] inIntArr2d = new int[][] {
        {-5, -5, -48, -77, -6},
        {-3, -34, -46, -12, -26},
        {-3, -23, -2, -16},
        {-3, -34, -46, -12, -26}};
    outBool = true;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0, 5, 4, 7, 6},
        {4, 5, 6, 7, 8},
        {23, 24, 25, 26, 27},
        {33, 34, 35, 36, 37},
        {821, 722, 623, 524, 425}};
    outBool = false;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0, 5, 4, 7, 6},
        {23, 24, 25, 26, 27, 4},
        {5, 6, 7, 8},
        {33, 34, 35, 36, 37},
        {821, 722, 623, 524, 425}};
    outBool = true;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {23, 24, 25, 26, 27, 4},
        {0, 5, 4, 7, 6},
        {4, 5, 6, 7, 8},
        {33, 34, 35, 36, 37},
        {821, 722, 623, 524, 425}};
    outBool = true;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0},
        {4},
        {23},
        {33},
        {821}};
    outBool = false;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {{5,3,2}};
    outBool = false;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {};
    outBool = false;
    if (!testIsJagged(inIntArr2d, outBool)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  isJagged: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  isJagged: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  isJagged: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");

    System.out.println("================================================================================");
    System.out.println("  TESTING allDigits");
    System.out.println("--------------------------------------------------------------------------------");

    testsFailed = 0;

    inCharArr2d = new char[][] {{'9'}};
    outBool = true;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {{'a'}};
    outBool = false;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'0'},
        {'4'},
        {'9'}};
    outBool = true;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'0'},
        {'R'},
        {'9'}};
    outBool = false;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'0', '4', '5', '1', '9', '1'},
        {'4', '7', '5', '2', '4', '2', '0'},
        {'9', '1', '0', '3', '0', '4', '3', '6'}};
    outBool = true;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'0', 'a', '5', '1', '9', '1'},
        {'4', '7', '5', '2', '4', '2', '0'},
        {'9', '1', '0', '3', '0', '4', '3', '6'}};
    outBool = false;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'0', '4', '5', '1', '9', '1'},
        {'4', '7', '5', '2', '4', '2', '0'},
        {'9', '1', '0', '3', '0', '4', '*', '6'}};
    outBool = false;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {
        {'0', '4', '5', '1', '9', '1'},
        {'!', '7', '5', '2', '4', '2', '0'},
        {'9', '1', '0', '3', '0', '4', '3', '6'}};
    outBool = false;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    inCharArr2d = new char[][] {};
    outBool = false;
    if (!testAllDigits(inCharArr2d, outBool)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  allDigits: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  allDigits: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  allDigits: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");

    System.out.println("================================================================================");
    System.out.println("  TESTING allPos");
    System.out.println("--------------------------------------------------------------------------------");

    testsFailed = 0;

    inIntArr2d = new int[][] {
        {-5, -5, -48, -77, -6},
        {-3, -34, -46, -12, -26},
        {-3, -23, -2, -16},
        {-3, -34, -46, -12, -26}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {5, -5, -48, -77, -6},
        {-3, -34, -46, -12, -26},
        {-3, -23, -2, -16},
        {-3, -34, -46, -12, 26}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {5, -5, -48, -77, 6},
        {3, -34, -46, -12, 26},
        {3, -23, -2, 16},
        {3, -34, -46, -12, 26}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {5, 5, 48, 77, 6},
        {3, 34, 46, 12, 26},
        {3, 23, -2, 16},
        {3, 34, 46, 12, 26}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {-5, 5, 48, 77, 6},
        {3, 34, 46, 12, 26},
        {3, 23, 2, 16},
        {3, 34, 46, 12, 26}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {5, 5, 48, 77, 6},
        {3, 34, 46, 12, 26},
        {3, 23, 2, 16},
        {3, 34, 46, 12, -26}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {4, 5, 4, 7, 6},
        {4, 5, 6, 7, 8},
        {23, 24, 25, 26, 27},
        {33, 34, 35, 36, 37},
        {821, 722, 6, 524, 425}};
    outBool = true;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {{4, -1}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {{-7, 6}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {{0, 6}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {{6}};
    outBool = true;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {{0}};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {};
    outBool = false;
    if (!testAllPos(inIntArr2d, outBool)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  allPos: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  allPos: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  allPos: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");

    System.out.println("================================================================================");
    System.out.println("  TESTING largestRowSum");
    System.out.println("--------------------------------------------------------------------------------");

    testsFailed = 0;

    inIntArr2d = new int[][] {
        {-5, -5, -48, -77, -6},
        {-3, -34, -46, -12, -26},
        {-3, -23, -2, -16},
        {-7, -3, -86} };
    int outInt = -44;
    if (!testLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0, 5, 4, 7, 6},
        {4, 5, 6, 7, 8},
        {23, 24, 25, 26, 27},
        {33, 34, 35, 36, 37},
        {821, 722, 623, 524, 425, 326, 227}};
    outInt = 3668;
    if (!testLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {4, 5, 6, 7, 8},
        {23, 24, 25, 26, 27},
        {433, 34, 35, 36, 37},
        {0, 5, 4, 7, 6},
        {21, 22, 27}};
    outInt = 575;
    if (!testLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0, 1, 2, 3, 4, 5, 6, 7},
        {1, 2, 3, 4, 5, 6, 7, 8},
        {20, 21, 22, 23, 24, 25, 26, 27},
        {30, 31, 32, 33, 34, 35, 36, 37},
        {420, 421, 422, 423, 424, 425, 426, 427},
        {530, 351, 352, 353, 354, 355, 356, 357}};
    outInt = 3388;
    if (!testLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {780, 1, 2, 3, 4, 5, 6, 7},
        {3, 4, 5, 6, 7, 8},
        {20, -21, 22, -23, 24, 25, 26, -27},
        {30, 31, 32, 33, 34, 35, 36, 37},
        {420, 421, 422, 423, 424, 425, 426, 427},
        {54, 55, 56}};
    outInt = 3388;
    if (!testLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {};
    outInt = 0;
    if (!testLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  largestRowSum: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  largestRowSum: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  largestRowSum: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");

    System.out.println("================================================================================");
    System.out.println("  TESTING indexOfLargestRowSum");
    System.out.println("--------------------------------------------------------------------------------");

    testsFailed = 0;

    inIntArr2d = new int[][] {
        {-5, -5, -48, -77, -6},
        {-3, -34, -46, -12, -26},
        {-3, -23, -2, -16},
        {-7, -3, -86} };
    outInt = 2;
    if (!testIndexOfLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0, 5, 4, 7, 6},
        {4, 5, 6, 7, 8},
        {23, 24, 25, 26, 27},
        {33, 34, 35, 36, 37},
        {821, 722, 623, 524, 425, 326, 227}};
    outInt = 4;
    if (!testIndexOfLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {4, 5, 6, 7, 8},
        {23, 24, 25, 26, 27},
        {433, 34, 35, 36, 37},
        {0, 5, 4, 7, 6},
        {21, 22, 27}};
    outInt = 2;
    if (!testIndexOfLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {0, 1, 2, 3, 4, 5, 6, 7},
        {1, 2, 3, 4, 5, 6, 7, 8},
        {20, 21, 22, 23, 24, 25, 26, 27},
        {30, 31, 32, 33, 34, 35, 36, 37},
        {420, 421, 422, 423, 424, 425, 426, 427},
        {530, 351, 352, 353, 354, 355, 356, 357}};
    outInt = 4;
    if (!testIndexOfLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {
        {780, 1, 2, 3, 4, 5, 6, 7},
        {3, 4, 5, 6, 7, 8},
        {20, -21, 22, -23, 24, 25, 26, -27},
        {30, 31, 32, 33, 34, 35, 36, 37},
        {420, 421, 422, 423, 424, 425, 426, 427},
        {54, 55, 56}};
    outInt = 4;
    if (!testIndexOfLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    inIntArr2d = new int[][] {};
    outInt = -1;
    if (!testIndexOfLargestRowSum(inIntArr2d, outInt)) {
        testsFailed++;
    }

    System.out.println("--------------------------------------------------------------------------------");
    summary = "";
    if (testsFailed == 0) {
        summary = "  SUMMARY:  indexOfLargestRowSum: ALL TESTS PASSED (WOO HOO!)";
    } else if (testsFailed == 1) {
        summary = "  SUMMARY:  indexOfLargestRowSum: So close- all but one test passed!";
    } else {
        summary = "  SUMMARY:  indexOfLargestRowSum: Failed " + testsFailed + " tests.";
    }
    summaries.add(summary);
    System.out.println(summary);
    System.out.println("--------------------------------------------------------------------------------\n");


    System.out.println("================================================================================");
    for (String str : summaries) {
        System.out.println(str);
    }
    System.out.println("================================================================================");
}
}
