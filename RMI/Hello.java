// File: Hello.java
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}

// This interface defines a remote method `sayHello` that can be invoked by RMI clients.
// It extends the `Remote` interface, which is required for all RMI remote interfaces.
// The `sayHello` method throws a `RemoteException`, which is necessary for remote method invocations.
