package Exc_1;
import java.lang.*;


class dog {
    private String name;
    private int age;
    public dog(String n, int a) {
        name = n;
        age = a;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public int intoHumanAge() {
        return age * 7;
    }
}

class ball {
    private int raduis;
    private int weight;
    private String material;
    public ball(int raduis, int weight,String material) {
        this.material=material;
        this.weight = weight;
        this.raduis = raduis;
    }
    public String getMaterial(){return this.material;}
    public int getRaduis(){return this.raduis;}
    public int getWeight(){return this.weight;}

    public void setWeight(int weight){this.weight=weight;}
    public void setRaduis(int raduis){this.weight=raduis;}
    public void setMaterial(String material){this.material=material;}
}

class book {
    private String author;
    private String name;
    private int pages;
    public book(String au, String name, int pages) {
        this.author=au;
        this.name = name;
        this.pages = pages;
    }
    public String getName(){return this.name;}
    public int getPages(){return this.pages;}
    public String getAuthor(){return this.author;}

    public void setName(String name){this.name=name;}
    public void setAuthor(String author){this.author=author;}
    public void setPages(int pages){this.pages=pages;}
}


class Exc_1 {
    static void print(String t) {
        System.out.println(t);
    }
    static void print(int t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        dog test = new dog("Diggy", 2);
        print("Инфа о собаке:");
        print("Имя: " + test.getName());
        print("Возвраст: " + test.getAge());
        print("Человесечкий возраст: " + test.intoHumanAge());
        print("");
        ball b = new ball(15,90,"Кожа");
        print("Инфа о шаре:");
        print("Радиус: "+b.getRaduis()+"cm");
        print("Материал: "+b.getMaterial());
        print("Вес: "+b.getWeight()+"g");
        print("");
        book book = new book("Толстой","Война и мир",999999);
        print("Инфа о книге:");
        print("Автор: "+book.getAuthor());
        print("Название: "+book.getName());
        print("Страниц: "+book.getPages());
    }
}

