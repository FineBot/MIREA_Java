package Exc_24;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Exception1 a = new Exception1();
        a.exceptionDemo();
        String intString = null;
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            intString = myScanner.nextLine();
            a.printMessage(intString);

        } catch (RuntimeException e) {

        }


//        Exception2 b = new Exception2();
//        try {
//            b.getKey();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Exception3 c =new Exception3();
//        c.getKey();

    }

}