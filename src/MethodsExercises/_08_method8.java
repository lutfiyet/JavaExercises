package MethodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _08_method8 {

    /*
    nextGreaterElement isminde bir method oluşturun.
    Parametre olarak iki int array'i kabul eder.
    Size int nums1 adında bir int array verilir ve bunun altkümesi olarak da nums2 array verilir.
    nums2 array'indeki nums1 ögelerini arayın ve ortak olan ögeden sonra gelen numaranın,
    nums2 array'inde bulunan sayıdan büyük olup olmadığını kontrol edin. Eğer öyle ise,
    bu sayının yerini nums2 deki büyük sayı ile değiştirin.nums2 array'inde,
    bulunan sayıdan sonra gelen başka bir sayı yoksa, o yer için -1 koyun.

    Örnek ile daha iyi anlayacaksınız.

    Example 1:
    Girdi: nums1 = [4,1,2], nums2 = [1,3,4,2]
    Çıktı:[-1,3,-1]
    Açıklama:
    İlk dizedeki 4 sayısı için, ikinci dizede (array'deki) bir sonraki büyük sayı yoktur, bu nedenle -1 yazılır.
    İlk dizedeki 1 sayısı için, ikinci dizede 1'den sonra gelen büyük sayı 3 tür.
    İlk dizedeki 2 sayısı için, ikinci dizede 2'den sonra gelen büyük bir sayı yoktur, bu nedenle -1 yazılır.

    Cevap:[-1,3,-1]

    Example 2:
    Girdi: nums1 = [2,4], nums2 = [1,2,3,4].
    Çıktı: [3,-1]
    Açıklama:
      İlk dizedeki 2 sayısı için, ikinci dizede 2'den büyük olarak 3 gelmektedir. Bu nedenle 3 'tür.
      İlk dizedeki 4 sayısı için, ikinci dizede 4'ten sonra hiçbir sayı gelmediği için, -1 yazılır.

    Cevap : [3,-1]

    Not:

    Sayı1 ve sayı2'deki tüm öğeler benzersizdir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("nums1 dizi elemanları : ");
        String[] arrStr1 = scanner.nextLine().trim().replaceAll("\\s+"," ").split(" ");

        System.out.print("nums2 dizi elemanları :");
        String[] arrStr2 = scanner.nextLine().trim().replaceAll("\\s+"," ").split(" ");

        int[] nums1 = new int[arrStr1.length];
        int[] nums2 = new int[arrStr2.length];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = Integer.parseInt(arrStr1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = Integer.parseInt(arrStr2[i]);
        }

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));







    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){

        int[] arr = new int[nums1.length];

        //       Arrays.fill(arr,-1);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length-1 ; j++) {

                if (nums1[i] == nums2[j] && nums2[j] < nums2[j+1]){
                    arr[i] = nums2[j+1];
                    break;
                }
            }
        }
        return arr;
    }
}
