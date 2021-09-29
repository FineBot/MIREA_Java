package Exc_3;

public class Rectangle extends Shape{
    private double width,length;
    Rectangle(String cl, boolean fil,double w,double l) {
        super(cl, fil);
        this.width=w;
        this.length=l;
    }



    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return length*width;
    }

    @Override
    double getPerimeter() {
        return 2*length+2*width;
    }
}
