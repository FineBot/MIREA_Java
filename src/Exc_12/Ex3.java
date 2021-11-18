package Exc_12;

import java.util.*;

class Shirts {
    public String size = "";
    public String color = "";
    public String Type = "";
    public String num = "";
}

public class Ex3 {
    public Ex3() {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        String[] shirtsd;
        Shirts[] arr = new Shirts[11];
        for (int i = 0; i < 11; i++) {
            shirtsd = shirts[i].split(",");
            Shirts obj = new Shirts();
            obj.num = shirtsd[0];
            obj.color = shirtsd[1];
            obj.Type = shirtsd[2];
            obj.size = shirtsd[3];
            arr[i]=obj;
        }
        for (int i = 0; i < 11; i++) {
            System.out.println("num: " + arr[i].num + " color: " + arr[i].color + " type: " + arr[i].Type + " size: " + arr[i].size);
        }
    }
}
