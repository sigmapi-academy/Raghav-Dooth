package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// implementing Remote Object
public class CalculatorImp extends UnicastRemoteObject implements RMI.Calculator{
    protected CalculatorImp() throws RemoteException{
        super();
    }
    public int add(int a, int b){
        return a+b;
    }
}
