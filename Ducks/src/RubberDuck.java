public class RubberDuck extends Duck{
    RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    @Override
    void display(){
        System.out.println("I am a Rubber Duck.");
    }
}
