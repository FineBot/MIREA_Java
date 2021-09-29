package Exc_3;

public class Square extends Rectangle{
    Square(double side, String color, boolean fil) {
        super(color, fil, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double si){
        super.setLength(si);
        super.setWidth(si);

    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
