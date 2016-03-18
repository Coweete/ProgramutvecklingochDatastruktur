package Tentamen;

/**
 * Created by jonatan on 2016-03-18.
 */
public interface Filter<T> {
    public boolean accept(T obj);
}
