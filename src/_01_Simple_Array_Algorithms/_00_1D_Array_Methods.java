package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
    public static int sumIntArray(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        double average = sum / values.length;
        return average;
    }


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
        boolean i = false;
        for(int number : array){
            if (number == value) {
                i = true;
                break;
            }
        }
        return i;
    }

    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == value){
                index = i;
                return index;
            }
            else {
                index = -1;
            }
        }
        return index;
    }
}
