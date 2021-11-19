package Exc_31_32;

import javax.swing.*;

import Exc_14_15x2.*;

public class main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        OrderManager orders = new OrderManager();
        InternetOrder one = new InternetOrder();
        one.add(new orderItem(new Drink(45, "Молоко", "описание")));
        one.add(new orderItem(new Dish(45, "Макароны", "описание")));
        try {
            orders.add("Москва, проспект Верндаского д. 78", one);
        } catch (OrderAlreadyAddedException | IllegalTableNumber e) {
            e.printStackTrace();
        }

        RestaurantOrder two = new RestaurantOrder();
        two.add(new orderItem(new Dish(45, "рыба", "описание")));
        try {
            orders.add("Столик 5", two);
        } catch (OrderAlreadyAddedException | IllegalTableNumber e) {
            e.printStackTrace();
        }

        System.out.println(orders.getCostSummary());

        JFrameClass j = new JFrameClass(orders);
    }
}
