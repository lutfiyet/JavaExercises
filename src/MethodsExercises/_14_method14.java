package MethodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _14_method14 {

    /*
    Write a method called append
    append adında bir method oluşturun.
    Parametre olarak iki int array  oluşturun.
     ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
    Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
    Bunu döndürmelidir:
     {2, 4, 6, 1, 2, 3, 4, 5}.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi gir: ");
        String[] str1 = scanner.nextLine().trim().replaceAll("\\s+"," ").split(" ");
        int[]arr1=new int[str1.length];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(str1[i]);
        }

        System.out.print("Bir sayi daha gir: ");
        String[] str2 = scanner.nextLine().trim().replaceAll("\\s+"," ").split(" ");
        int[]arr2=new int[str2.length];

        for(int i=0;i<arr2.length;i++){
            arr2[i]=Integer.parseInt(str2[i]);
        }


        //    int[] arr1 = {2, 4, 6};
        //    int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(append(arr1,arr2)));


    }
    public static int[] append(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr.length ; i++) {


            if (i < arr1.length){
                arr[i] = arr1[i];
            }
            else {
                arr[i] = arr2[i-arr1.length];
            }
        }
        return arr;

    }
}
    /*
    public static int[] append(int[] arr1, int[] arr2) {

        ArrayList<Integer> arrayList1 = new ArrayList<>((CevirList(arr1)));

        ArrayList<Integer> arrayList2 = new ArrayList<>((CevirList(arr2)));

        arrayList1.addAll(arrayList2); // arrayList1

        int[] arr = new int[arrayList1.size()];

        int count =0;
        for (Integer num: arrayList1) {
            arr[count] += num;
            count++;
        }
        return arr;
    }

    public static ArrayList<Integer> CevirList(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer num : arr) {
            arrayList.add(num);
        }
        return arrayList;
    }

     */


