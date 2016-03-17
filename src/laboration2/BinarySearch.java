package laboration2;

public class BinarySearch {
    
    public int binarySearch( int[] array, int key ) {
        int res = -1, min = 0, max = array.length - 1, pos;
        while( ( min <= max ) && ( res == -1 ) ) {
            pos = (min + max) / 2;
            if( key == array[ pos ] )
                res = pos;
            else if( key < array[ pos ])
                max = pos - 1;
            else
                min = pos + 1;
        }
        return res;
    }
    public int binearySearch(long[] array, long value){
        int res = -1, min = 0, max = array.length -1, pos;
        while ( (min <= max) && (res == -1)){
            pos = (min + max)/2;
            if(value == array[pos]){
                res = pos;
            }else if(value < array[pos]){
                max = pos -1;
            }else
                min = pos +1;
        }
        return res;
    }

    public int binearySearch(String[] array, String value){
        int res = -1,compare, min = 0, max = array.length-1, pos;
        while ( (min <= max) && (res == -1)){
            pos = (min + max) / 2;
            compare = value.compareTo(array[pos]);
            if(compare == 0){
                res = pos;
            }else if(compare < 0){
                max= pos - 1;
            }else{
                min = pos + 1;
            }
        }
        return res;
    }

    public int binearySearch(Object[] array, Object key){
        int res = -1, min = 0, max = array.length -1, compare, pos;
        Comparable comp = (Comparable) key;
        while ((min <= max) && (res == -1)){
            pos = (min+max) / 2;
            compare = comp.compareTo(array[pos]);
            if(compare == 0)
                res = pos;
            else if(compare < 0)
                max = pos -1;
            else
                min = pos +1;
        }
        return res;
    }
}
