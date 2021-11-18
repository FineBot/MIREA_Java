package Exc_10_13;

public class VictorianChair implements Chair {
    private int age;
    public int getAge(){return this.age;}
    public VictorianChair(int age){
        this.age=age;
    }
    @Override
    public void sit() {
        System.out.println(age);
    }
}

