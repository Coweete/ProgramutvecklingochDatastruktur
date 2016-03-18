package Tentamen;

import java.util.LinkedList;

/**
 * Created by jonatan on 2016-03-18.
 */
public class MemberQueue {
    private LinkedList<Member> queue = new LinkedList<Member>();

    public void enqueue(Member member){
        queue.addLast(member);
    }

    public Member dequeue(){
        if (empty())
            return null;
        return queue.removeLast();
    }

    public boolean empty(){
        return queue.size() == 0;
    }

    public Member peek(){
        if(empty())
            return null;
        return queue.getFirst();
    }

    public void moveToEnd(Filter<Member> filter){
        int counter = queue.size();
        int pos = 0;
        while (counter > 0){
            if(filter.accept(queue.get(pos))){
                enqueue(queue.remove(pos));
            }else{
                pos++;
            }
            counter--;
        }
    }

    public static void main(String[] args) {
        MemberQueue q = new MemberQueue();
        q.enqueue( new Member("Alf",8670) );
        q.enqueue( new Member("Edit",235) );
        q.enqueue( new Member("Anna",789) );
        q.enqueue( new Member("Zero",42) );
        q.enqueue( new Member("Vilda",4564) );
        q.enqueue( new Member("Ronja",4622) );
        q.moveToEnd( new LessThan( 400 ) );
        while( !q.empty() ) {
            System.out.println( q.dequeue() );
        }

    }
}
