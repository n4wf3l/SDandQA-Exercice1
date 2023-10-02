public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new RedHeadDuck(), new RubberDuck(), new DecoyDuck()};

        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performQuack();
            duck.performFly();
            System.out.println();
        }

        ducks[0].setQuackBehavior(new MuteQuack());
        ducks[1].setFlyBehavior(new FlyNoWay());
        ducks[3].setQuackBehavior(new FakeQuack());

        System.out.println("\nAfter changing behaviors:\n");

        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performQuack();
            duck.performFly();
            System.out.println();
        }
    }
}