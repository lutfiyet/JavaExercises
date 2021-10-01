package CollectionsExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _16_Set4 {

    /*
    Create a method called remove().
     It must consist of a LinkedHashset and two Strings as parameters.
     If Strings exist in LinkedHashset , delete them.
     Return type linkedhashset
     For example,
     linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
     String 1 = Germany
     String 2 = USA
      Delete Germany and USA.
     Return the set.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList("Germany" ,"France" ,"USA" ,"Canada" ,"Mexico" ,"Brazil"));

        String s1 = "Germany";
        String s2 = "USA ";

        System.out.println(removing(lhs,s1,s2));


    }
    public static LinkedHashSet<String> removing (LinkedHashSet<String>lhs, String s1, String s2) {

        if (lhs.contains(s1)){
            lhs.remove(s1);
        }
        if (lhs.contains(s2)){
            lhs.remove(s2);
        }
        return lhs;
    }
}