package Exc_3;

public class MovablePoint implements Movable {
    public int x,y, xSpeed, ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void moveUp(){this.y-=this.ySpeed;}
    public void moveDown(){this.y+=this.ySpeed;}
    public void moveRight(){this.x+=this.xSpeed;}
    public void moveLeft(){this.x-=this.xSpeed;}
    public String toString(){return "x: "+this.x+" y: "+this.y;}
}
