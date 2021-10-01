package MethodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _07_method7 {

    /*
        Create a method called plusOne.
         It takes an int Array as a parameter.
         Digits must be positive and the first digit cannot be 0.
         The numbers you write will be treated as a whole.
         Add 1 to the middle digit.

         Example 1:
         Input:: [1,2,3]
         Output: [1,3,3]
         Explanation: This string of numbers represents 133.

         Example 2:
         Input: [4,3,5,2,1]
         Output: [4,3,6,2,1]
         Explanation: This string of numbers represents 43621.
             */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Tell me a number: ");
        String str = sc.nextLine();

        String[] arrStr = str.trim().replaceAll("\\s+"," ").split(" ");

        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i < arrInt.length ; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        System.out.println(Arrays.toString(plusOne(arrInt)));




    }
    public static int[] plusOne (int[] arrInt){

        for (int i = 0; i < arrInt.length ; i++) {
            if (i == (arrInt.length-1) / 2){
                arrInt[i]+=1;
            }
        }
        return arrInt;
    }
}
