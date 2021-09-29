package Exc_7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Z2 {
    static int n = 0;


    void game(Queue first, Queue second){
        while(n<106 && first.size()>0&&second.size()>0){
            n++;
            int a = (int) first.element();
            int b = (int) second.element();
            first.remove();
            second.remove();

            if(a==9&&b==0){
                a=0;
                b=9;
            }else if(a==0&&b==9){
                a=9;
                b=0;
            }
            if(a>b){
                first.add(a);
                first.add(b);
            }else{
                second.add(a);
                second.add(b);
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
        Queue first = new LinkedList();
        Queue second = new LinkedList();

        Scanner scan = new Scanner(System.in);

        for(int i = 4;i>=0;i--){
            first.add(scan.nextInt());
        }

        for(int i = 4;i>=0;i--){
            second.add(scan.nextInt());
        }
        game(first,second);

    }
}
