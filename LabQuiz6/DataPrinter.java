/**
 * DataPrinter.java - utility methods for use in printing test data.
 *
 * @author Matt Labarge
 * @version 2016 Apr 15
 */
import java.util.*;

public class DataPrinter {

private final int LABEL_OVERHEAD = 4;
private int prefix = 0;

public DataPrinter() {
    this(0);
}

/** @param prefix the number of blank spaces that appear before any printed data. */
public DataPrinter(int prefix) {
    this.prefix = prefix;
}

/** @param prefix the number of blank spaces that appear before any printed data. */
public void setSpacePrefix(int prefix) {
    this.prefix = prefix;
}

/** @return the number of blank spaces that appear before any printed data. */
public int getSpacePrefix() {
    return prefix;
}

private static String space(int length) {
    StringBuilder sb = new StringBuilder();
    for (int ii = 0; ii < length; ii++) {
        sb.append(" ");
    }
    return sb.toString();
}

public static String intArrToString(int[] arr) {
    int[] minWidths = new int[arr.length];
    return intArrToString(arr, minWidths);
}

public static String intArrToString(int[] arr, int[] minWidths) {
    StringBuilder sb = new StringBuilder("{");
    for (int ii = 0; ii < arr.length; ii++) {
        String elem = "" + arr[ii];
        if (elem.length() < minWidths[ii]) {
            sb.append(space(minWidths[ii] - elem.length()));
        }
        sb.append(arr[ii]);
        if (ii < arr.length - 1) {
            sb.append(", ");
        }
    }
    sb.append("}");
    return sb.toString();
}

public void print2dIntArray(String label, int[][] arr) {
    print2dIntArray(label, arr, true);
}

public void print2dIntArray(String label, int[][] arr, boolean justify) {
    if (arr.length == 0) {
        System.out.println(space(prefix) + label + ": {}");
        return;
    }

    int longestRow = 0;
    for (int row = 0; row < arr.length; row++) {
        if (arr[row].length > longestRow) {
            longestRow = arr[row].length;
        }
    }

    // maxWidths will contain the max width of each column if justify is true.
    int[] maxWidths = new int[longestRow];

    if (justify) {
        for (int col = 0; col < longestRow; col++) {
            for (int row = 0; row < arr.length; row++) {
                if (arr[row].length > col) {
                    String str = "" + arr[row][col];
                    if (str.length() > maxWidths[col]) {
                        maxWidths[col] = str.length();
                    }
                }
            }
        }
    }

    for (int row = 0; row < arr.length; row++) {
        if (row == 0) {
            System.out.print(space(prefix) + label + ": { ");
        } else {
            System.out.print(space(prefix + LABEL_OVERHEAD + label.length()));
        }
        System.out.print(intArrToString(arr[row], maxWidths));
        if (row == arr.length - 1) {
            System.out.println(" }");
        } else {
            System.out.println();
        }
    }
}

public static String charArrToString(char[] arr) {
    StringBuilder sb = new StringBuilder("{");
    for (int ii = 0; ii < arr.length; ii++) {
        sb.append("'");
        sb.append(arr[ii]);
        if (ii < arr.length - 1) {
            sb.append("',");
        } else {
            sb.append("'");
        }
    }
    sb.append("}");
    return sb.toString();
}

public void print2dCharArray(String label, char[][] arr) {
    if (arr.length == 0) {
        System.out.println(space(prefix) + label + ": {}");
        return;
    }

    for (int row = 0; row < arr.length; row++) {
        if (row == 0) {
            System.out.print(space(prefix) + label + ": { ");
        } else {
            System.out.print(space(prefix + LABEL_OVERHEAD + label.length()));
        }
        System.out.print(charArrToString(arr[row]));
        if (row == arr.length - 1) {
            System.out.println(" }");
        } else {
            System.out.println();
        }
    }
}

public static String strArrToString(String[] arr) {
    StringBuilder sb = new StringBuilder("{");
    for (int ii = 0; ii < arr.length; ii++) {
        sb.append("\"");
        sb.append(arr[ii]);
        if (ii < arr.length - 1) {
            sb.append("\",");
        } else {
            sb.append("\"");
        }
    }
    sb.append("}");
    return sb.toString();
}
}
