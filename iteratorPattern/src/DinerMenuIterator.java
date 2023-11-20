import java.util.Iterator;
public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position  = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    public void remove(){
        if (position < 0){
            throw new IllegalArgumentException("index invalid");
        }
        if (items[position-1]!=null){
            for (int i = position-1;i<(items.length-1);i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
