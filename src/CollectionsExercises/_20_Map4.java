package CollectionsExercises;

import java.util.HashMap;
import java.util.Scanner;

public class _20_Map4 {
    /*
   Create a method called update() .
     Parameters , Integer -String HashMap, int and String ,
  (3 different parameters)
     return type Integer - String HashMap
     If HashMap contains parameter which is int,
     Update existing String in int value.
     Sample :
      Hashmap:
     1, "New Jersey"
     2, "New York"
     3, "London"
     4, "Paris"

     int = 3
     String = Miami
     The answer should be as follows:
     1, "New Jersey"
     2, "New York"
     3, "Miami"
     4, "Paris"
     */

    public static void main(String[] args) {

        HashMap<Integer,String > hm = new HashMap<>();

        hm.put(1,"New jersey");
        hm.put(2,"New York");
        hm.put(3,"London");
        hm.put(4,"Paris");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me a number 1 to 4: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tell me a city: ");
        String str = scanner.nextLine();

    //    int num = 3;
    //    String str = "Miami";

        System.out.println( update(hm,num,str));


    }
    /*
    public static HashMap<Integer,String> update(HashMap<Integer,String> hm, int num, String str) {

        if (hm.containsKey(num)){
            hm.put(num,str);
           // hm.replace(num,str);
        }
        return hm;

    }

     */
    public static HashMap<Integer,String> update(HashMap<Integer,String> hm, int num, String str) {

        for (Integer dd : hm.keySet()) {
            if (dd == num) {
                hm.put(num,str);
            }

        }
        return hm;

    }


}
