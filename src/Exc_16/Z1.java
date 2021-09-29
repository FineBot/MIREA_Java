package Exc_16;

public class Z1 {
    void cFor(int[] digit){
        int result=0;
        for(int i = 0;i<digit.length;i++){
            result+=digit[i];
        }
        System.out.println(result);
    }
    void cWhile(int[] digit){
        int i = 0;
        int result=0;
        while(i<digit.length){
            result+=digit[i];
            i++;
        }
        System.out.println(result);
    }
    void cDo(int[] digit){
        int i = 0;
        int result=0;
        do{
            result+=digit[i];
            i++;
        }while (i<digit.length);

        System.out.println(result);

    }
}
