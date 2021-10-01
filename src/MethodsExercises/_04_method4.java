package MethodsExercises;

import java.util.Scanner;

public class _04_method4 {
    /*
    create a method called reverseWord
     This method must have a parameter as a String
     And it should reverse it with the words in the sentence
     Print the reverse.

     Example 1:
     String: type java
     the return should be:  java type

     Example 2:
     String: keep calm and stay home
     The turn should be: home stay and calm keep
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a sentence: ");
        String str = scanner.nextLine();

        System.out.println(reverseWord(str));




    }
    public static String reverseWord  (String str){

        String[] arr =  str.trim().replaceAll("\\s+"," ").split(" ");

        String strTers = "";

        for (int i = arr.length-1; i >= 0; i--) {

            strTers += arr[i] + " ";
        }

        return strTers.trim();
    }
}
