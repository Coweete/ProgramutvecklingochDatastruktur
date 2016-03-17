package laboration4;

/**
 * Created by jonatan on 2016-03-17.
 */
public class Laboration4 {

    public  double[] randomArray(int n,double min, double max){
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ( Math.random() * ( max - min  ) ) + min;
        }
        return array;
    }
    public static void swap(double[] array, int n1, int n2){
        double temp = array[n1];
        array[n1] = array[n2];
        array[n2] = temp;
    }

    public static void insertionsortDesc(double[] array){
        for (int i = 1 ; i < array.length; i++) {
            for (int j = i; (j > 0) && (array[j-1] > array[j]); j--) {
                swap(array,j,j-1);
            }
        }
    }

    public static void bubblesortDesc(double[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > i; j--) {
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }
    }

    public static void insertionsortDescCounter(double[] array){
        int search=0, swap=0;
        for (int i = 1 ; i < array.length; i++) {
            search++;
            for (int j = i; (j > 0) && (array[j-1] > array[j]); j--) {
                search++;
                swap(array,j,j-1);
                swap++;
            }
        }
        System.out.println("Insertion:\t" + search + " Swap:\t" + swap);
    }

    public static void bubblesortDescCounter(double[] array){
        int search=0, swap=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length -1; j > i; j--) {
                search++;
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                    swap++;
                }
            }
        }
        System.out.println("Bubbelsearch:\t" + search + " Swap:\t" + swap);
    }

    public static void mergsort(double[] array){
        double[] temp = new double[array.length];

    }
    private static void mergesort(double[] array, int start,int n, double[] temp){
        int n1,n2;
        if(n > 1){
            n1 = n /2;
            n2 = n -n1;
            mergesort(array,start,n1,temp);
            mergesort(array,start +n1,n2,temp);
            merge(array,start,n1,n2,temp);
        }
    }

    private static void merge(double[] array, int first, int n1, int n2, double[] temp) {
        int counter = 0, cursor1 = 0, cursor2 = n1,last = n1 + n2;
        while( (cursor1 < n1) && (cursor2 < last)){
            if(array[first + cursor1] < array[first+cursor2]){
                temp[counter] = array[first + cursor1];
                cursor1++;
            }else {
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
        while (cursor2 < last){
            temp[counter] = array[first+ cursor2];
            cursor2++;
            counter++;
        }
        for (int i = 0; i < n1 + n2; i++) {
            array[first + i] = temp[i];
        }
    }



    public static void main(String[] args){
        long first, stop;
        Laboration4 la = new Laboration4();
        double[] array = la.randomArray(10000,1,100);
        double[] array1 = la.randomArray(10000,1,100);
        double[] array2 = la.randomArray(10000,1,100);
        first = System.currentTimeMillis();
        Laboration4.bubblesortDesc(array);
        stop = System.currentTimeMillis();
        System.out.println("Bubble: " + (stop - first));
        first = System.currentTimeMillis();
        Laboration4.insertionsortDesc(array1);
        stop = System.currentTimeMillis();
        System.out.println("Inesrt: " + (stop - first));
        first = System.currentTimeMillis();
        Laboration4.mergsort(array2);
        stop = System.currentTimeMillis();
        System.out.println("Merge: " + (stop - first));

    }


}
