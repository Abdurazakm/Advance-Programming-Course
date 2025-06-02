import sun.misc.Signal; 
import sun.misc.SignalHandler; 
public class SignalExample { 
   public static void main(String[] args) throws InterruptedException 
  { 
     // Create a signal handler 
     SignalHandler handler = new SignalHandler() { 
    @Override 
    public void handle(Signal signal) { 
      System.out.println("Received signal: " + signal.getName()); 
   }
};
    // Register the signal handler for the TERM signal    
    Signal.handle(new Signal("TERM"), handler); 
    // Wait for the TERM signal   
    Thread.sleep(Long.MAX_VALUE); 
  } 
}

