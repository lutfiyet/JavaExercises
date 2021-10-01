package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arraylist3 {

    /*
        Create a method called getLength().
         String ArrayList as parameter
         Return type Integer ArrayList
         Find the length of each String in the ArrayList.

         Return the length of all elements

         E.g;
         ArrayList : "New jersey" , "New york" , "Ohio" , "Florida" , "Boston"
         Print the lengths of all Strings;
         answer: it should be 10 , 8 , 4 , 7 , 6
     */

    public static void main(String[] args) {

        ArrayList<String>arrayList = new ArrayList<>(Arrays.asList( "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston" ));

        System.out.println( getLength(arrayList));


    }

    public static ArrayList<Integer> getLength(ArrayList<String> arrayList) {

        ArrayList<Integer>arrayListInt = new ArrayList<>();

        for (int i = 0; i < arrayList.size() ; i++) {
            arrayListInt.add(arrayList.get(i).length());
        }
        return arrayListInt;
    }
}