package Tentamen;

import java.util.ArrayList;

/**
 * Created by jonatan on 2016-03-15.
 */
public class StringStack {
    private ArrayList<String> stack = new ArrayList<String>();

    public void push(String string){
        //stack.addLast(string);
    }
    public String pop(){
        //stack.removeFirst();
        return null;
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return size() == 0;
    }
}
