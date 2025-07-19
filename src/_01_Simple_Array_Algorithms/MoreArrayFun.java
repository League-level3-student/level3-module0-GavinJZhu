package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "c";
        strings[3] = "d";
        strings[4] = "e";

    }

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
    public void printStrings(String[] strings){
        for(String string : strings){
            System.out.println(string);
        }
    }

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
    public void printStringsReverse(String[] strings){
        for(int i = strings.length; i>0; i--){
            System.out.println(strings[i-1]);
        }
    }


    //4. Write a method that takes an array of Strings and prints every other String in the array.
    public void printEveryOtherString(String[] strings){
        for(int i = 0; i< strings.length; i++){
            System.out.println(strings[i*2]);
        }
    }

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
    public void printRandomString(String[] strings){
        Random ran = new Random();
        int random = ran.nextInt((strings.length)-1);
        for(int i = 0; i< strings.length; i++){
            System.out.println(strings[random]);
        }
    }

}
