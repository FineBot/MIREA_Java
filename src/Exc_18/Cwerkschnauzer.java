package Exc_18;

public class Cwerkschnauzer extends Dog{
    private int health;
    Cwerkschnauzer(String name, int age, int health){
        super(name, age);
        this.health=health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Cwerkschnauzer{\n" +
                "health=" + health +"\n"+
                "name=" + getName() +"\n"+
                "age=" + getage() +"\n"+
                '}';
    }
}
