package Exc_14_15;

public final class Dish implements Item {
    private int price;
    private String name;
    private String desc;

    Dish(String name, String desc){
        price=0;
        this.name=name;

        this.desc=desc;
    }
    Dish(int price, String name, String desc){
        this.price=price;
        this.name=name;
        this.desc=desc;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
