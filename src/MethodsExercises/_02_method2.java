package MethodsExercises;

import java.util.Scanner;

public class _02_method2 {
    /*
    Create one method which name is middleWord
    This method should take String as parameter.
     It should find the words in the middle of the sentences or lines.
     Return the middle word.

     Example 1: I likeJava.
     print : like

     Example2:
     I learn Java  very easily.
     print: Java
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();

        System.out.println( middleWord(str));




    }
    public static String middleWord(String str){

        String[] arr = str.trim().replaceAll("\\s+"," ").split(" ");

        String middle = arr[(arr.length-1) / 2];

        return middle;
    }
}
/*
        String[] arr = str.trim().replaceAll("[' ']+"," ").split(" ");


        String middle = "";

        if (arr.length % 2 == 1){
            middle = arr[(arr.length-1) / 2];
        }
        else {
             middle += arr[(arr.length) / 2 -1 ] + " " + arr[arr.length / 2];
        }

        return middle;
         */
