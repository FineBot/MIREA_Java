package Exc_14_15;

public class Order<E> {
    private E obj;

    public Order(E obj) {
        this.obj = obj;
    }

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
