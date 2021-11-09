package Exc_9;
import java.util.Scanner;
import java.lang.String;



public class Ex1 {
    public void CheckAns(){

        Scanner myScanner = new Scanner(System.in);
        String INN=null;
        System.out.println("Введите ваше имя");
        String Name=myScanner.next();
        System.out.println("Введите вашу фамилию");
        String Surname=myScanner.next();
        System.out.println("Введите ваш ИНН");
        try {
            INN = myScanner.next();
            if(INN.length()<12) {
                throw new MyException ("Incorrect INN length!");
            }

        }
        catch (Exception e){
            System.out.println("Incorrect INN!");
        }

    }
}
