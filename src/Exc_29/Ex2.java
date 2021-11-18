package Exc_29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public Ex2(String str){
        System.out.println(checker(str));
    }
    public boolean checker(String str){

        return Pattern.compile("^[a-zA-Z0-9\\.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+$").matcher(str).find();
    }
}
