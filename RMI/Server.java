
// File: Server.java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // default RMI port
            registry.rebind("HelloService", obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
// This code sets up an RMI server that binds the HelloImpl object to the RMI
// registry under the name "HelloService".
// The server listens on the default RMI port (1099) and is ready to accept
// client requests.