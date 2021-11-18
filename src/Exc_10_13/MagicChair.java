package Exc_10_13;

public class MagicChair implements Chair {
    private int age=0;
    public void doMagic() throws InterruptedException {
        for(int i=0;i<age;i++){
            System.out.println(i+1);
            Thread.sleep(200);
        }
    }

    MagicChair(int age){
        this.age=age;
    }

    @Override
    public void sit() {
        try {
            doMagic();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
