package Tentamen;

import java.util.Comparator;

/**
 * Created by jonatan on 2016-03-18.
 */
public class TypeAndSize implements Comparator<Shoe> {
    @Override
    public int compare(Shoe o1, Shoe o2) {
        int res = o1.getType().compareTo(o2.getType());
        if(res == 0){
            res = o1.getSize() - o2.getSize();
        }
        return res;
    }
}
