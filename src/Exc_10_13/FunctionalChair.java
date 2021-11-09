package Exc_10_13;

public class FunctionalChair implements Chair{
    public int sum(int a,int b){return a+b;}

    @Override
    public void sit() {
        System.out.println(sum(2,3));
    }
}
