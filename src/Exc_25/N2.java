package Exc_25;

public class N2<E> {
    E array[];
    N2(E e[]){
        array=e;
    }
    public String toString(){
        String result="";
        for(E e : array){
            result+=e.toString()+", ";
        }

        return result;
    }
}
