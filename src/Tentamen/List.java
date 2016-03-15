package Tentamen;

/**
 * Created by jonatan on 2016-03-15.
 */
public interface List<E> {

    public void add(E element);
    public void addFirst(E element);
    public void addLast(E element);
    public E remove(int index);
    public E removeFirst();
    public E removerLast();
    public E get(int index);
    public E set(int index, E element);
    public int size();

}
