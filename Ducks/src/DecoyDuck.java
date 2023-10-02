public class DecoyDuck extends Duck{
    DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    void display(){
        System.out.println("I am a Decoy Duck.");
    }
}

