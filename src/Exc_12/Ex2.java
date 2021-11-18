package Exc_12;
import java.util.*;
import java.util.regex.*;
import java.lang.Character;
class address{
    public String country;
    public String region;
    public String town;
    public String street;
    public String home;
    public String build;
    public String flatNum;
}
public class Ex2 {
    public Ex2(String str){
        char[] carr=str.toCharArray();
        address a = new address();
        for (int i=0;i<str.length();i++){
            switch(carr[i]){
                case '.':  String[] words1=str.split(".");
                    a.country=words1[0];
                    a.region=words1[1];
                    a.town=words1[2];
                    a.street=words1[3];
                    a.home=words1[4];
                    a.build=words1[5];
                    a.flatNum=words1[6];
                    break;
                case ',':  String[] words2=str.split(",");
                    a.country=words2[0];
                    a.region=words2[1];
                    a.town=words2[2];
                    a.street=words2[3];
                    a.home=words2[4];
                    a.build=words2[5];
                    a.flatNum=words2[6];
                    break;
                case ';':  String[] words3=str.split(";");
                    a.country=words3[0];
                    a.region=words3[1];
                    a.town=words3[2];
                    a.street=words3[3];
                    a.home=words3[4];
                    a.build=words3[5];
                    a.flatNum=words3[6];
                    break;
                case '-':  String[] words4=str.split("-");
                    a.country=words4[0];
                    a.region=words4[1];
                    a.town=words4[2];
                    a.street=words4[3];
                    a.home=words4[4];
                    a.build=words4[5];
                    a.flatNum=words4[6];
                    break;
            }
        }
        System.out.println("\n"+a.country+"\n"+a.region+"\n"+a.home+"\n"+a.build+"\n"+a.street+"\n"+a.flatNum);
    }
}
