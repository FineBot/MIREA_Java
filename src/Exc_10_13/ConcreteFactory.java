package Exc_10_13;
import java.util.Scanner;
public class ConcreteFactory implements ComplexAbstractFactory {
    public int re;
    public int im;

    @Override
    public Complex createComplex(int re, int im){
        this.re=re;
        this.im=im;
       Complex a =new Complex();
       a.real=re;
       a.image=im;
       return a;
    }
    @Override
    public Complex createComplex(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите мнимую часть");
        this.im = myScanner.nextInt();
        System.out.println("Введите действительную часть");
        this.re = myScanner.nextInt();
        Complex a =new Complex();
        a.real=re;
        a.image=im;
        return a;

    }
}
