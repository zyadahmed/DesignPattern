import java.util.ArrayList;

public abstract class Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in ofﬁcial PizzaStore box");
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                '}';
    }
}
