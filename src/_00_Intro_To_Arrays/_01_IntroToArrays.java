package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
        String[] strings = new String[5];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "c";
        strings[3] = "d";
        strings[4] = "e";
        // 2. print the third element in the array
            System.out.println("third element before change: "+strings[2]);
        // 3. set the third element to a different value
            strings[2] = "c2";
        // 4. print the third element again
        System.out.println("third element after change: "+strings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
        for(int i = 0; i< strings.length; i++){
            strings[i] = "hi";
        }
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        System.out.println("for loop changes!!");
        for (String string : strings) {
            System.out.println(string);
        }
        // 7. make an array of 50 integers
        int[] ints = new int[50];
        //does it look like im muted
        // 8. use a for loop to make every value of the integer array a random
        //    number
        for(int i = 0; i< ints.length; i++){
            Random rand = new Random();
            int ran = rand.nextInt(50);
            ints[i]=ran;
        }
        // 9. without printing the entire array, print only the smallest number
        //    on the array
        System.out.println("number time!!");
        int smallest = ints.
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
