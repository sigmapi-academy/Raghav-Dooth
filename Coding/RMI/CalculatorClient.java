package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator stub = (Calculator)registry.lookup("CalcService");
            System.out.println(" 15 + 5 = "+stub.add(15, 5));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
