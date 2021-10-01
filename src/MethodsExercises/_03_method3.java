package MethodsExercises;

import java.util.Scanner;

public class _03_method3 {
    /*
       Create a method named reverseString.
         This method takes a String as a parameter.
         And this method writes the entered String in reverse.
         Print the reversed version.

         Ex: String = "I Love Java."
         Print: .I evoL avaJ
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a sentence: ");
        String str = scanner.nextLine();

        System.out.println(reverseString(str));




    }
    public static String reverseString (String str){

        String str2 =  str.trim().replaceAll("\\s+"," ");

        String strTers = "";

        for (int i = str2.length()-1; i >= 0; i--) {

            strTers += str2.charAt(i);
        }

        return strTers;
    }
}

/*
String[] arr =  str.trim().replaceAll("\\s+"," ").split("");

        String strTers = "";

        for (int i = arr.length-1; i >= 0; i--) {

            strTers += arr[i];
        }

        return strTers;
    }
}

 */
