package Exc_3;

public class Circle extends Shape {
    private double radius;

    Circle(String color, boolean filled, double rad) {
        super(color, filled);
        this.radius=rad;
    }

    public double getRadius(){return this.radius;}
    public void setRadius(double r){this.radius=r;}

    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }
}
