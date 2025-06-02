import java.sql.*;

public class DisplayAuthors {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("org.postgresql.Driver");
            
            // Connect to the database
        String url = "jdbc:postgresql://ep-polished-water-a493ait7-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require";
            Connection conn = DriverManager.getConnection(url);

            // Create a Statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // Execute the query and store the results in a ResultSet object
            ResultSet rs = stmt.executeQuery("SELECT authorId, firstName, lastName FROM Authors");

            // Iterate through the ResultSet and display the data
            while (rs.next()) {
                int authorId = rs.getInt("authorId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");

                System.out.println("Author ID: " + authorId + ", First Name: " + firstName + ", Last Name: " + lastName);
            }

            // Close the ResultSet, Statement, and Connection objects
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
