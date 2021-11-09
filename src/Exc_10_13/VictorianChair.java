package Exc_10_13;

public class VictorianChair implements Chair {
    public int age;
    public int getAge(){return this.age;}
    public VictorianChair(int age){
        this.age=age;
    }
    @Override
    public void sit() {
        VictorianChair a = new VictorianChair(2);
        System.out.println(a.getAge());
    }
}

