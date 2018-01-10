/**
  * A SudokuCube represents the data for a suduko puzzle.  It is comprised of an array of 81
  * cells. Each cell contains a char value. Valid values are ' ' (EMPTY) or '1' through '9'.
  *
  * For a diagram of the cube coordinates, see: 
  * http://www.radford.edu/asbrennem/itec120/hw/HW9/description.html
  *
  * The convention for cell numbering is as follows:
  * The cells are indexed by [row][col], and both indices are 1-based.
  * The top left cell is [1][1], the cell to the right of it is [1][2].
  * The cell below [1][1] is [2][1].
  *
  * We may refer to the row and column of cube in the conventional sense, just as we would an
  * ordinary array.
  *
  * We may also refer to 9 blocks within the cube.  A block consists of nine cells in a 3x3
  * subarray.  There are three rows of three blocks.
  *
  * The convention for block numbering is as follows:
  * The top left block is 1, the one to the right of it is 2, the one to the right of it is 3.
  * The leftmost block in the middle row is 4.
  * The bottom right block is 9.
  *
  * For the sudoku cube to be in a "correct" state, each row, column, and block may not contain
  * any duplicates other than EMPTY; that is: a 1 may only occur only once, a 2 may occur
  * only once, etc.  EMPTY may occur any number of times.
  *
  * For the sudoku cube to be in a "complete" status, each row, column, and block must be
  * correct and there may be no empty cells.
  */
public class SudokuCube {
public static final char EMPTY = ' ';

private char[][] cell = new char[10][10];

public SudokuCube() {
    this("                                                                                 ");
}

/**
 * @param contents An 81 character string that denotes the values with which the cells
 * will be initialized. The load sequence fills row 1 with the first nine values, row 2
 * with the next nine values, and so on.
 */
public SudokuCube(String contents) {
    if (contents.length() != 81) {
        throw new RuntimeException("SudokuCube constructor called with contents intialization String \""
                            + contents + "\", which is length " + contents.length()
                            + ".  Contents must be exactly 81 characters in length.");
    }
    int contentsIndex = 0;
    for (int row = 1; row <= 9; row++) {
        for (int col = 1; col <= 9; col++) {
            // the fillCell call will validate the cell contents.
            fillCell(row, col, contents.charAt(contentsIndex));
            contentsIndex++;
        }
    }
}

public String toString()
{
    String output = " ";
    
    return output;
}

public void fillCell(int row, int col, char value) {
    validateIndex(row);
    validateIndex(col);
    validateValue(value);
    cell[row][col] = value;
}

public int getCell(int row, int col) {
    validateIndex(row);
    validateIndex(col);
    return cell[row][col];
}

public void validateIndex(int index) throws IndexOutOfBoundsException {
    if (index < 1 || index > 9) {
        throw new IndexOutOfBoundsException("SudokuCube: Attempt to access index as " + index
                                            + ".  Valid indices are 1 through 9 (inclusive).");
    }
}

public void validateValue(char value) throws RuntimeException {
    if (value != ' ' && (value < '1' || value > '9')) {
        throw new RuntimeException("SudokuCube: Attempt to set value of " + value
                                    + ".  Valid values are empty ('" + EMPTY
                                    + "'), and '1' through '9' inclusive.");
    }
}

public char[] getRow(int row) {
    // YOUR CODE HERE
    validateIndex(row);
    validateValue((char)row);
    return new char[] {};
}

public char[] getColumn(int col) {
    // YOUR CODE HERE
    validateIndex(col);
    validateValue((char)col);
    return new char[] {};
}

public char[][] getBlock(int block) {
    // YOUR CODE HERE
    return new char[][] {};
}

public boolean isRowCorrect(int row) {
    // YOUR CODE HERE
    boolean correct = true;
    
    
    
    return correct;
}

public boolean isColumnCorrect(int col) {
    // YOUR CODE HERE
    boolean correct = true;
    
    
    
    return correct;
}

public boolean isBlockCorrect(int block) {
    // YOUR CODE HERE
    boolean correct = true;
    
    
    
    return correct;
}

public boolean isRowComplete(int row) {
    // YOUR CODE HERE
    boolean complete = true;
    
    
    
    return complete;
}

public boolean isColumnComplete(int col) {
    // YOUR CODE HERE
    boolean complete = true;
    
    
    
    return complete;
}

public boolean isBlockComplete(int block) {
    // YOUR CODE HERE
    boolean complete = true;
    
    
    
    return complete;
}

public boolean isCubeComplete() {
    // YOUR CODE HERE
    boolean complete = true;
    
    
    
    return complete;
}
}
