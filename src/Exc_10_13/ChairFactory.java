package Exc_10_13;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        VictorianChair VC = new VictorianChair(2);
        VC.sit();
        return VC;
    }

    @Override
    public MagicChair createMagicChair() {
       MagicChair MC =new MagicChair();
       MC.sit();
       return MC;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        FunctionalChair FC= new FunctionalChair();
        FC.sit();
        return FC;
    }
}
