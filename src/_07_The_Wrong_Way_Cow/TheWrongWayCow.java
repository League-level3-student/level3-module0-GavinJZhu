/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {
    static int cowsNorth = 0;
    static int cowsSouth = 0;
    static int cowsWest = 0;
    static int cowsEast = 0;

    public static int[] findWrongWayCow(final char[][] field) {
        int[] coordinates = new int[]{0,0};
        for (int i = 0; i<field.length; i++){
            for (int j = 0; j<field[i].length; i++){
                initiateCowInts(field, i, j);
            }
        }
        for (int i = 0; i<field.length; i++){
            for (int j = 0; j<field[i].length; i++){
                if (field[i][j] == 'c'){
                    if(isCowFacingNorth(field, i, j) && cowsNorth==1){
                        coordinates = new int[]{i, j};
                        System.out.println(i+", "+j);
                        break;
                    }
                    else if(isCowFacingSouth(field, i, j) && cowsSouth==1){
                        coordinates = new int[]{i, j};
                        System.out.println(i+", "+j);
                        break;
                    }
                    else if(isCowFacingWest(field, i, j) && cowsWest==1){
                        coordinates = new int[]{i, j};
                        System.out.println(i+", "+j);
                        break;
                    }
                    else if(isCowFacingEast(field, i, j) && cowsEast==1){
                        coordinates = new int[]{i, j};
                        System.out.println(i+", "+j);
                        break;
                    }
                }
            }
        }

        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        return coordinates;
    }
    public static void initiateCowInts(final char[][] location, int row, int col){
        //check north
        if (location[row][col] == 'c'){
            if (location[row-1][col] == 'o'){
                if (location[row-2][col] == 'w'){
                    cowsNorth +=1;
                }
            }
        }
        //check south
        if (location[row][col] == 'c'){
            if (location[row+1][col] == 'o'){
                if (location[row+2][col] == 'w'){
                    cowsSouth +=1;
                }
            }
        }
        //check east
        if (location[row][col] == 'c'){
            if (location[row][col+1] == 'o'){
                if (location[row][col+2] == 'w'){
                    cowsEast +=1;
                }
            }
        }
        //check west
        if (location[row][col] == 'c'){
            if (location[row][col-1] == 'o'){
                if (location[row][col-2] == 'w'){
                    cowsWest +=1;
                }
            }
        }
    }
    public static boolean isCowFacingNorth(final char[][] location, int row, int col){
        //check north
        boolean isFacingNorth = false;
        if (location[row][col] == 'c'){
            if (location[row-1][col] == 'o'){
                if (location[row-2][col] == 'w'){
                    isFacingNorth = true;
                }
            }
        }
        return isFacingNorth;
    }
    public static boolean isCowFacingSouth(final char[][] location, int row, int col){
        //check south
        boolean isFacingSouth = false;
        if (location[row][col] == 'c'){
            if (location[row+1][col] == 'o'){
                if (location[row+2][col] == 'w'){
                    isFacingSouth = true;
                }
            }
        }
        return isFacingSouth;
    }
    public static boolean isCowFacingEast(final char[][] location, int row, int col){
        //check east
        boolean isFacingEast = false;
        if (location[row][col] == 'c'){
            if (location[row][col+1] == 'o'){
                if (location[row][col+2] == 'w'){
                    isFacingEast = true;
                }
            }
        }
        return isFacingEast;
    }
    public static boolean isCowFacingWest(final char[][] location, int row, int col){
        //check west
        boolean isFacingWest = false;
        if (location[row][col] == 'c'){
            if (location[row][col-1] == 'o'){
                if (location[row][col-2] == 'w'){
                    isFacingWest = true;
                }
            }
        }
        return isFacingWest;
    }
}
