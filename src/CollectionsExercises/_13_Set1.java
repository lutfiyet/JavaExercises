package CollectionsExercises;

import java.util.Arrays;
import java.util.HashSet;

public class _13_Set1 {
    /*
    Create a method totalCount()
     Its parameter is 'Integer Hashset'
     Get the number of elements in the HashSet.
     return totalCount.
     Sample:
     hashset ; 4.2,3,1.7
     Answer: 5
     */

    public static void main(String[] args) {

        HashSet<Integer>hs = new HashSet<>(Arrays.asList(4,2,3,1,7));

        System.out.println(totalCount(hs));


    }
    public static int totalCount(HashSet<Integer>hs) {

        int numSize = hs.size();
        return numSize;
    }
}