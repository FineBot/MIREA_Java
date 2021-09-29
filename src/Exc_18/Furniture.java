package Exc_18;

abstract public class Furniture {
    String material, color, name;
    int price;
    Furniture(String material, String color, String name, int price){
        this.color=color;
        this.material=material;
        this.name=name;
        this.price=price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
