package Exc_2;

class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    public char getGender(){return this.gender;}
    public void setEmail(String email){this.email=email;}
}

class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(){}
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }

}

public class Exc_2 {
    static void print(String t) {
        System.out.println(t);
    }
    static void print(int t) {
        System.out.println(t);
    }
    static void print(Ball bl) {
        System.out.println("x="+bl.getX()+", y="+bl.getY());
    }
    public static void main(String args[]){
        Author au = new Author("Толстой","tolstoy@yahoo.com",'м');
        print("Инфа о авторе:");
        print("Имя: "+au.getName());
        print("Email: "+au.getEmail());
        print("Пол: "+au.getGender());
        print("");

        print("Инфа о шаре:");
        Ball bl = new Ball(0.0,0.0);
        print(bl);
        bl.move(132.13,15.9);
        print("После перемещения:");
        print(bl);
    }

}

