package MethodsExercises;

import java.util.Scanner;

public class _11_method11 {

    /*
   Create a method called addDigits.
     parameter int
     Return type is also int
     Give positive int values and add the digits together until the final result is a single digit.
     When single digit output, rotate

     Example1:
     Input 38
     Output: 2
     Explanation: The operations will be: 3 + 8 = 11, 1 + 1 = 2.
                  Return this because 2 is a single digit.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me a number: ");
        int num = scanner.nextInt();

        System.out.println(addDigits(num));



    }
    public static int sum(int num){

        String str = String.valueOf(num);
        String[] arr = str.split("");

        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }

    public static int addDigits(int num){
        for (int i = 0; i < 4 ; i++) {
            num = sum(num);

            if (num < 10)
                break;
        }
        return num;
    }

}
