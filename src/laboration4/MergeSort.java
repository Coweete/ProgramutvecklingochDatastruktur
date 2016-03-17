package laboration4;

/**
 * Created by jonatan on 2016-03-17.
 */
public class MergeSort {

    public static void mergeSort(Object[] array){
        Object[] temp = new Object[array.length];
        mergeSort(array,0,array.length,temp);
        temp = null;
    }

    private static void mergeSort(Object[] array, int start, int n, Object[] temp) {
       int n1, n2;
        if(n > 1){
            n1 = n / 2;
            n2 = n - n1;
            mergeSort(array,start,n1,temp);
            mergeSort(array,start +n1,n2,temp);
            merge(array,start,n1,n2,temp);
        }
    }

    private static void merge(Object[] array, int first, int n1, int n2, Object[] temp) {
       int counter = 0, cursor1 = 0, cursor2 = n1,end = n1 + n2;
        while ( (cursor1 < n1) && (cursor2 < end)){
            if( ( (Comparable) array[first+ cursor1]).compareTo(array[first+cursor2]) < 0){
                temp[counter] = array[first + cursor1];
                cursor1++;
            }else{
                temp[counter] = array[first + cursor2];
                cursor2++;
            }
            counter++;
        }
        while (cursor1 < n1){
            temp[counter] = array[first + cursor1];
            cursor1++;
            counter++;
        }
        while (cursor2 < end){
            temp[counter] = array[first + cursor2];
            cursor2++;
            counter++;
        }
        for (int i = 0; i < n1 + n2; i++) {
            array[first +1] = temp[i];
        }
    }
}
