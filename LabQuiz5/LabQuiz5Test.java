/***********************
 *
 *   LabQuiz5Test.java  Tests for lab quiz 5 solutions. 
 *                      This will exercise your LabQuiz5Srv object.
 *
 *   Written by:   Shawn Brenneman
 *
 *   Date:     2016-Mar-30
 *
 ***********************/

import java.util.*;

public class LabQuiz5Test {

public static void main(String[] args) {
    LabQuiz5Srv obj = new LabQuiz5Srv();
    String outStr = "";
    boolean sectionPasses = true;

 //---------------------------------------------------------------------------
 //  multString - returns a String that is str concatenated num times
 //
 //  multString(5,"*-") --> "*-*-*-*-*-"
 //  multString(2,"ha.") --> "ha.ha."
 //  multString(1,"Yay!") --> "Yay!"
 //  multString(0,"Oink") --> ""
 //  multString(-3,"Hey") --> ""
 //

    System.out.println("---- METHOD multString ---------------------------------------------------------");
    sectionPasses = true;

    String resultStr = obj.multString(5,"*-");
    String strExpected = "*-*-*-*-*-";
    outStr = "multString(5,\"*-\") --> \"" + resultStr + "\"";
    if (strExpected.equals(resultStr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + strExpected + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    resultStr = obj.multString(2,"ha.");
    strExpected = "ha.ha.";
    outStr = "multString(2,\"ha.\") --> \"" + resultStr + "\"";
    if (strExpected.equals(resultStr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + strExpected + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    resultStr = obj.multString(1,"Yay!");
    strExpected = "Yay!";
    outStr = "multString(1,\"Yay!\") --> \"" + resultStr + "\"";
    if (strExpected.equals(resultStr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + strExpected + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);
    
    resultStr = obj.multString(0,"Oink");
    outStr = "multString(0,\"Oink\") --> \"" + resultStr + "\"";
    if ("".equals(resultStr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected empty String)";
        sectionPasses = false;
    }
    System.out.println(outStr);

    resultStr = obj.multString(-3,"Hey");
    outStr = "multString(-3,\"Hey\") --> \"" + resultStr + "\"";
    if ("".equals(resultStr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected empty String)";
        sectionPasses = false;
    }
    System.out.println(outStr);

    if (sectionPasses) {
        System.out.println("\nWOO HOO!  Method multString passes all the tests!");
    }
    System.out.println();

 //----------------------------------------------------------------------------
 //  odds - gets an array of ints as a parameter, and returns an array of 
 //         just the odd ints in the given array.
 //         The returned array is exactly the size needed to hold the odd numbers.
 //
 //  odds({7,3,2,9,6,15}) --> {7,3,9,15}
 //  odds({3,4,5,6,6}) --> {3,5}
 //  odds({8,4,8,16})  --> {}
 //  odds({3}) --> {3}
 //  odds({}) --> {}
 //

    System.out.println("---- METHOD odds ---------------------------------------------------------------");
    sectionPasses = true;

    int[] intArray = new int[] {7, 3, 2, 9, 6, 15};
    int[] resultArr = obj.odds(intArray);
    int[] expectedArr = new int[] {7, 3, 9, 15};
    outStr = "obj.odds({7,3,2,9,6,15}) --> " + Arrays.toString(resultArr);
    if (Arrays.equals(resultArr, expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    intArray = new int[] {3,4,5,6,6};
    resultArr = obj.odds(intArray);
    expectedArr = new int[] {3, 5};
    outStr = "obj.odds({3,4,5,6,6}) --> " + Arrays.toString(resultArr);
    if (Arrays.equals(resultArr, expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    intArray = new int[] {8,4,8,16};
    resultArr = obj.odds(intArray);
    expectedArr = new int[] {};
    outStr = "obj.odds({8,4,8,16}) --> " + Arrays.toString(resultArr);
    if (Arrays.equals(resultArr, expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    intArray = new int[] {3};
    resultArr = obj.odds(intArray);
    expectedArr = new int[] {3};
    outStr = "obj.odds({3}) --> " + Arrays.toString(resultArr);
    if (Arrays.equals(resultArr, expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    intArray = new int[] {};
    resultArr = obj.odds(intArray);
    expectedArr = new int[] {};
    outStr = "obj.odds({}) --> " + Arrays.toString(resultArr);
    if (Arrays.equals(resultArr, expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr + " (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    if (sectionPasses) {
        System.out.println("\nWOO HOO!  Method odds passes all the tests!");
    }
    System.out.println();

 //----------------------------------------------------------------------------
 //  containsDigit - answers if the given String contains a Digit 
 //
 //  containsDigit("867-5309") --> true
 //  containsDigit("Not a number") --> false
 //  containsDigit("") --> false
 //  containsDigit("jsmith0@gmail.com") --> true
 //

    System.out.println("---- METHOD containsDigit ------------------------------------------------------");
    sectionPasses = true;

    outStr = "containsDigit(\"867-5309\") --> ";
    if (obj.containsDigit("867-5309")) {
        outStr = "      " + outStr + "true";
    } else {
        outStr = "FAIL: " + outStr + "false (expected true)";
        sectionPasses = false;
    }
    System.out.println(outStr);

    outStr = "containsDigit(\"there's no number finer than a 9er.\") --> ";
    if (obj.containsDigit("there's no number finer than a 9er.")) {
        outStr = "      " + outStr + "true";
    } else {
        outStr = "FAIL: " + outStr + "false (expected true)";
        sectionPasses = false;
    }
    System.out.println(outStr);

    outStr = "containsDigit(\"Not a number\") --> ";
    if (obj.containsDigit("Not a number")) {
        outStr = "FAIL: " + outStr + "true (expected false)";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr + "false";
    }
    System.out.println(outStr);

    outStr = "containsDigit(\"\") --> ";
    if (obj.containsDigit("")) {
        outStr = "FAIL: " + outStr + "true (expected false)";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr + "false";
    }
    System.out.println(outStr);

    outStr = "containsDigit(\"jsmith0@gmail.com\") --> ";
    if (obj.containsDigit("jsmith0@gmail.com")) {
        outStr = "      " + outStr + "true";
    } else {
        outStr = "FAIL: " + outStr + "false (expected true)";
        sectionPasses = false;
    }
    System.out.println(outStr);



    if (sectionPasses) {
        System.out.println("\nWOO HOO!  Method containsDigit passes all the tests!");
    }
    System.out.println();

 //----------------------------------------------------------------------------
 //  merge - takes two arrays and returns one array that contains all of the
 //          elements from both arrays interleaved such that the first element
 //          of the first array is in the first position, the first element of
 //          the second array is in the second position, and so on.
 //
 //  merge({55, 22}, {9, 6}) --> {55, 9, 22, 6}
 //  merge({1, 3}, {2, 4})--> {1, 2, 3, 4}
 //  merge({1}, {44, 22}) --> {1, 44, 22}
 //  merge({3, 1}, {77}) --> {3, 77, 1}
 //  merge({11, 22, 33, 44, 55}, {777, 888, 999}) --> {11, 777, 22, 888, 33, 999, 44, 55}
 //  merge({}, {}) --> {}
 //  merge({1}, {}) --> {1}
 //  merge({}, {4}) --> {4}

    System.out.println("---- METHOD merge -------------------------------------------------------------");
    sectionPasses = true;

    int[] arr1 = new int[] {55, 22};
    int[] arr2 = new int[] {9, 6};
    expectedArr = new int[] {55, 9, 22, 6};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {1, 3};
    arr2 = new int[] {2, 4};
    expectedArr = new int[] {1, 2, 3, 4};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {1};
    arr2 = new int[] {44, 22};
    expectedArr = new int[] {1, 44, 22};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {3, 1};
    arr2 = new int[] {77};
    expectedArr = new int[] {3, 77, 1};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {11, 22, 33, 44, 55};
    arr2 = new int[] {777, 888, 999};
    expectedArr = new int[] {11, 777, 22, 888, 33, 999, 44, 55};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {};
    arr2 = new int[] {};
    expectedArr = new int[] {};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {1};
    arr2 = new int[] {};
    expectedArr = new int[] {1};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    arr1 = new int[] {};
    arr2 = new int[] {4};
    expectedArr = new int[] {4};
    resultArr = obj.merge(arr1, arr2);
    outStr = "merge(" + Arrays.toString(arr1) + ", " + Arrays.toString(arr2)
            + ") -> " + Arrays.toString(resultArr);
    if (Arrays.equals(obj.merge(arr1, arr2), expectedArr)) {
        outStr = "      " + outStr;
    } else {
        outStr = "FAIL: " + outStr +" (expected " + Arrays.toString(expectedArr) + ")";
        sectionPasses = false;
    }
    System.out.println(outStr);

    if (sectionPasses) {
        System.out.println("\nWOO HOO!  Method merge passes all the tests!");
    }
    System.out.println();

 //----------------------------------------------------------------------------
 //  isValid - takes an array of characters and returns true only if the array
 //            is valid. The array is valid only if every lowercase character
 //            in the array is immediately followed by an uppercase character.
 //  
 //  isValid({}) --> true 
 //  isValid({'X'}) --> true 
 //  isValid({'a'}) --> false 
 //  isValid({'a', 'X'}) --> true 
 //  isValid({'f', 'g', 'H'}) --> false 
 //  isValid({'4', 'H', 'G'}) --> true  
 //  isValid({'2', 'P', 'c'}) --> false 
 //  isValid({'b', 'C', 'd'}) --> false
 //  isValid({'b', 'C', 'd', 'T', 'E', '*', 'w', 'Q'}) --> true

    System.out.println("---- METHOD isValid -----------------------------------------------------------");
    sectionPasses = true;

    char[] seq = new char[] {};
    boolean boolExpected = true;
    boolean boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'X'};
    boolExpected = true;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'a'};
    boolExpected = false;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'f', 'g', 'H'};
    boolExpected = false;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'4', 'H', 'G'};
    boolExpected = true;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'2', 'P', 'c'};
    boolExpected = false;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'b', 'C', 'd'};
    boolExpected = false;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    seq = new char[] {'b', 'C', 'd', 'T', 'E', '*', 'w', 'Q'};
    boolExpected = true;
    boolResult = obj.isValid(seq);
    outStr = "isValid(" + Arrays.toString(seq) + ") --> " + (boolResult?"true":"false");
    if (boolResult ^ boolExpected) {
        outStr = "FAIL: " + outStr + " (expected " + (boolExpected?"true":"false") + ")";
        sectionPasses = false;
    } else {
        outStr = "      " + outStr;
    }
    System.out.println(outStr);

    if (sectionPasses) {
        System.out.println("\nWOO HOO!  Method isValid passes all the tests!");
    }
    System.out.println();
 }
}
