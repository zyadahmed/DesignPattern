import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenu implements  Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",true,2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",
                true,3.49);
    }
    public void addItem(String name,String description,
                        boolean vegterian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegterian,price);
        menuItems.add(menuItem);
    }
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
