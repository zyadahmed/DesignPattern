public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
