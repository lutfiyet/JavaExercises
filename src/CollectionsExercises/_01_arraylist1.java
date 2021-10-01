package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        write a method, with the name of getCount()
        As a parameter, string ArayList  and a String

        Return type is int,

        Specify and return how many times a value in ArrayList is repeated.
         E.g;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 (should be). (Orange is for 2 times written )
         */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));

        String str = "Orange";

        System.out.println(getCount(arrayList,str));


    }

    public static int getCount(ArrayList<String> arrayList, String str) {

        int count =0;
        for (int i = 0; i < arrayList.size() ; i++) {

            if (arrayList.get(i).equals(str)) {
                count++;
            }
        }
        return count;
    }
}
