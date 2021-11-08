package Exc_14_15;

import Exc_18.Dish;

public class TablesOrderManager {
    private InternetOrder<Order> data = new InternetOrder<>();

    public void add(Dish elem) {
        Order<Dish> buff = new Order(elem);
        data.addLast(buff);
    }

    public void add(Drink elem) {
        Order<Drink> buff = new Order(elem);
        data.addLast(buff);
    }

    public Item getOrder(int i){return data.getOrder(i);}
    public void removeOrder(int i) {
        data.remove(i);
    }

    public Order[] getOrders() {
        Order[] result = new Order[data.size()];
        for (int i = 0; i < data.size(); i++)
            result[i] = data.get(i);

        return result;
    }


}
