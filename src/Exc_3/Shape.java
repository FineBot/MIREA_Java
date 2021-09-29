package Exc_3;

public abstract class Shape {
    private String color;
    private boolean filled;

    Shape(String cl, boolean fil){
        color=cl;
        filled=fil;
    }
    public String getColor(){return this.color;}
    public void setColor(String cl){this.color=cl;}
    public boolean isFilled(){return this.filled;}
    public void setFilled(boolean fil){this.filled=fil;}
    abstract double getArea();
    abstract double getPerimeter();

}
