package Exc_24;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws EmptyLineException, IncorrectFormatException {
        Ex1 a=new Ex1();
        a.CheckAns();
        System.out.println("");
        LabClassUI b=new Ex2();
        b.setNameandSort();
    }
}