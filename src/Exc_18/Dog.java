package Exc_18;

abstract public class Dog {
    private String name;
    private int age;
    Dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getage() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }
}
