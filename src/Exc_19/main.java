package Exc_19;

/*

    Задание 1

 */

interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    Planet(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}

class Cat implements Nameable {
    private String name;

    Cat(String n) {
        this.name = n;
    }


    @Override
    public String getName() {
        return this.name;
    }
}
/*
  end
 */

/*

    Задание 2

 */

interface Priceable {
    int getPrice();
}
abstract class test{

    abstract public void dsada();
}
class MSI_GL75_9SCK implements Priceable{
    private int price;

    MSI_GL75_9SCK(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}

public class main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        System.out.println(earth.getName());

        Cat v = new Cat("Ва465465сёк");
        System.out.println("\n" + v.getName());

        MSI_GL75_9SCK laptop = new MSI_GL75_9SCK(105000);
        System.out.println("\n" + laptop.getPrice());



    }
}
