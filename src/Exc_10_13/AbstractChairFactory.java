package Exc_10_13;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair(int age);
    FunctionalChair createFunctionalChair(int age);
}
