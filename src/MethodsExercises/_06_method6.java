package MethodsExercises;

import java.util.Scanner;

public class _06_method6 {
    /*
    Create a method named EvenOddNums.
         Let this method accept a parameter that is a String.
         This String will have 10 digit numbers like 1234567890.
         Take each digit of the numbers and add if the digit is even, subtract if it is odd.
         print the total result.
         Hint: Before you can perform number operations, you need to convert the digits to integers.

         Example:
         String = "6678421312"
         6+6-7+8+4+2-1-3-1+2
         the result should be 16
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("write a number with 10 digit: ");
        String str = sc.nextLine();

        //    String str = "6678421312";

        System.out.println(EvenOddNums(str));




    }
    public static int EvenOddNums(String str){

        String[] arrStr = str.trim().replace(" ","").split("");

        int[] arrInt = new int[arrStr.length];

        int sum = 0;

        for (int i = 0; i <arrInt.length ; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
            if (arrInt[i] % 2 == 0){
                sum+= arrInt[i];
            }
            else {
                sum-= arrInt[i];
            }
        }
        return sum;
    }
}
