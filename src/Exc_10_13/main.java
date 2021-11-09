package Exc_10_13;

public class main {
    public static void main(String[] args){
        ConcreteFactory a = new ConcreteFactory();
        Complex b;
        b=a.createComplex();
        System.out.println(b.real+"  "+b.image);
        b=a.createComplex(2,5);
        System.out.println(b.real+"  "+b.image);
        AbstractChairFactory f = new ChairFactory();
        VictorianChair v1 = f.createVictorianChair();
        Client c1 = new Client();
        c1.setChair(v1);
        c1.sit();
    }
}

