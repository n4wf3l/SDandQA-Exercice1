public class MallardDuck extends Duck{
    MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    void display(){
        System.out.println("I am a Mallard Duck.");
    }
}
