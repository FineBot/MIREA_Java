package Exc_3;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    public void moveUp(){center.moveUp();}
    public void moveDown(){center.moveDown();}
    public void moveRight(){center.moveRight();}
    public void moveLeft(){center.moveLeft();}
    public String toString(){return "x: "+center.x+" \ny: "+center.y+"\nradius: "+radius;}
}
