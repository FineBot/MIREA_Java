package Exc_18;

abstract public class Dish {
    private String material;
    private String color;
    Dish(String material, String color){
        this.color=color;
        this.material=material;
    }
    String getColor(){return this.color;}
    String getMaterial(){return this.material;}

    void setColor(String color){this.color=color;}
    void setMaterial(String material){this.material=material;}
}


