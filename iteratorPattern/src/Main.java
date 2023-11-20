// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
       PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
       DinerMenu dinerMenu = new DinerMenu();
        ArrayList menu = new ArrayList<>();
        menu.add(pancakeHouseMenu);
        menu.add(dinerMenu);
       Waitress waitress = new Waitress(menu);
       waitress.printMenu();
    }
}