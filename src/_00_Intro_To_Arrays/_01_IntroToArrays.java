package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
        System.out.println("step 1");
        String[] strings = new String[5];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "c";
        strings[3] = "d";
        strings[4] = "e";
        // 2. print the third element in the array
        System.out.println("step 2");
        System.out.println("third element before change: " + strings[2]);
        // 3. set the third element to a different value
        System.out.println("step 3");
        strings[2] = "c2";
        // 4. print the third element again
        System.out.println("step 4");
        System.out.println("third element after change: " + strings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
        System.out.println("step 5");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "hi";
        }
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        System.out.println("step 6");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        // 7. make an array of 50 integers
        System.out.println("step 7");
        int[] integers = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
        System.out.println("step 8");
        Random rand = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = rand.nextInt(50);
        }
        // 9. without printing the entire array, print only the smallest number
        //    on the array
        System.out.println("step 9");
        int smallest = Integer.MAX_VALUE;
        for (int integer : integers) {
            if (integer < smallest) {
                smallest = integer;
            }
        }
        System.out.println("The smallest number out of the 50 random integers is " + smallest);
        // 10 print the entire array to see if step 8 was correct
        System.out.println("step 10");
        for (int integer : integers) {
            System.out.println(integer);
        }
        // 11. print the largest number in the array.
        System.out.println("step 11");
        int largest = Integer.MIN_VALUE;
        for (int integer : integers) {
            if (integer > largest) {
                largest = integer;
            }
        }
        System.out.println("The largest number out of the 50 random integers is " + largest);

        // 12. print only the last element in the array
        System.out.println("step 12");
        System.out.println(integers[integers.length-1]);
    }
}
