public class NYStyleCheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory ;
    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.craeteSauce();
    }
}
