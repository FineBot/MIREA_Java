package Exc_18;

import java.util.Arrays;

public class FurnitureShop {
    int n = 0;
    Furniture arr[] = new Furniture[5];

    FurnitureShop(){}

    void addElement(Chair c){
        arr[n]=c;
        n++;
    }

    @Override
    public String toString() {
        String res="";
        for (int i = 0;i<n;i++){
            res+=arr[i].toString()+"; ";
        }
        return "FurnitureShop{" +
                "n=" + n +
                ", arr=" + res +
                '}';
    }
}
