package Exc_17;

class Circle{
    int radius;
    String color;
    Circle(int radius, String color){
        this.radius=radius;
        this.color=color;
    }
    int getRadius(){return this.radius;}
    String getColor(){return this.color;}

    void setRadius(int radius){this.radius=radius;}
    void setColor(String color){this.color=color;}

}

public class main {
    public static void main(String[] args){
        Circle c= new Circle(15,"black");
        System.out.println(c.getColor());
        System.out.println(c.getRadius());

        System.out.println("");
        Human h = new Human("green",45,20);
        System.out.println(h.toString());

        System.out.println("");
        Book MM = new Book("Булгаков","Мастер и Маргарита",1967,512);
        System.out.println("Книга:");
        System.out.println("\tАвтор: "+MM.getAuthor());
        System.out.println("\tНазвание: "+MM.getName());
        System.out.println("\tГод написания: "+MM.getYear());
        System.out.println("\tКоличество страниц: "+MM.getPages());
    }
}
