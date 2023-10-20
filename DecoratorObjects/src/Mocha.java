public class Mocha extends  CondimentDecorator{
    Bevarage bevarage;
    public Mocha(Bevarage bevarage){
        this.bevarage =  bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + bevarage.cost();
    }
}
