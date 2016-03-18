package Tentamen;

/**
 * Created by jonatan on 2016-03-18.
 */
public class LessThan implements Filter<Member> {
    private int limit;

    public LessThan(int limit){
        this.limit = limit;
    }
    @Override
    public boolean accept(Member obj) {
        return obj.getId() > limit;
    }
}
