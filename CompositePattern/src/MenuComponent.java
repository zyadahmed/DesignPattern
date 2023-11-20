import java.util.Iterator;

public abstract class MenuComponent {
    Iterator iterator = null;
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public abstract Iterator createIterator();
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }

}
