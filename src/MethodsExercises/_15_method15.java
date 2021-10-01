package MethodsExercises;

public class _15_method15 {
    /*
        Create a method called isUnique.
         It takes an int array as a parameter.
          and returns a boolean value indicating whether the values in this array are unique
          (true if there is no similarity, false if there is).
         for example, if we have an array named list,
         int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
         The result should return true as there are no duplicate elements in this list.

         int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
         Since there are two, element 3 in this list, the result should return false.
             */

    public static void main(String[] args) {

        int[] arr = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //   int[] arr = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        System.out.println( isUnique(arr));


    }

    public static boolean isUnique(int[] arr) {

        boolean b = true;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {

                if (i!=j && arr[i] == arr[j]){
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}
