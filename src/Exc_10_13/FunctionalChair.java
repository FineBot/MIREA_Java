package Exc_10_13;

public class FunctionalChair implements Chair{
    private int age=0;
    public FunctionalChair(int age) {
        this.age=age;
    }

    public int sum(int a, int b){return a+b;}

    @Override
    public void sit() {
        System.out.println(sum(age,age));
    }
}
