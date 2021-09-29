package Exc_18;

public class main {
    public static void main(String[] args){
        Fork f = new Fork("metal","white","чайная");
        System.out.println(f);

        System.out.println("");
        Cwerkschnauzer cw = new Cwerkschnauzer("Vesta",5,100);
        System.out.println(cw.toString());

        System.out.println("");
        FurnitureShop fe = new FurnitureShop();
        fe.addElement(new Chair("Дерево","Петя",110,"white"));
        fe.addElement(new Chair("Кожа","Не Петя",110,"gray"));
        System.out.println(fe.toString());
    }
}
