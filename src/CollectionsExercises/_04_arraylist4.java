package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_arraylist4 {

    /*
        Create a method called changeInArraylist().
         String ArrayList, String s1, String s2 as parameters
          Change s1 to s2 in arraylist

         Return String arrayList

         E.g;
         Arraylist "yellow" , "red" , "blue" , "red" , "blue"
         s1 = blue
         s2 = yellow
         Convert all blue 's to yellow.
         answer: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("yellow", "red", "blue", "red", "blue"));

        String s1 = "blue";
        String s2 = "yellow";

        System.out.println(changeInArraylist(arrayList, s1, s2));


    }

    public static ArrayList<String> changeInArraylist(ArrayList<String> arrayList, String s1, String s2) {

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).equals(s1)) {
                arrayList.set(i, s2);
            }
        }
        return arrayList;
    }
}
