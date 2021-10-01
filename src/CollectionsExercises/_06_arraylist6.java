package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
     Create a method named hillNum().
     Integer ArrayList as parameter
     Return type int,
     If the number is less than the previous number and greater than the next number, print that number.
     E.g;
     ArrayList 5,4,6,2,1
     2 is less than 6 and greater than 1.
     Return should be 2.
     */

    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(5,4,6,2,1));

        System.out.println(hillNum(arrayList));


    }

    public static int hillNum(ArrayList<Integer> arrayList) {

        int num =0;

        for (int i = 1; i < arrayList.size()-1; i++) {
            if (arrayList.get(i)< arrayList.get(i-1) && arrayList.get(i) > arrayList.get(i+1)) {
                num += arrayList.get(i);
            }
        }
        return num;
    }
}
