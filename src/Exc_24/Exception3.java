package Exc_24;

import java.util.Scanner;
public class Exception3 {
    public void getKey()  {
        boolean flag=false;
        while(flag!=true){
            flag=true;
            Scanner myScanner = new Scanner( System.in );
            System.out.print("Enter Key ");
            String key= myScanner.nextLine();

            try {
                printDetails(key);
             } catch (Exception e) {
              key=null;
              flag=false;
              System.out.println("Error!");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}

