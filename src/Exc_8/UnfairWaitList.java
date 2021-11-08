package Exc_8;

public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){
        super();
    }

    public void remove(E elem){
        if(content.peek()!=elem){
            content.remove(elem);

        }
    }

    public void moveToBack(){
        E head = content.poll();
        content.add(head);
    }
}
