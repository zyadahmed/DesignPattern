import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable<>();

    public CafeMenu() {
        addItem("“Veggie Burger and Air Fries","Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true,3.99);
        addItem("Soup of the day","Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true,2.05);

    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
