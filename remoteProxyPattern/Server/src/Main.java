import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws RemoteException {
        try {
            LocateRegistry.createRegistry(1099);
            GumballMachineRemote gumballMachine = new GumballMachine(10);

            Naming.rebind("gumballRemote",gumballMachine);
            System.out.println("runnung");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}