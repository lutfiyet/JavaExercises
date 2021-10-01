package CollectionsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _15_Set3 {

    /*
   Create a method called commonValues() and its parameters are 2 hashsets.
   Add common values to ArrayList.
     The return type is an arraylist.
     E.G:
     First Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
     Second hashset : "Germany" , "China" , "Brazil" , "France" , "USA"
     output: "Germany" , "Brazil" ,"USA"
     Print the ArrayList.
     */

    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<>(Arrays.asList( "Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList( "Germany" , "China" , "Brazil" , "France" ,  "USA"));

        System.out.println(commonValues(hs1,hs2));


    }
    public static ArrayList<String > commonValues (HashSet<String>hs1, HashSet<String> hs2) {

        hs1.retainAll(hs2);

        ArrayList<String>arrayList = new ArrayList<>(hs1);

        return arrayList;

        }
    }
