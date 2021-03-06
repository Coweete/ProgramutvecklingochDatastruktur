package laboration2;

public class LinearSearch {
    public int indexOf( int[] array, int value ) {
        int res = -1;
        for( int i=0; ( i<array.length ) && ( res == -1 ); i++ ) {
            if( value == array[ i ] )
                res = i;
        }
        return res;
    }
    
    public int indexOf2( int[] array, int value ) {
        for( int i = 0;  i<array.length; i++  ) {
            if( value == array[ i ] )
                return i;
        }
        return -1;
    }
    public int indexOf(double[] array, double value){
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]){
                return i;
            }
        }
        return -1;
    }
    public int indexOf(String[] array, String value){
        for (int i = 0; i < array.length; i++) {
            if(value.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    
}
