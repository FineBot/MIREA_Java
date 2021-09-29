package Exc_22;


import java.util.ArrayList;
import java.util.LinkedList;

class arrList {
    arrList() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Матрёшка");
        arr.add("Балалайка");
        arr.add("Медведь");
        arr.add("Демидович");
        arr.add(2, "Момент");
        arr.set(3, "Валидол");
        for (String i : arr) {
            System.out.println(i);
        }
        if (arr.contains("Victory")) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class linkList {
    linkList() {
        LinkedList<String> earlBio = new LinkedList<String>();
        earlBio.add("1");
        earlBio.add("2");
        earlBio.add("3");
        earlBio.add("4");
        for (String i : earlBio) {
            System.out.println(i);
        }
    }
}

class myList<AnyType> {
    Node firstNode = null;

    class Node<AnyType> {
        Node<AnyType> next = null;
        AnyType data;

        Node(AnyType data) {
            this.data = data;
        }
    }

    void add(AnyType data) {
        Node buff = this.firstNode;
        if (buff == null) {
            this.firstNode = new Node(data);
        } else {
            while (buff.next != null)
                buff = buff.next;

            buff.next = new Node(data);
        }
    }

    AnyType get(int index) {
        Node buff = this.firstNode;
        for( int i =0;i<index;i++){
            buff = buff.next;
        }
        return (AnyType) buff.data;
    }

    int size() {
        Node buff = this.firstNode;
        if (buff == null) {
            return 0;
        } else {
            int n = 1;
            while (buff.next != null) {
                n++;
                buff = buff.next;
            }
            return n;
        }
    }
}

public class main {
    public static void main(String[] args) {
        arrList a = new arrList();
        System.out.println("");

        linkList b = new linkList();

        myList<Integer> t = new myList<Integer>();
        t.add(7);
        t.add(8);
        t.add(9);
        System.out.println("");
        for(int i =0;i<t.size();i++){
            System.out.println(t.get(i));
        }
    }
}
