package Exc_18;

public class Chair extends Furniture {
    public Chair(String material, String name, int price, String color) {
        super(material, color, name, price);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
