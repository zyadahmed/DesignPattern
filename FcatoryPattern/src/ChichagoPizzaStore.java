public class ChichagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza(pizzaIngredientFactory);

        }else {
            return null;
        }
    }
}
