import java.util.ArrayList;
import java.util.Iterator;
public class Waitress {
    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }
}
