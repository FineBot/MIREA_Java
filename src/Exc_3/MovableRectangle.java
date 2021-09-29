package Exc_3;

public class MovableRectangle implements Movable{
    MovablePoint leftTop,rightBottom;
    MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed) {
        leftTop=new MovablePoint(x1,y1,xSpeed,ySpeed);
        rightBottom=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public void moveUp(){
        leftTop.moveUp();
        rightBottom.moveUp();
    }
    public void moveDown(){
        leftTop.moveDown();
        rightBottom.moveDown();
    }
    public void moveLeft(){
        leftTop.moveLeft();
        rightBottom.moveLeft();
    }
    public void moveRight(){
        leftTop.moveRight();
        rightBottom.moveRight();
    }
    public String toString(){
        return "FirstPoint:\n\tx: "+leftTop.x+"\n\ty: "+leftTop.y+"" +
                "\nSecondPoint:\n\tx: "+rightBottom.x+"\n\ty: "+rightBottom.y;
    }
}
