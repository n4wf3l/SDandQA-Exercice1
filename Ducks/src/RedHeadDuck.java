public class RedHeadDuck extends Duck{
    RedHeadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());

    }
@Override
    void display(){
    System.out.println("I am a RedHead Duck");
}
}

