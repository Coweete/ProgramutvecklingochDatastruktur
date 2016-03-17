package laboration5;

import java.util.EmptyStackException;

/**
 * Created by jonatan on 2016-03-17.
 */
public class DoubleStack implements DStack {
    private double[] elements;
    private int size;

    public DoubleStack(int capacity){
        elements = new double[capacity];
    }
    @Override
    public void push(Double element) {
        if(size >= elements.length){
            throw new StackOverflowError();
        }
        elements[size] =element;
        size++;
    }

    @Override
    public Double pop() {
      if (isEmpty())
          throw  new EmptyStackException();
       return elements[--size];
    }

    @Override
    public Double peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elements[size-1];
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }
}
