public class NYPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {
        pizzaIngredientFactory =  new NYPizzaIngredientFactory();
        if(type.equals("chesse")){
            return new NYStyleCheesePizza(pizzaIngredientFactory);
        }else if (type.equals("Seafood"))
            return new NYStyleSeaFoodPizza(pizzaIngredientFactory);
        else return null;
    }
}
