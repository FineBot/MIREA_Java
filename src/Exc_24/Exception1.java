package Exc_24;

import java.util.Scanner;
public class Exception1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.nextLine(); int i=0;
        try {
            i= Integer.parseInt(intString);
        }
        catch(NumberFormatException e){
            System.out.println("Ошибка");
        }
        try {
            System.out.println(2 / i);
        }
        catch(Exception e) {
            System.out.println("Ошибка");
        }
//        finally {
//            System.out.println("Программа закончена");
//        }
    }
    public String getDetails(String key) {
        try {
            if(key==null){
                throw new NullPointerException( "null key in getDetails" );
            }
        }
        catch (NullPointerException e){
            key="Ключ нулевой";
        }
        // do something with the key
        return key;
    }
    public void printMessage(String key) {
        String message = getDetails(key);

        System.out.println( message );
    }


}
//numberformat exception
