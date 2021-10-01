package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_arraylist5 {

    /*
        Create a method named rotateList().
         String ArrayList as parameter
         Reverse the array of ArrayList. (Print in reverse)
         Return the reversed version.
         Arraylist = "New jersey", "New york", "Atlanta", "Florida", "Ohio"
         Answer: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));

        System.out.println(rotateList(arrayList));

    }

    public static ArrayList<String> rotateList(ArrayList<String> arrayList) {

        ArrayList<String> arraylistreverse = new ArrayList<>();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arraylistreverse.add(arrayList.get(i));
        }
        return arraylistreverse;
    }
}

    /*
     public static ArrayList<String> rotateList(ArrayList<String> list){

        Collections.reverse(list);

        return list;
    }
     */