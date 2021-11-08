package Exc_14_15;

public final class Drink {
    private int price;
    private String name;
    private String desc;

    Drink(String name, String desc){
        price=0;
        this.name=name;

        this.desc=desc;
    }
    Drink(int price, String name, String desc){
        this.price=price;
        this.name=name;
        this.desc=desc;
    }

}
