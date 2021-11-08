package Exc_8;

import java.util.concurrent.*;
import java.util.*;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    WaitList(){
        content = new ConcurrentLinkedQueue<E>();
    }
    WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public String toString() {
        return content.toString();
    }

    public void add(E elem){
        content.add(elem);
    }

    public E remove(){
        return content.poll();
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public boolean contains(E elem) {
        return content.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<E> elems) {
        return content.containsAll(elems);
    }
}
