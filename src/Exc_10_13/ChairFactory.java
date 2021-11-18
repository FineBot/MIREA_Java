package Exc_10_13;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair(int age) {
        VictorianChair VC = new VictorianChair(age);
        return VC;
    }

    @Override
    public MagicChair createMagicChair(int age) {
       MagicChair MC =new MagicChair(age);
       return MC;
    }

    @Override
    public FunctionalChair createFunctionalChair(int age) {
        FunctionalChair FC= new FunctionalChair(age);
        return FC;
    }
}
