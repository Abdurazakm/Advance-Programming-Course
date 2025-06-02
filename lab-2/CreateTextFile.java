import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {
    private Formatter output; // used to output text to file

    public void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("You do not have write access to this file.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error creating file.");
            System.exit(1);
        }
    }

    public void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ",
            "Enter account number, first name, last name and balance.",
            "Enter end-of-file indicator to end input.");

        while (input.hasNext()) {
            try {
                output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            } catch (Exception e) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }

            System.out.print("? ");
        }
    }

    public void closeFile() {
        if (output != null) {
            output.close();
        }
    }

    public static void main(String[] args) {
        CreateTextFile application = new CreateTextFile();

        application.openFile();
        application.addRecords();
        application.closeFile();
    }
}
