package CollectionsExercises;

import java.util.Arrays;
import java.util.HashSet;

public class _14_Set2 {

    /*
   Create a method named changeSet().
     A String HashSet and two Strings as parameters
     return type is hashset
     If HashSet has String 1, replace String 1 with String 2.

     SAMPLE:
     hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
     String 1 = banana
     String 2 = peach
     ANSWER: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));

        String s1 = "banana";
        String s2 = "peach";

        System.out.println(changeSet(hs,s1,s2));


    }
    public static HashSet<String> changeSet(HashSet<String>hs, String s1, String s2) {

        if (hs.contains(s1)){
            hs.remove(s1);
            hs.add(s2);
        }
        return hs;
    }
}