package Exc_14_15;


interface Item {
    int getPrice();

    String getName();

    String getDesc();
}

public class main {

    public static void main(String[] args){
       TablesOrderManager a = new TablesOrderManager();
       a.add(new Drink("name"," desc"));
       a.add(new Drink("name1"," desc"));
       a.add(new Drink("name2"," desc"));
       System.out.println(a.getOrder(1).getName());
       a.removeOrder(1);
       System.out.println(a.getOrder(1).getName());

    }
}
