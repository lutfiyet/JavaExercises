package MethodsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_method5 {
     /*
        Create a method called getSum.
         Its parameter is ArrayList.
         Remove all $s in array and sum all numbers
         The data type we return must be 'int'.
         if the result is less than 0, print -1.

         Example1:
         ArrayList = $13, $15, $20
         Answer = 48

         Example 2:
         ArrayList= $-13, $0, $0
         Answer = -1.
         */


    public static void main(String[] args) {

    //    ArrayList<String >arrayList = new ArrayList<>(Arrays.asList("$13","$15","$20"));

        ArrayList<String >arrayList = new ArrayList<>(Arrays.asList("$-13","$0","$0"));

        System.out.println(getSum(arrayList));




    }
    public static int getSum   (ArrayList<String>arrayList){

        int sum = 0;
        for (String str : arrayList) {
            String str2 = str.replace("$","");
            sum += Integer.parseInt(str2);
        }
        if (sum < 0){
            return -1;
        }
        else {
            return sum;
        }
    }
}
