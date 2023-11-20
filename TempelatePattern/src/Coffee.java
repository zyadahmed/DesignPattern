public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through ﬁlter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
