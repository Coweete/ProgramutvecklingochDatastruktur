package laboration2;

import java.util.Random;

/**
 * Created by jonatan on 2016-03-17.
 */
public class Exercise4 {

    private static void swap(Object[] array, int elem1, int elem2){
        Object temp = array[elem1];
        array[elem1] = array[elem2];
        array[elem2] = temp;
    }
    public static void shuffle(Object[] obj){
        int pos;
        Random rand = new Random();
        for(int i = obj.length-1; i > 0; i--){
            pos = rand.nextInt(i+1);
            swap(obj,i,pos);
        }
    }
}
