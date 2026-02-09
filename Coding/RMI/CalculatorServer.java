package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Calculator stub = new CalculatorImp();
            Registry registry = LocateRegistry.createRegistry(1099); //Start RMI registry in code
            registry.rebind("CalcService", stub);
            System.out.println("Server is running...");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
