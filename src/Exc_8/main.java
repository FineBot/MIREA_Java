package Exc_8;


import java.lang.*;

public class main {
    public static void main(String[] args){
        WaitList<Integer> a = new WaitList<Integer>();
        a.add(5);
        a.add(12);
        a.add(-4);
        a.add(35);
        UnfairWaitList<Integer> b = new UnfairWaitList<Integer>();

        b.add(43);
        b.add(-10);
        b.add(8);
        b.moveToBack();
        b.remove(8);
        System.out.println(b);


        BoundedWaitList<Integer> c = new BoundedWaitList<>(2);
        c.add(15);
        c.add(2);
        c.add(1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b.contains(12));
        System.out.println(a.contains(12));
        System.out.println(c.contains(1));
    }
}
