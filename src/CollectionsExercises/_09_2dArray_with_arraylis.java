package CollectionsExercises;

import java.util.ArrayList;

public class _09_2dArray_with_arraylis {

    /*
    Create a 2d array [][] and its elements = [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ]
     Store all the elements in one arraylist and print the arraylist
     Load an arrayList of all elements and print that arrayList.
     E.g
     Entry:
     [
      [ 1, 2, 3 ],
      [ 4, 5, 6 ],
      [ 7, 8, 9 ]
     ]
     Output: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer>arrayList = new ArrayList<>();

        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[i].length ; j++) {
                arrayList.add(arr2D[i][j]);
            }
        }
        System.out.println(arrayList);
    }
}