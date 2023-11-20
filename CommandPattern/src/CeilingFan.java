public class CeilingFan {
    public static final int HIGH = 3 ;
    public static final int MEDUIM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
    public void high() {
        speed = HIGH;
        System.out.println("High");
    }
    public void meduim() {
        speed = MEDUIM;
        System.out.println("Meduim ");
    }
    public void low() {
        speed = LOW;
        System.out.println("LOW");
    }
    public void off() {
        speed = OFF;
        System.out.println("OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
