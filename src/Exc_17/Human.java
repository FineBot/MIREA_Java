package Exc_17;

public class Human {
    Head head;
    Leg leg;
    Hand hand;
    Human(String hairColor, int legSize, int handSize){
        this.head=new Head(hairColor);
        this.leg=new Leg(legSize);
        this.hand=new Hand(handSize);
    }

    public String toString(){
        return "Голова:\n\tЦвет волос: "+head.gethairColor()+"\nНога:\n\tРазмер: "+leg.getSize()+"\nРука:\n\tРазмер руки: "+hand.getSize();
    }

}

class Head{
    String hairColor;
    Head(String hairColor){
        this.hairColor=hairColor;
    }
    String gethairColor(){return this.hairColor;}
    void sethairColor(String hairColor){this.hairColor=hairColor;}
}

class Leg{
    int size;
    Leg(int size){
        this.size=size;
    }
    int getSize(){return this.size;}
    void setSize(int size){this.size=size;}
}
class Hand{
    int size;
    Hand(int size){
        this.size=size;
    }
    int getSize(){return this.size;}
    void setSize(int size){this.size=size;}
}
