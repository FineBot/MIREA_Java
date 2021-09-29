package Exc_7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Z4 {
    static int n = 0;


    void game(DoubleList<Integer> first, DoubleList<Integer> second){
        while(n<106 && first.size()>0&&second.size()>0){
            n++;
            int a = (int) first.getFirst();
            int b = (int) second.getFirst();


            if(a==9&&b==0){
                a=0;
                b=9;
            }else if(a==0&&b==9){
                a=9;
                b=0;
            }
            if(a>b){
                first.addLast(a);
                first.addLast(b);
            }else{
                second.addLast(a);
                second.addLast(b);
            }
        }
        if(n==106){
            System.out.println("botva");
        }else if(first.size()==0)
            System.out.println("second "+n);
        else
            System.out.println("first "+n);

    }

    public void main(){
        DoubleList first = new DoubleList();
        DoubleList second = new DoubleList();

        Scanner scan = new Scanner(System.in);

        for(int i = 4;i>=0;i--){
            first.addLast(scan.nextInt());
        }

        for(int i = 4;i>=0;i--){
            second.addLast(scan.nextInt());
        }
        game(first,second);

    }
}
