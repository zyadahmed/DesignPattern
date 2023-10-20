import java.io.BufferedInputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bevarage bevarage2 = new Espresso();
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription()+" cost : "+ bevarage2.cost());
        Bevarage bevarage = new Whip(new Mocha(new Espresso()));
        System.out.println(bevarage.getDescription());

    }
}