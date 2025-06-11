import java.sql.*; // Import all necessary JDBC classes

public class jdbcExam  {

    // Database connection details - make sure these match your MySQL setup
    static final String DB_URL = "jdbc:mysql://localhost:3306/db"; // Replace 'db' with your actual database name
    static final String USER = "root";                              // Your MySQL username
    static final String PASS = "rootroot";                          // Your MySQL password

    public static void main(String[] args) {
        Connection conn = null; // Declare Connection object outside try-catch for proper closing
        Statement stmt = null;   // Declare Statement object outside try-catch
        ResultSet rs = null;     // Declare ResultSet object outside try-catch

        try {
            // 1. Establish a connection to the database
            // DriverManager.getConnection() attempts to establish a connection to the given database URL.
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection established successfully.");

            // 2. Create a Statement object
            // A Statement object is used for executing static SQL statements and returning the results it produces.
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // 3. Define the SQL query to be executed
            String sql = "SELECT id, first_name, last_name, designation FROM employee"; // Ensure this table and columns exist in your DB
            System.out.println("Executing query: " + sql);

            // 4. Execute the query and get the ResultSet
            // executeQuery() is used for SQL statements that return a tabular result set, such as SELECT statements.
            rs = stmt.executeQuery(sql);

            // 5. Process the ResultSet
            // Iterate through the rows of the result set using rs.next()
            // rs.next() moves the cursor to the next row and returns true if there is a next row, false otherwise.
            System.out.println("Fetching records:");
            while (rs.next()) {
                // Retrieve data by column index or column name
                int id = rs.getInt("id"); // Using column name is generally more readable
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String designation = rs.getString("designation");

                // Print the retrieved data
                System.out.println("ID = " + id);
                System.out.println("FirstName = " + firstName);
                System.out.println("LastName = " + lastName);
                System.out.println("Designation = " + designation);
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            // Handle any SQL-related exceptions
            System.err.println("SQL Exception occurred: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        } finally {
            // 6. Clean up resources in a finally block
            // This ensures that resources are closed even if an exception occurs.
            try {
                if (rs != null) {
                    rs.close(); // Close the ResultSet
                    System.out.println("ResultSet closed.");
                }
            } catch (SQLException e) {
                System.err.println("Error closing ResultSet: " + e.getMessage());
            }
            try {
                if (stmt != null) {
                    stmt.close(); // Close the Statement
                    System.out.println("Statement closed.");
                }
            } catch (SQLException e) {
                System.err.println("Error closing Statement: " + e.getMessage());
            }
            try {
                if (conn != null) {
                    conn.close(); // Close the Connection
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.err.println("Error closing Connection: " + e.getMessage());
            }
        }
    }
}