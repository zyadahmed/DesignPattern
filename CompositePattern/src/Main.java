// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        pancakeHouseMenu.add(new MenuItem("Regular Pancake", "Pancakes with maple syrup, butter", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles with whipped cream and berries", true, 2.49));
        pancakeHouseMenu.add(new MenuItem("Toast", "Toast with jam or butter", true, 1.99));

        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        dinerMenu.add(new MenuItem("Hamburger", "Hamburger with fries", true, 2.99));
        dinerMenu.add(new MenuItem("Hot Dog", "Hot dog with fries", true, 2.49));
        dinerMenu.add(new MenuItem("Milkshake", "Milkshake", true, 1.59));

        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        cafeMenu.add(new MenuItem("Steak", "Steak with fries and salad", true, 14.99));
        cafeMenu.add(new MenuItem("Chicken", "Chicken with mashed potatoes and vegetables", true, 11.99));
        cafeMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));

        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flaky crust, topped with vanilla ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Chocolate Cake", "Chocolate cake with whipped cream and a cherry", true, 2.99));
        dessertMenu.add(new MenuItem("Ice Cream", "Ice cream with your choice of topping", true, 1.99));

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}