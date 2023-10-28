public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new MeduimCrustDough();
    }

    @Override
    public Sauce craeteSauce() {
        return new SpicySauce();
    }

    @Override
    public Cheese createCheese() {
        return new AmercianCheese();
    }
}
