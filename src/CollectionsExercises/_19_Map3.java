package CollectionsExercises;

import java.util.ArrayList;
import java.util.HashMap;

public class _19_Map3 {

    /*
    Create a method called returnValue().
     Parameter String-Integer HashMap
     Return type ArrayList
     Create a Hashmap and its values must consist of Integers and Strings.
       map
                        "Lion", 1
                        "Tiger", 2
                        "Elephant", 3
                        "Cat", 4
                        "Dog", 5
     Return all VALUES with a for loop.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Lion", 1);
        hm.put("Tiger", 2);
        hm.put("Elephant", 3);
        hm.put("Cat", 4);
        hm.put("Dog", 5);

        System.out.println(returnValue(hm));

    }
    /*
    public static ArrayList<Integer> returnValue(HashMap<String, Integer> hm) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer vl : hm.values()) {
            arrayList.add(vl);
        }
        return arrayList;
    }

     */


    public static ArrayList<Integer> returnValue(HashMap<String, Integer> hm) {
        ArrayList<Integer> arrayList = new ArrayList<>(hm.values());
        return arrayList;

    }
}