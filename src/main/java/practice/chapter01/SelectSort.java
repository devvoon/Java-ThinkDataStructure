package practice.chapter01;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {2,5,6,1,3};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }

     public static int indexLowest(int[] array, int start){
        int lowIndex = start;
         for (int i = start; i < array.length ; i++) {
             if (array[i] < array[lowIndex]){
                 lowIndex = i;
             }
         }
         return lowIndex;
     }

     public static void swapElements(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
     }
}
