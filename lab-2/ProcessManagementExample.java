import java.io.*;
public class ProcessManagementExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Start the external program
        Process process = Runtime.getRuntime().exec("notepad.exe test.txt");
        // Check if the process is still running
        if (process.isAlive()) {
            // Print the process ID
            System.out.println("Process ID: " + process.pid());
            // Get the input and error streams of the process
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            // Print the output and error messages of the process
            String line;
            while ((line = input.readLine()) != null) { 
                System.out.println("Output: " + line);
            }
            while ((line = error.readLine()) != null) {
                System.out.println("Error: " + line);
            }
            // Wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("Process exited with code " + exitCode);
        }
    }
}

            

