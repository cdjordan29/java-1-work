/**
 * LabQuiz6Srv.java - methods that operate on 2D arrays
 *
 * @author Shawn Brenneman
 * @version 11/30/2015
 */
public class LabQuiz6Srv {

    //-----------------------------------------------------------------
    // indexOfLargestRow - takes a 2D array of ints and returns the 
    //                     index of the row with the largest sum.  If
    //                     the array is empty, returns -1.
    //-----------------------------------------------------------------
    public int indexOfLargestRowSum(int[][] nums2d) {
        int maxSum = -1000;
        int sumOfRows = 0;
        int highestRow = 0;
        if(nums2d.length == 0)
        {
            highestRow = -1;
        }
        else
        {
            for(int row = 0; row < nums2d.length; row++)
            {
                for(int col = 0; col < nums2d[row].length; col++)
                {
                    sumOfRows += nums2d[row][col];
                }
                if(sumOfRows > maxSum)
                {
                    maxSum = sumOfRows;
                    highestRow = row;
                }
                sumOfRows = 0;
            }
        }
            return highestRow;
    }

    //-----------------------------------------------------------------
    // largestRowSum - takes a 2D array of ints, and returns the 
    //                 largest sum of all numbers in a row.  If the
    //                 array is empty, returns 0.
    //-----------------------------------------------------------------
    public int largestRowSum(int[][] nums2d) {
        int maxSum = -1000;
        int sumOfRows = 0;
        if(nums2d.length == 0)
        {
            maxSum = 0;
        }
        else
        {
            for(int row = 0; row < nums2d.length; row++)
            {
                for(int col = 0; col < nums2d[row].length; col++)
                {
                    sumOfRows += nums2d[row][col];
                }
                if(sumOfRows > maxSum)
                {
                    maxSum = sumOfRows;
                }
                sumOfRows = 0;
            }
        }
        return maxSum;
    }

    //-----------------------------------------------------------------
    // allPos - takes a 2D array of ints and returns true if all the
    //          integers in the 2D array are positive.  0 is neither
    //          positive or negative.  If the array is empty, returns
    //          false.
    //-----------------------------------------------------------------
    public boolean allPos(int[][] nums2d) {
        boolean isPositive = true;
        
        if(nums2d.length == 0){
            isPositive = false;
        }
        else{
            for(int row = 0; row < nums2d.length; row++)
            {
                for(int col = 0; col < nums2d[row].length; col++)
                {
                    if(nums2d[row][col] <= 0)
                    {
                        isPositive = false;
                    }
                }
            }    
        }
        return isPositive; 
    }

    //-----------------------------------------------------------------
    // allDigits - takes a 2D array of characters and answers if every
    //             char in the array is a digit.  If the array is
    //             empty, returns false.
    //-----------------------------------------------------------------
    public boolean allDigits(char[][] chars2d) {
        boolean isDigit = true;
        
        if(chars2d.length == 0){
            isDigit = false;
        }
        else{
            for(int row = 0; row < chars2d.length; row++)
            {
                for(int col = 0; col < chars2d[row].length; col++)
                {
                    if(chars2d[row][col] < '0' || chars2d[row][col] > '9')
                    {
                        isDigit = false;
                    }
                }
            }
        }
        return isDigit;
    }

    //-----------------------------------------------------------------
    //  isJagged - takes a 2D array of ints and returns true only if
    //             the array is jagged.  If the array is empty, returns
    //             false.
    //-----------------------------------------------------------------
    public boolean isJagged(int[][] nums2d) {
        boolean isJagged = false;
        int countRow1 = 0;
        int countRow2 = 0;
        for(int row = 0; row < nums2d.length; row++)
            {
                for(int col = 0; col < nums2d[row].length; col++)
                {
                   countRow1 = nums2d[0].length;
                   countRow2 = nums2d[row].length;
                   if(countRow1 != countRow2)
                   {
                       isJagged = true;
                   }
                }
            }
        
        return isJagged;
    }

    //-----------------------------------------------------------------
    //  rows2strings - takes a 2D array of char and returns a one
    //                 dimensional array of Strings where each String
    //                 is all the characters in a row concatenated
    //                 together.
    //-----------------------------------------------------------------
    public String[] rows2strings(char[][] chars2d) {
        String[] newArr = new String[chars2d.length];
        int count = 0;
        for(int row = 0; row < chars2d.length; row++)
        {
            newArr[row] = "";
            for(int col = 0; col < chars2d[row].length; col++)
            {
                newArr[count] += chars2d[row][col];
            }
            count++;
        }
        
        
        return newArr;
    }

    //-----------------------------------------------------------------
    //  isMirror - takes two arrays of chars and returns true if one
    //             array is exactly like the other except with the
    //             order reversed.
    //-----------------------------------------------------------------
    public boolean isMirror(char[] arr1, char[] arr2) {
        boolean isMirror = true;
        
        if(arr1.length != arr2.length)
        {
            isMirror = false;
        }
        else
        {
            for(int i = 0, j = (arr2.length -1); i < arr1.length; i++, j--)
            {
                if(arr1[i] != arr2[j])
                {
                    isMirror = false;
                }
            }
        }
        return isMirror;
    }


}
