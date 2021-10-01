package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7 {

    /*
         Create a method called common_values().
         2 Integer ArrayLists as parameters
         Return type must be integer ArrayList
          Take two arraylists and return all common values in arraylist
         E.g;
         ArrayList 1: 3 , 2 , 5 , 6
         ArrayList 2: 5 , 8 , 9
         return should be 5

         E.g;
         ArrayList 1: 8,7,9,6,7
         ArrayList 2: 6,7,12,3.1
         return should be 6 and 7
     */

    public static void main(String[] args) {

        ArrayList<Integer>arrayList1 = new ArrayList<>(Arrays.asList(3,2,5,6));
        ArrayList<Integer>arrayList2 = new ArrayList<>(Arrays.asList(5,8,9));

        System.out.println(common_values(arrayList1,arrayList2));


    }

    public static ArrayList<Integer> common_values(ArrayList<Integer> arrayList1, ArrayList<Integer>arrayList2) {

        ArrayList<Integer>arrayList3 = new ArrayList<>();

        for (int i = 0; i <arrayList1.size() ; i++) {
            for (int j = 0; j <arrayList2.size() ; j++) {

                if (arrayList1.get(i) == arrayList2.get(j)){
                    arrayList3.add(arrayList1.get(i));
                }
            }
        }
        return arrayList3;
    }
}
