package Exc_14_15x2;

public class OrderAlreadyAddedException extends Exception{
    private int number;
    public int getNumber(){return number;}
    public OrderAlreadyAddedException(String message, int num){

        super(message);
        number=num;
    }
}

