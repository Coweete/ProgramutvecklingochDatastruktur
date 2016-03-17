package laboration4;

import f4.Sorting;

/**
 * Created by jonatan on 2016-03-17.
 */
public class QuickSort {

    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int left, int right) {
        int pivotIndex;
        if(left<right){
            pivotIndex = partition(arr,left,right,(left+right)/2);
            swap(arr,left,pivotIndex-1);
            swap(arr,pivotIndex+1,right);
        }
    }
    private static int partition(int[] arr,int left,int right,int pivotIndex){
        int pivotValue = arr[pivotIndex];
        int storeIndex = left;
        swap(arr,pivotIndex,right);
        for (int i = left; i < right; i++) {
            if(arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        swap(arr,storeIndex,right);
        return storeIndex;
    }
    private static void swap(int[] array, int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
