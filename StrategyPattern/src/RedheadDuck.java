public class RedheadDuck extends Duck{
    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Redhead Duck");

    }
}
