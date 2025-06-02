import java.io.*;

public class PipeExample {
  public static void main(String[] args) throws IOException {
    // Create a PipedInputStream and a PipedOutputStream
    PipedInputStream in = new PipedInputStream();
    PipedOutputStream out = new PipedOutputStream(in);
    // Write some data to the output stream
    out.write("Hello, world!".getBytes());
    // Read the data from the input stream
    byte[] buffer = new byte[1024];
    int bytesRead = in.read(buffer);
    String message = new String(buffer, 0, bytesRead);
    System.out.println(message);
    // Close the streams out.close();
    in.close();
  }
}
