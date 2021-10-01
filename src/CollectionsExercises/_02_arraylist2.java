package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2 {

      /*

        Create a method called getSum().
         Its parameter is ArrayList
         Return type is int.
         Add together, all the numbers in the ArrayList.
         Return the total result as return.
         E.g;
         Arraylist = 1,2,3,4,5
         return should be 15
         */

    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(getSum(arrayList));


    }

    public static int getSum(ArrayList<Integer>arrayList) {

        int sum =0;

        for (int i = 0; i < arrayList.size() ; i++) {

            sum += arrayList.get(i) ;
        }
        return sum;
    }
}
