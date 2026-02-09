package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
// remote interface
public interface Calculator extends Remote {
    int add(int a, int b) throws RemoteException;
}
