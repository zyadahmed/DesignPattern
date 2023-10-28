public class NYStyleSeaFoodPizza extends Pizza {
    public NYStyleSeaFoodPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.craeteSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
