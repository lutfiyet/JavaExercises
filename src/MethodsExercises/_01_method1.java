package MethodsExercises;

import java.util.Scanner;

public class _01_method1 {
    /*
   Create a method named randomNum.
     It takes int max as a parameter.
     This method returns a random value between 0 and max.
     Return the random number.
     Note: If you need to create a class, you can.
     Note: The name of the method must be exactly the same as requested (randomNum), otherwise the answer will be wrong.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Max Number: ");
        int max = scanner.nextInt();

        System.out.println(randomNum(max));


    }
    public static int randomNum(int max){
        int random = (int)(Math.random()*max);
        return random;
    }
}
