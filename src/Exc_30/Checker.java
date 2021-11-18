package Exc_30;
import java.lang.String;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public Checker(String str){
      System.out.println(checkPassword(str));
    }
    private boolean checkPassword(String str) {
        Pattern pattern=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9_]).{8,}$");
        Matcher matcher=pattern.matcher(str);
        return matcher.find();
    }

}


