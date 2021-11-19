package Exc_14_15x2;

public class IllegalTableNumber extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public IllegalTableNumber(String message, int num) {

        super(message);
        number = num;
    }
}
