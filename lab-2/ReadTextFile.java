import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        Scanner input = null;

        try {
            input = new Scanner(new File("clients.txt"));

            while (input.hasNext()) {
                AccountRecord record = new AccountRecord();

                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());

                System.out.printf("%d %s %s %.2f%n",
                    record.getAccount(), record.getFirstName(),
                    record.getLastName(), record.getBalance());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file.");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}

