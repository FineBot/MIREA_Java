package Exc_28;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex1 {
    public Ex1(String str){
        Pattern pattern=Pattern.compile("(((\\d+)(\\.?(\\d{1,2})))?\\s?(((USD)|(EU)|(RUB))?))");
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
