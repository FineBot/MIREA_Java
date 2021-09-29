package Exc_7;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Z1 {
    static int n = 0;

    private void pushToTop(Stack b, int e){

        Stack buff = new Stack();

        int k =b.size();
        for(int i = 0;i<k;i++) buff.push(b.pop());
        buff.push(e);

        int t = buff.size();
        for(int i = 0;i<t;i++) b.push(buff.pop());

    }

    void game(Stack first, Stack second){
        while(n<106 && first.size()>0&&second.size()>0){
            n++;
            int a = (int) first.pop();
            int b = (int) second.pop();
            if(a==9&&b==0){
                a=0;
                b=9;
            }else if(a==0&&b==9){
                a=9;
                b=0;
            }
            if(a>b){
                pushToTop(first,a);
                pushToTop(first,b);
            }else{
                pushToTop(second,a);
                pushToTop(second,b);
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
        Stack first = new Stack();
        Stack second = new Stack();

        int[] buff = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            buff[i] = scan.nextInt();
        }
        for(int i = 4;i>=0;i--){
            first.push(buff[i]);
        }

        buff = new int[5];

        for(int i = 0;i<5;i++){
            buff[i] = scan.nextInt();
        }
        for(int i = 4;i>=0;i--){
            second.push(buff[i]);
        }
        game(first,second);

    }
}
