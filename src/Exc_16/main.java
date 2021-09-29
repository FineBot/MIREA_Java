package Exc_16;

public class main {
    public static void main(String[] args){
        System.out.println("Задание №1");
        int[] buff = {1,2,3};
        Z1 z = new Z1();
        z.cDo(buff);
        z.cFor(buff);
        z.cWhile(buff);

        System.out.println("\nЗадание №2");
        for(int i =0;i<args.length;i++){
            System.out.println(i+": "+args[i]);
        }

        System.out.println("\nЗадание №3");
        Z3 z3 = new Z3();

        System.out.println("\n\nЗадание №4");
        Z4 z4 = new Z4();

        System.out.println("\nЗадание №5");
        Z5 z5 = new Z5(5);
    }
}
