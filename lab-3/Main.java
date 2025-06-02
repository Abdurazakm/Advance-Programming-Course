import java.sql.*;

// To run the driver easily, use these two commands:
// javac -cp ".;postgresql-42.7.5.jar" Main.java
// java -cp ".;postgresql-42.7.5.jar" Main

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://ep-polished-water-a493ait7-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require";
        String user = "neondb_owner";
        String password = "npg_yhlYTX79xePp";

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connection established successfully!");

                // Example query: Retrieve all students
                String query = "SELECT id, fname, lname FROM student";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                System.out.println("Students in the database:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    System.out.println("ID: " + id + ", First Name: " + fname + ", Last Name: " + lname);
                }
                rs.close();
                stmt.close();

                // Insert data
                String insertData = "INSERT INTO student (fname, lname) VALUES (?, ?)";
                PreparedStatement datas = conn.prepareStatement(insertData);
                datas.setString(1, "Abdurazak");
                datas.setString(2, "mohammed");
                datas.executeUpdate();
                System.out.println("Student inserted successfully.");
                conn.close();
            } else {
                System.out.println("Failed to establish connection.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error occurred.");
            e.printStackTrace();
        }
    }
}
