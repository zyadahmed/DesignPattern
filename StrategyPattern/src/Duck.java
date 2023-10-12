public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;
    public abstract void display();
    public void perfromFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All float");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
