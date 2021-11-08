package Exc_25;

import javax.xml.catalog.Catalog;
import java.io.File;
import java.util.ArrayList;

class N1<E>{
    public void convert(E e[]){
        ArrayList<E> list = new ArrayList<>();
        for (E var : e){
            list.add(var);
        }
        System.out.println(list);
    }
}

class N3<E>{
    E array[];
    N3(E e[]){
        array=e;
    }
    public E get(int i){
        return array[i];
    }
}



public class main {
    private static ArrayList<String> directoryElements = new ArrayList<>();
    public static void Catalog(File file){
        if(file.isDirectory()){
            for(String e : file.list()){
                directoryElements.add(e);
            }
            for (int i=0;i<5;i++){
                System.out.print(directoryElements.get(i)+", ");
            }
        }else{
            System.out.println("Not directory");
        }
    }

    public static void main(String[] args){
        N1<String> n1 = new N1();
        String[] arr={"one", "two"};
        n1.convert(arr);

        Integer arr2[]={1,2,3};
        N2<Integer> n2 = new N2<Integer>(arr2);
        System.out.println(n2.toString());

        Integer arr3[]={4,5,6};
        N3<Integer> n3 = new N3<Integer>(arr3);
        System.out.println(n3.get(1));

        Catalog(new File("D:/"));
    }
}
