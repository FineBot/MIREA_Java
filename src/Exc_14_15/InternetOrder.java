package Exc_14_15;

import java.util.*;

public class InternetOrder<AnyType> {
    Node firstNode = null;

    class Node<AnyType> {
        Node<AnyType> next = null;
        Node<AnyType> prev = null;
        AnyType data;

        Node(AnyType data) {
            this.data = data;
        }
    }

    void addLast(AnyType data) {
        Node buff = this.firstNode;
        if (buff == null) {
            this.firstNode = new Node(data);
        } else {
            while (buff.next != null)
                buff = buff.next;

            buff.next = new Node(data);
            buff.next.prev = buff;
        }
    }

    AnyType getFirst() {
        Node buff = this.firstNode;
        this.firstNode = this.firstNode.next;

        return (AnyType) buff.data;
    }

    AnyType get(int i) {
        Node buff = this.firstNode;
        for (int j = 0; j < i; j++) {
            buff = buff.next;
        }
        return (AnyType) buff.data;
    }

    public void remove(int i) {
        Node buff = this.firstNode;
        for (int j = 0; j < i; j++) {
            buff = buff.next;
        }
        if (i == 0) {
            firstNode = firstNode.next;
        } else {
            buff.next.prev = buff.prev;
            buff.prev.next = buff.next;
        }

    }

    public void remove(String name) {
        Node lastFind = null;

        Node buff = this.firstNode;
        Item or = (Item) ((Order) get(0)).getObj();
        if (or.getName() == name) {
            lastFind = this.firstNode;
        }
        while (buff.next != null) {
            buff = buff.next;
            Item f = (Item) ((Order) buff.data).getObj();
            if (f.getName() == name) {
                lastFind = buff;
            }
        }

        if (lastFind != null) {
            lastFind.next.prev = lastFind.prev;
            lastFind.prev.next = lastFind.next;
        }
    }

    public void removeAll(String name) {
        Node buff = this.firstNode;
        Item or = (Item) ((Order) get(0)).getObj();
        if (or.getName() == name) {
            this.firstNode = this.firstNode.next;
            this.firstNode.prev = null;
        }
        while (buff.next != null) {
            buff = buff.next;
            Item f = (Item) ((Order) buff.data).getObj();
            if (f.getName() == name) {
                buff.next.prev = buff.prev;
                buff.prev.next = buff.next;
            }
        }
    }

    public Order[] getOrders() {
        Order[] result = new Order[this.size()];
        for (int i = 0; i < this.size(); i++)
            result[i] = (Order) this.get(i);

        return result;
    }

    public String[] getOrdersName() {
        ArrayList<String>result = new ArrayList<>();
        for (int i = 0; i < this.size(); i++){
            Item it = (Item)((Order)this.get(i)).getObj();
            if(result.contains(it.getName())){
            }else{
                result.add(it.getName());
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public Order[] getSorteredOrders(){
        Order[] buff = getOrders();
        Arrays.sort(buff, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                Item one = (Item)((Order)o1).getObj();
                Item two = (Item)((Order)o2).getObj();
                if(one.getPrice()>two.getPrice()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        return buff;
    }

    public Item getOrder(int i) {
        return (Item) ((Order) this.get(i)).getObj();
    }

    public double getCostSummary() {
        double result = 0;
        for (int i = 0; i < this.size(); i++)
            result += this.getOrder(i).getPrice();

        return result;
    }

    public int dishQuantity() {
        return this.size();
    }

    public int dishQuantity(String name) {
        int result=0;

        if(((Item)((Order)firstNode.data).getObj()).getName()==name)
            result++;

        Node buff = this.firstNode;
        while (buff.next != null) {
            buff = buff.next;
            Item f = (Item) ((Order) buff.data).getObj();
            if (f.getName() == name) {
                result++;
            }
        }

        return result;
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
