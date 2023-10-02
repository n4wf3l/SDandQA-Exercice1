public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    Duck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void swim() {
        System.out.println("All ducks can swim.");
    }

    void display() {
        System.out.println("I am a generic duck.");
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }
}