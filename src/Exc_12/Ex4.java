package Exc_12;

public class Ex4 {
    public Ex4(String str){

        char[] carr=str.toCharArray();
        System.out.println(str.substring(0,str.length()-9-1)+" "+ str.substring(str.length()-9-1,str.length()-7)+" "+ str.substring(str.length()-7,str.length()-4)+" "+str.substring(str.length()-4,str.length()-2)+" "+str.substring(str.length()-2,str.length()));


    }
}
