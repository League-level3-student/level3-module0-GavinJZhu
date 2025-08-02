package _03_Intro_to_2D_Arrays;

import org.jointheleague.graphical.robot.Robot;

import java.util.Random;

/*
 *  A 2D array is comparable to a matrix/grid ordered by rows and columns.
 *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
 *  can be thought of a 3x3 matrix/grid:
 *                 col0 col1 col2
 *                  \/   \/   \/
 *          row 0  { 1,  2,  3 }
 *          row 1  { 4,  5,  6 }
 *          row 2  { 7,  8,  9 }
 * 
 *  Where row 0 contains the numbers 1, 2, 3.
 *  and column 0 contains the numbers 1, 4, 7.
 * 
 *  Java stores a 2D array in 'row-major order', meaning the row number is
 *  the first number in the square brackets. The row 0 elements are:
 * 
 *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3
 * 
 *  The second number in the square brackets is the column number.
 *  The column 0 elements are:
 * 
 *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
 */
public class _02_2DArrayPractice {
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          0, 1, 2
     *          3, 4, 5
     *          6, 7, 8
     */
    public static void main(String[] args) {
        fillIn2DArray();
        fillIn2DArray2();
    }
    public Integer[][] test1() {
        Integer[][] intGrid = new Integer[3][3];
        return intGrid;
    }
    String[][] stringGrid = new String[2][4];
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          "a", "b", "c", "d",
     *          "e", "f", "g", "e"
     */
    public String[][] test2() {
        String[][] stringGrid = new String[2][4];
        return stringGrid;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          true, false,
     *          false, false,
     *          false, true,
     *          true, true,
     *          true, false
     */
    public Boolean[][] test3() {
        Boolean[][] booleanGrid = new Boolean[5][2];
        return booleanGrid;
    }
    
    /*
     * Draw the grid of values for the following 2D array of ints:
     * Fill in the 2D array with random integers
     *
     * int[][] grid = new int[2][3];
     * 
     * 
     * 
     * Show your teacher the grid you created
     */
    static int[][] grid = new int[2][3];
    static Random rand = new Random();
    public static void fillIn2DArray(){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int ran = rand.nextInt(9);
                grid[i][j] = ran;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + ", ");
            }
            System.out.println();
        }
    }


    /*
     * Draw the grid of values for the following 2D array of Robots
     * Assume all the elements in the 2D array are initialized.
     * 
     * Robot[][] robots = new Robot[4][2];
     * 
     * 
     * 
     * Show your teacher the grid you created
     */
    static Robot[][] robots = new Robot[4][2];
    public static void fillIn2DArray2(){
        for (int i = 0; i < robots.length; i++) {
            for (int j = 0; j < robots[i].length; j++) {
                System.out.print(robots[i][j] + ", ");
            }
            System.out.println();
        }
    }
    /* Given the array of Objects below, return the element that is not null
     *          null, null, null, null
     *          null, null, null, Object
     */
    public Object test4() {
        Object[][] objects = { {null, null, null, null}, {null, null, null, new Object()} };
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects[0].length; j++) {
                if (objects[i][j] != null){
                    return objects[i][j];
                }
            }
        }
        return null;
    }
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, Object, null
     *          null, null, null, null
     */
    public Object test5() {
        Object[][] objects = { {null, null, new Object(), null}, {null, null, null, null} };
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects[0].length; j++) {
                if (objects[i][j] != null){
                    return objects[i][j];
                }
            }
        }
        return null;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first row (row 0)
     */
    public Integer test6() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int sum = 0;
        for (int i = 0; i<nums[0].length; i++) {
            sum += nums[0][i];
        }
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first column (column 0)
     */
    public Integer test7() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int sum = 0;
        for (int i = 0; i<nums.length; i++) {
            sum += nums[i][0];
        }
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified row
     */
    public Integer getSumByRow(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i<matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified column
     */
    public Integer getSumByColumn(int[][] matrix, int col) {
        int sum = 0;
        for (int i = 0; i<matrix.length; i++) {
            sum += matrix[i][col];
        }
        return sum;
    }
    
    /*
     * Return the value of the element adjacent to the specified row and column
     * The directions East, West, North, South are relative to the 2D array
     * matrix/grid. For example in this 3x3 2D array:
     * 
     *          [1][2][3]
     *          [4][5][6]
     *          [7][8][9]
     * 
     * for the 5 in the middle (row = 1, column = 1), then
     * East neighbor = 6
     * West neighbor = 4
     * North neighbor = 2
     * South neighbor = 8
     * 
     * 1. Assume input row and column values are valid indexes in the matrix.
     * 2. If the neighbor does not exist, i.e. it's outside the grid
     *    boundaries, return null.
     */
    public Integer getEastNeighbor(int[][] matrix, int row, int col) {
        Integer value = null;

        int rowMax = 99;  // TBD
        int colMax = 99;  // TBD

        if ( ( row <0 ) && ( row > rowMax-1))
        {
            // bad row index
            // TBD.  SYSO the index.
        }
        else if (( col < 0 ) && ( col > colMax-1))
        {
            // bad col index
            // TBD.  SYSO the index.
        }
        else
        {
           int east = row + 1;
           if (east > rowMax-1 )
           {
               // bad east index
               // TBD.  SYSO the index.
           }
           else
           {
               // Return East Value...TBD
               // ie set value = ???
           }

        }
        return  value;
    }
    
    public Integer getWestNeighbor(int[][] matrix, int row, int col) {
        return matrix[row-1][col];
    }
    
    public Integer getNorthNeighbor(int[][] matrix, int row, int col) {
        return matrix[row][col-1];
    }
    
    public Integer getSouthNeighbor(int[][] matrix, int row, int col) {
        return matrix[row][col+1];
    }
}
