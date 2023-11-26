
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, the gumball is already ready!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have already turned the crank!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You cannot turn the crank twice to get another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.relaseBall();

        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, sold out!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

