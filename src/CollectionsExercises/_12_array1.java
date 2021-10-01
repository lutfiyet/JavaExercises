package CollectionsExercises;

public class _12_array1 {

    /*
   Create a method called duplicate().
     Parameter must be int Array
     Return type boolean
     It should return true if there is duplication (iteration) in the Array.
     It should return false if there is no duplicate (repetition) in the Array.

     Example1:
     Input: [1,2,3,1]
     Output: true

     Example 2:
     Input: [1,2,3,4]
     Output: false
         */

    public static void main(String[] args) {

        //    int[] arr = {1,2,3,1};
        int[] arr = {1,2,3,4};

        System.out.println(dupicate(arr));


    }
    public static boolean dupicate(int[] arr) {

        boolean b = false;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {

                if (i != j && arr[i] == arr[j]){
                    b = true;
                    break;
                }
            }
        }
        return b;
    }
}