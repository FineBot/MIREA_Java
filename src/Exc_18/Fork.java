package Exc_18;

public class Fork extends Dish {
    private String type;

    Fork(String material, String color, String type) {
        super(material, color);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "type='" + type + "'\n" +
                "color='" + getColor() + "'\n" +
                "material='" + getMaterial() + "'\n" +
                '}';
    }
}
