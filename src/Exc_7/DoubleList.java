package Exc_7;

public class DoubleList<AnyType> {
    Node firstNode=null;
    class Node<AnyType>{
        Node<AnyType> next=null;
        Node<AnyType> prev=null;
        AnyType data;

        Node(AnyType data){
            this.data=data;
        }
    }

    void addLast(AnyType data){
        Node buff = this.firstNode;
        if(buff==null){
            this.firstNode=new Node(data);
        }else{
            while(buff.next!=null)
                buff=buff.next;

            buff.next=new Node(data);
        }
    }
    AnyType getFirst(){
        Node buff = this.firstNode;
        this.firstNode=this.firstNode.next;

        return (AnyType) buff.data;
    }
    int size(){
        Node buff = this.firstNode;
        if(buff==null){
            return 0;
        }else{
            int n = 1;
            while(buff.next!=null){
                n++;
                buff=buff.next;
            }
            return n;
        }
    }
}
