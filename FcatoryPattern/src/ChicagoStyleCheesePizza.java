public class ChicagoStyleCheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        sauce = pizzaIngredientFactory.craeteSauce();
        cheese =pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
    }

}
